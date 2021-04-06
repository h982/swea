package SW2월1주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;

public class 성공기4789 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    static String src = "4\n" +
            "11111\n" +
            "09\n" +
            "110011\n" +
            "1";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());

        for(int test_case = 1; test_case <= T; test_case++){
            char[] audience = input.readLine().toCharArray();

            int extra_people = 0;
            int clap_people = 0;
            for (int i = 0; i < audience.length; i++){
               if(clap_people < i) {
                   extra_people += i - clap_people;
                   clap_people = i;
               }
               clap_people += audience[i] - '0';
            }
            output.append("#" + test_case + " " + extra_people + "\n");
        }
        System.out.println(output);
    }
}
