package SW3월4주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 사람네트워크2 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(input.readLine());

        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer st = new StringTokenizer(input.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[][] matrix = new int[N][N];
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    matrix[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for(int k = 0; k < N; k++){
                for(int i = 0; i < N; i++){
                    for(int j = 0; j < N; j++){
                        if(i == j)
                            continue;

                        if(matrix[i][j] == 0){
                            if(matrix[i][k] != 0 && matrix[k][j] != 0)
                                matrix[i][j] = matrix[i][k] + matrix[k][j];
                        }
                        else{
                            if(matrix[i][k] != 0 && matrix[k][j] != 0)
                                matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                        }
                    }
                }
            }
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < N; i++){
                int sum = 0;
                for(int j = 0; j < N; j++){
                    sum += matrix[i][j];
                }
                min = Math.min(min, sum);
            }
            output.append("#" + test_case + " " + min + "\n");
        }
        System.out.println(output);
    }
}
