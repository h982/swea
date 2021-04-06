package SW2월2주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 안경이없어 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    static String src=
            "5\n" +
            "ABCD EFGH\n" +
            "ABCD PBZO\n" +
            "PRQO OQAD\n" +
            "ZXCV HJKL\n" +
            "BBBB BBB";
    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer str = new StringTokenizer(input.readLine());
            char[] word1 = str.nextToken().toCharArray();
            char[] word2 = str.nextToken().toCharArray();
            if(word1.length != word2.length)
                output.append("#" + test_case + " " +"DIFF" + "\n");
            else{
                boolean isOK = true;
                for(int i = 0; i < word1.length; i++){
                    for(int j = 0; j < 3; j++){
                        if(alpha[j].contains(Character.toString(word1[i]))){
                            if(alpha[j].contains(Character.toString(word2[i])))
                                break;
                            else{
                                isOK = false;
                                break;
                            }
                        }
                    }
                    if(!isOK)
                        break;
                }
                output.append("#" + test_case + " " + (isOK? "SAME":"DIFF") + "\n");
            }
        }
        System.out.println(output);
    }
    static String[] alpha = {
            "CEFGHIJKLMNSTUVWXYZ",
                "ADOPQR",
                "B" };
}
