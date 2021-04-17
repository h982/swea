package SW2월1주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Stack;
 
public class 계산기3_1224 {
 
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
 
    public static void main(String[] args) throws IOException {
            int T = 10;
            for(int test_case = 1; test_case <= T; test_case++){
                input.readLine();
                char[] line = input.readLine().toCharArray();
                Stack<Character> stack = new Stack<>();
                StringBuilder newLine = new StringBuilder();
                for(char value: line){
                    if(value >= '0' && value <= '9')
                        newLine.append(value);
                    else if(value == '*' || value == '/'){
                        char a;
                        while((a=stack.peek()) == '*' || a=='/')
                            newLine.append(stack.pop());
                        stack.add(value);
                    }
                    else if(value == '+' || value =='-'){
                        char a;
                        while((a=stack.peek()) == '+' || a=='-' || a == '*' || a=='/')
                            newLine.append(stack.pop());
                        stack.add(value);
                    }
                    else if(value == '('){
                        stack.add(value);
                    }
                    else if(value == ')'){
                        char a;
                        while((a=stack.pop()) != '(')
                            newLine.append(a);
                    }
                }
                while(!stack.isEmpty())
                    newLine.append(stack.pop());
 
                char[] prefix = newLine.toString().toCharArray();
                Stack<Integer> p_value = new Stack<>();
                for(char value : prefix){
                    if(value >= '0' && value <= '9')
                        p_value.add(value - '0');
                    else if(value == '*'){
                        p_value.add(p_value.pop() * p_value.pop());
                    }
                    else if(value == '/'){
                        int b = p_value.pop();
                        int a = p_value.pop();
                        p_value.add(a / b);
                    }
                    else if(value == '+'){
                        p_value.add(p_value.pop() + p_value.pop());
                    }
                    else if(value == '-'){
                        int b = p_value.pop();
                        int a = p_value.pop();
                        p_value.add(a - b);
                    }
                }
                output.append("#" + test_case + " " + p_value.pop() + "\n");
            }
        System.out.println(output);
    }
}
