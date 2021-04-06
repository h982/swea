package SW2월1주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Stack;


public class 쇠막대기자르기5432 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    static String src = "2\n" +
            "()(((()())(())()))(())\n" +
            "(((()(()()))(())()))(()())";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            char[] sticks = input.readLine().toCharArray();

            Stack<Character> stack = new Stack<>();
            int stick_pieces = 0;
            char prev = '(';
            for (int i = 0; i < sticks.length; i++) {
                if (sticks[i] == '(') {
                    stack.push('(');
                    prev = '(';
                } else if (prev == '(') {
                    stack.pop();
                    stick_pieces += stack.size();
                    prev = ')';
                } else {
                    stick_pieces++;
                    stack.pop();
                }
            }
            output.append("#" + test_case + " " + stick_pieces + "\n");
        }
        System.out.println(output);
    }
}
//    public static void main(String[] args) throws IOException {
//        input = new BufferedReader(new StringReader(src));
//
//        int T = Integer.parseInt(input.readLine());
//
//        for(int test_case = 1; test_case <= T; test_case++){
//            char[] sticks = input.readLine().toCharArray();
//            int stick_count = 0;
//            int stick_pieces = 0;
//            for(int i = 0; i < sticks.length; i++){
//                if(sticks[i] == '(')
//                    stick_count++;
//                else if(sticks[i-1] == '('){
//                    stick_count--;
//                    stick_pieces += stick_count;
//                }
//                else{
//                    stick_count--;
//                    stick_pieces++;
//                }
//            }
//            output.append("#" + test_case + " " +stick_pieces + "\n");
//        }
//        System.out.println(output);
//    }
//}
