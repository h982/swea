package SW3월1주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class 세로로말해요 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src =
            "2\n" +
            "ABCDE\n" +
            "abcde\n" +
            "01234\n" +
            "FGHIJ\n" +
            "fghij\n" +
            "AABCDD\n" +
            "afzz\n" +
            "09121\n" +
            "a8EWg6\n" +
            "P5h3kx";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            char[][] arr = new char[5][];

            int max_length = 0;
            for(int i = 0; i < 5; i++){
                arr[i] = input.readLine().toCharArray();
                max_length = Math.max(max_length, arr[i].length);
            }

            output.append("#" + test_case + " ");
            for(int i = 0; i < max_length; i++){
                for(int j = 0; j < 5; j++){
                    if(arr[j].length-1 >= i)
                        output.append(arr[j][i]);
                }
            }
            output.append("\n");
        }
        System.out.println(output);
    }
}
