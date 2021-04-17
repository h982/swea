package SW2월1주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
 
public class 괄호짝짓기1218 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
 
    public static void main(String[] args) throws IOException {
        int T = 10;
 
        for(int test_case = 1; test_case <= T; test_case++){
            int N = Integer.parseInt(input.readLine());
            char[]gaulho_array = input.readLine().toCharArray();
            int[] gaulho_count = new int[4];
 
            boolean isOk = true;
            for(char gaulho : gaulho_array){
                if(gaulho == '('){
                    gaulho_count[0]++;
                }else if(gaulho == '['){
                    gaulho_count[1]++;
                }else if(gaulho == '{'){
                    gaulho_count[2]++;
                }else if(gaulho == '<'){
                    gaulho_count[3]++;
                }else if(gaulho == ')'){
                    gaulho_count[0]--;
                }else if(gaulho == ']'){
                    gaulho_count[1]--;
                }else if(gaulho == '}'){
                    gaulho_count[2]--;
                }else if(gaulho == '>'){
                    gaulho_count[3]--;
                }
                for(int cnt : gaulho_count)
                    if(cnt < 0){
                        isOk = false;
                        break;
                    }
                if(!isOk)
                    break;
            }
 
            for(int cnt : gaulho_count)
                if(cnt != 0){
                    isOk = false;
                    break;
                }
            output.append("#" + test_case + " " + (isOk? 1: 0) + "\n");
        }
        System.out.println(output);
    }
}