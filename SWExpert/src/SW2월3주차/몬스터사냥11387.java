package SW2월3주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 몬스터사냥11387 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src =
            "3\n" +
            "100 0 1\n" +
            "200 12 10\n" +
            "10000 100 100";
    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer str = new StringTokenizer(input.readLine());

            int D = Integer.parseInt(str.nextToken());
            int L = Integer.parseInt(str.nextToken());
            int N = Integer.parseInt(str.nextToken());
            int percent_L_D = D * L / 100;
            int damage;
            if(L == 100){
                damage = D * (N + N * (N-1) / 2);
            }else if(L == 0){
                damage = D * N;
            }
            else {
                damage = D * N + (percent_L_D * N*(N-1)/2 );
            }
            output.append("#" + test_case + " " + damage + "\n");
        }
        System.out.println(output);
    }
}
