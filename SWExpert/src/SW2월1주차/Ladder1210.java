package SW2월1주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ladder1210 {
    // 인풋 아웃풋 정의
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int T = 10;
        for(int test_case = 1; test_case <= T; test_case++){
            input.readLine();
            int[][] map = new int[100][];
            StringTokenizer input_str;
            for(int i = 0; i < 100; i++) {
                input_str = new StringTokenizer(input.readLine());
                int[]temp = new int[100];
                for (int j = 0; j < 100; j++)
                    temp[j] = Integer.parseInt(input_str.nextToken());
                map[i] = temp;
            }

            for(int i = 0; i < 100; i++){
                if(map[0][i] == 0)
                    continue;
                int r = 0;
                int c = i;
                while(r < 99){
                    if(c+1 < 100 && map[r][c + 1] == 1)
                        do{
                            c++;
                            if(map[r+1][c] == 1) {
                                r++;
                                break;
                            }
                        }while(c+1 < 100 && map[r][c + 1] == 1);
                    else if(c-1 >= 0 && map[r][c -1] == 1)
                        do{
                            c--;
                            if(map[r+1][c] == 1) {
                                r++;
                                break;
                            }
                        }while(c-1 >= 0 && map[r][c -1] == 1);
                    else
                        r++;
                }
                if(map[r][c] == 2){
                    output.append("#" + test_case + " " + i + "\n");
                    break;
                }
            }
        }
        System.out.print(output);
    }

}
