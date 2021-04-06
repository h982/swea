package SW3월3주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 수지의수지맞는여행7699 {
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
            StringTokenizer str = new StringTokenizer(input.readLine());
            int R = Integer.parseInt(str.nextToken());
            int C = Integer.parseInt(str.nextToken());

            map = new char[R][];
            for(int i = 0; i < R; i++)
                map[i] = input.readLine().toCharArray();

            visited = new boolean[R][C];
            speciality = new HashSet<>();

        }
    }
    static int N;
    static boolean[][] visited;
    static char[][] map;
    static HashSet<Character> speciality;
    static int[] dr =  {1, -1, 0, 0};
    static int[] dc = {0, 0, 1, -1};
    static void bfs(){

    }
}
