package SW2월3주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 수의새로운연1493 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src = "2\n" +
            "1 5\n" +
            "3 9";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer str = new StringTokenizer(input.readLine());
            int p = Integer.parseInt(str.nextToken());
            int q = Integer.parseInt(str.nextToken());

            int[] p_loca = num2loca(p);
            int[] q_loca = num2loca(q);

            int answer = loca2num(p_loca[0]+q_loca[0], p_loca[1]+q_loca[1]);
            output.append("#" + test_case + " " + answer + "\n");
        }
        System.out.println(output);
    }
    static int[] num2loca(int num){
        int[] loca = new int[2];

        int temp = 1;
        int b_temp = 1;
        int idx = 1;
        while(temp <= num){
            b_temp = temp;
            temp += idx;
            idx++;
        }
        int diff = num - b_temp;
        loca[0] =  1 + diff;
        loca[1] = idx - 1 - diff;

        return loca;
    }
    static int loca2num(int x, int y){
        int num = 1;
        for(int i = 1; i < y; i++){
            num += i;
        }
        for(int i = y+1; i < x+y; i++){
            num += i;
        }
        return num;
    }
}
