package SW3월3주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 재관이의대량할인4050 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src =
            "2\n" +
            "4\n" +
            "3 2 3 2\n" +
            "6\n" +
            "6 4 5 5 5 5";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            N = Integer.parseInt(input.readLine());
            clothes = new int[N];
            StringTokenizer str = new StringTokenizer(input.readLine());
            for(int i = 0; i < N; i++)
                clothes[i] = Integer.parseInt(str.nextToken());

            Arrays.sort(clothes);
            int sum = 0;
            for(int i = 0; i < N; i++){
                if(i % 3 == 2)
                    continue;
                sum += clothes[N-i-1];
            }
            output.append("#" + test_case + " " + sum + "\n");
        }
        System.out.println(output);
    }
    static int N;
    static int[] clothes;
}
