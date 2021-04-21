package SW4월4주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 방향전환8382 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer st = new StringTokenizer(input.readLine());
            int[] loc = new int[4];
            for(int i = 0; i < 4; i++){
                loc[i] = Integer.parseInt(st.nextToken());
            }
            int a = Math.abs(loc[0] - loc[2]);
            int b = Math.abs(loc[1] - loc[3]);

            int M = Math.max(a, b);
            int m = a + b - M;


            if(M == m){
                output.append("#" + test_case + " " + (M+m) + "\n");
            }else if(M - m == 1){
                output.append("#" + test_case + " " + (M+m) + "\n");
            }else{
                output.append("#" + test_case + " " + (M+m+((M-m)/2) * 2) + "\n");
            }
        }
        System.out.println(output);
    }
}
