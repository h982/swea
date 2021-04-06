package SW2월1주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Flatten {
    // 인풋 아웃풋 정의
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = 10;

        for(int test_case = 1; test_case <= T; test_case++){
            int n = Integer.parseInt(input.readLine());
            StringTokenizer input_str = new StringTokenizer(input.readLine());
            int[] boxes = new int[100];
            for(int i = 0; i < 100; i++)
                boxes[i] = Integer.parseInt(input_str.nextToken());

            Arrays.sort(boxes);
            dumpBox(boxes,n,99, 0);
            System.out.println(Arrays.toString(boxes));
            output.append("#" + test_case + " " + (boxes[99] - boxes[0]) + "\n");
        }
        System.out.print(output);
    }
    public static void dumpBox(int[]box, int n ,int from, int to){
        if(n <= 0 || box[to] == box[from])
            return;

        if (from >= 0 && box[from] == box[from - 1])
            dumpBox(box,1, from - 1, to);
        else if (to < 100 && box[to] == box[to + 1])
            dumpBox(box,1, from, to + 1);
        else {
            box[from]--;
            box[to]++;
        }
        dumpBox(box,n - 1 , from, to);
    }
}
