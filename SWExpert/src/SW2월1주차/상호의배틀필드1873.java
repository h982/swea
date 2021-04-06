package SW2월1주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;

public class 상호의배틀필드1873 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    static String src = "1\n" +
            "3 7\n" +
            "***....\n" +
            "*-..#**\n" +
            "#<.****\n" +
            "23\n" +
            "SURSSSSUSLSRSSSURRDSRDS";
    static int[] dr = {-1, 1, 0 ,0};
    static int[] dc = {0, 0, -1, 1};
    static char[] direction = {'^', 'v', '<', '>'};

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));
        int T = Integer.parseInt(input.readLine());

        for(int test_case = 1; test_case <= T; test_case++){
            String[] temp = input.readLine().split(" ");
            int[] map_size = {Integer.parseInt(temp[0]), Integer.parseInt(temp[1])};
            char[][] map = new char[map_size[0]][];

            for(int i = 0; i < map_size[0]; i++){
                char[] map_row = input.readLine().toCharArray();
                map[i] = map_row;
            }
            int row = 0, column = 0, dir = 0;
            for(int i = 0; i < map_size[0]; i++)
                for(int j = 0; j < map_size[1]; j++) {
                    for(int k = 0; k < direction.length; k++)
                        if(direction[k] == map[i][j]) {
                            row = i;
                            column = j;
                            dir = k;
                        }
                }
            int action_count = Integer.parseInt(input.readLine());
            char[] actions = input.readLine().toCharArray();
            for(char act : actions){
                if(act == 'U'){
                    dir = 0;
                    if(row >= 1 && map[row-1][column] == '.') {
                        map[row][column] = '.';
                        row -= 1;
                    }
                    map[row][column] = '^';
                }else if(act == 'D'){
                    dir = 1;
                    if(row < map_size[0]-1 && map[row+1][column] == '.') {
                        map[row][column] = '.';
                        row += 1;
                    }
                    map[row][column] = 'v';
                }else if(act == 'L'){
                    dir = 2;
                    if(column >= 1 && map[row][column-1] == '.') {
                        map[row][column] = '.';
                        column -= 1;

                    }
                    map[row][column] = '<';
                }else if(act == 'R'){
                    dir = 3;
                    if(column < map_size[1]-1 && map[row][column+1] == '.') {
                        map[row][column] = '.';
                        column += 1;
                    }
                    map[row][column] = '>';
                }else if(act == 'S'){
                    int s_row = row;
                    int s_col = column;
                    while(true) {
                        s_row += dr[dir];
                        s_col += dc[dir];
                        if(s_row < 0 || s_row >= map_size[0] || s_col < 0 || s_col >= map_size[1])
                            break;
                        else if(map[s_row][s_col] == '.' || map[s_row][s_col] == '-')
                            continue;
                        else if(map[s_row][s_col] == '*'){
                            map[s_row][s_col] = '.';
                            break;
                        }
                        else if(map[s_row][s_col] == '#')
                            break;
                    }
                }
            }
            output.append("#" + test_case + " ");
            for(char[] a: map) {
                for (char b : a)
                    output.append(b);
                output.append("\n");
            }
        }
        System.out.println(output);
    }
}
