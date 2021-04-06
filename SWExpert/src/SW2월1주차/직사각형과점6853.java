package SW2월1주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 직사각형과점6853 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    static String src = "1\n" +
            "0 0 2 2\n" +
            "4\n" +
            "-1 -1\n" +
            "0 0\n" +
            "1 1\n" +
            "2 2";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer str = new StringTokenizer(input.readLine());
            int[] point_X = new int[2];
            int[] point_Y = new int[2];

            point_X[0] = Integer.parseInt(str.nextToken());
            point_Y[0] = Integer.parseInt(str.nextToken());
            point_X[1] = Integer.parseInt(str.nextToken());
            point_Y[1] = Integer.parseInt(str.nextToken());

            Arrays.sort(point_X);
            Arrays.sort(point_Y);
            int N = Integer.parseInt(input.readLine());

            int temp_x, temp_y;
            int in = 0, out = 0, on = 0;
            for(int i = 0; i < N; i++){
                str = new StringTokenizer(input.readLine());
                temp_x = Integer.parseInt(str.nextToken());
                temp_y = Integer.parseInt(str.nextToken());

                if(temp_x < point_X[0] || temp_x > point_X[1]
                        || temp_y < point_Y[0] || temp_y > point_Y[1] )
                    out++;
                else if((temp_x > point_X[0] && temp_x < point_X[1])
                && (temp_y > point_Y[0] && temp_y < point_Y[1]))
                    in++;
                else
                    on++;
            }
            output.append("#" + test_case + " " + in + " " + on + " " + out + "\n");
        }
        System.out.println(output);
    }
}
