package SW3월1주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 현주의상자바꾸기5789 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src =
            "1\n" +
            "5 2\n" +
            "1 3\n" +
            "2 4";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer str = new StringTokenizer(input.readLine());
            int N = Integer.parseInt(str.nextToken());
            int Q = Integer.parseInt(str.nextToken());
            int[] arr = new int[N];

            for(int i = 1; i <= Q; i++){
                str = new StringTokenizer(input.readLine());
                int L = Integer.parseInt(str.nextToken());
                int R = Integer.parseInt(str.nextToken());
                for(int j = L-1; j < R; j++){
                    arr[j] = i;
                }
            }
            output.append("#" + test_case);
            for(int num : arr){
                output.append(" " + num);
            }
            output.append("\n");
        }
        System.out.println(output);
    }
}
