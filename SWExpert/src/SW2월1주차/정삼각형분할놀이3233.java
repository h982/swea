package SW2월1주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정삼각형분할놀이3233 {
    // 인풋 아웃풋 정의
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(input.readLine());

        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer input_str = new StringTokenizer(input.readLine());
            int A = Integer.parseInt(input_str.nextToken());
            int B = Integer.parseInt(input_str.nextToken());

            int sum = 0;
            for(int i = 1; i <= A/B; i++){
                sum += i;
                sum += i - 1;
            }

            output.append("#" + test_case + " " + sum + "\n");

        }
        System.out.print(output);
    }
}
