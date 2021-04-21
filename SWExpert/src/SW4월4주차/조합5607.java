package SW4월4주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 조합5607 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
        long[] factorial = new long[1000001];
        factorial[0] = 1;
        for(int i = 1; i <= 1000000; i++){
            factorial[i] = (i * factorial[i-1]) % 1234567891;
        }
        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer st = new StringTokenizer(input.readLine());

            int N = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());

            long ans = (factorial[N] * pow( (factorial[R]*factorial[N-R])%1234567891, 1234567891-2))%1234567891;
            output.append("#" + test_case + " " + ans + "\n");
        }
        System.out.println(output);

    }

    // a^b
    public static long pow(long a, long b){
        if(b == 0)
            return 1;
        long ans = pow(a,b/2);
        long next = (ans * ans) % 1234567891;
        if(b % 2 == 0)
            return next;
        else
            return (next * a) % 1234567891;
    }
}
