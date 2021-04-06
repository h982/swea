package SW2월1주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 민석이의과제체크하기 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    static String src = "2\n" +
            "5 3\n" +
            "2 5 3\n" +
            "7 2\n" +
            "4 6";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer str = new StringTokenizer(input.readLine());
            int N = Integer.parseInt(str.nextToken());
            int K = Integer.parseInt(str.nextToken());

            str = new StringTokenizer(input.readLine());
            boolean[] students = new boolean[N];
            for(int i = 0; i < K; i++){
                int student = Integer.parseInt(str.nextToken());
                students[student-1] = true;
            }

            output.append("#" + test_case);
            for(int i = 0; i < N; i++){
                if(!students[i])
                    output.append(" " + (i+1));
            }
            output.append("\n");
        }
        System.out.println(output);
    }
}
