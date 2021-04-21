package SW4월4주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 구간합5604 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src =
            "3\n" +
            "0 10\n" +
            "8 12\n" +
            "33 1000000000000000";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        map = new HashMap<>();

        long idx = 9;
        long f9 = 45;
        long multi = 1;
        long len = 1;
        while(idx < 1000000000000000L){
            map.put(idx, multi * f9);
            idx = 10*idx + 9;
            multi = multi*10 + pow10(len++);
        }
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer st = new StringTokenizer(input.readLine());
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());

            output.append("#" + test_case + " " + (f(B) - f(A-1)) + "\n");
        }
        System.out.println(output);
    }
    static Map<Long,Long> map;
    public static long g(long n){
        if(n<=9){
            return e(n);
        }else{
            long v=pow10(len(n));
            return (n/v)*(n%v+1L)+ f(n%v);
        }
    }

    public static long f(long n) {
        if(map.containsKey(n)) {
            return map.get(n);
        }else if(n<=9){
            return e(n);
        }else{
            long v=pow10(len(n));
            map.put(n, f(n-1L-n%v)+g(n));
            return map.get(n);
        }
    }

    public static long e(long n){
        long ret = 0;
        for(int i = 1; i <= n; i++){
            ret += i;
        }
        return ret;
    }

    public static int len(long n){
        return (int)Math.log10(n);
    }

    public static long pow10(long v){
        if(v==1)
            return 10;

        long temp = pow10(v/2);
        long ret = temp * temp;

        if(v % 2 == 0)
            return ret;
        else
            return ret * 10;
    }
}
