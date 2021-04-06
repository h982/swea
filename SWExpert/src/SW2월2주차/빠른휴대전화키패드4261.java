package SW2월2주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 빠른휴대전화키패드4261 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src ="3\n" +
            "6666 3\n" +
            "tomo mono dak\n" +
            "52 2\n" +
            "ja la\n" +
            "366 3\n" +
            "dom fon tom";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));
        String[] keyPad = {"abc", "def", "ghi",
                "jkl", "mno","pqrs", "tuv",
               "wxyz"};
        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer str = new StringTokenizer(input.readLine());
            String key_num = str.nextToken();
            int[] key = new int[key_num.length()];

            for(int i = 0; i < key.length; i++){
                key[i] = key_num.charAt(i) - '0';
            }
            int word_count = Integer.parseInt(str.nextToken());
            str = new StringTokenizer(input.readLine());
            int answer = 0;
            for(int i = 0; i < word_count; i++){
                String word = str.nextToken();
                boolean isOK = true;
                if(word.length() != key.length){
                    continue;
                }
                else{
                    for(int j = 0; j < word.length(); j++){
                        if(!keyPad[key[j]-2].contains(Character.toString(word.charAt(j)))){
                            isOK = false;
                            break;
                        }
                    }
                    if(isOK)
                        answer++;
                }
            }
            output.append("#" + test_case + " " + answer + "\n");
        }
        System.out.println(output);
    }
}
