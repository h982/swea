package SW4월1주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class GCD8659 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src = "3\n" +
            "1\n" +
            "3\n" +
            "20";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        long[][] AB = new long[91][2];
        AB[0][0] = 1;
        AB[0][1] = 0;
        AB[1][0] = 2;
        AB[1][1] = 1;
        for(int i = 2; i <= 90; i++){
            AB[i][1] = AB[i-1][0];
            AB[i][0] = AB[i][1] + AB[i-1][1];
        }
        for(int test_case = 1; test_case <= T; test_case++){
            int K = Integer.parseInt(input.readLine());
            output.append("#" + test_case + " " + AB[K][0] + " " + AB[K][1] + "\n");
        }
        System.out.println(output);
    }
}
