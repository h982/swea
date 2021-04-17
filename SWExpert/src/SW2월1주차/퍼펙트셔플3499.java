package SW2월1주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;
 
public class 퍼펙트셔플3499 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
 
    public static void main(String[] args) throws IOException {
 
        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            int N = Integer.parseInt(input.readLine());
            StringTokenizer str = new StringTokenizer(input.readLine());
            String[] cards = new String[N];
 
            for(int i = 0; i < N; i++)
                cards[i] = str.nextToken();
 
            output.append("#" + test_case + " ");
            int iter = N/2;
            if(N % 2 == 0) {
                for (int i = 0; i < iter; i++) {
                    output.append(cards[i] + " ");
                    output.append(cards[i + iter] + " ");
                }
                output.append("\n");
            }
            else{
                for (int i = 0; i < iter; i++) {
                    output.append(cards[i] + " ");
                    output.append(cards[i + iter + 1] + " ");
                }
                output.append(cards[iter] + "\n");
            }
        }
        System.out.println(output);
    }
}
