package SW2월1주차;

import java.util.Arrays;
import java.util.Scanner;
 
public class 달팽이숫자1954 {
 
    static int[]dr = {0, 1, 0, -1};
    static int[]dc = {1, 0, -1, 0};
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
 
        for (int test_case = 1; test_case <= T; test_case++) {
 
            int N = sc.nextInt();
            int[][] matrix = new int[N][N];
            boolean[][] visited = new boolean[N][N];
            int count = 1;
            int row = 0, column = 0, direction = 0;
            for (int i = 0; i < N * N; i++) {
                if(visited[row][column] == true){
                    row = row - dr[direction];
                    column = column - dc[direction];
                    direction = (direction + 1) % 4;
                    row = row + dr[direction];
                    column = column + dc[direction];
                }
 
                matrix[row][column] = count;
                visited[row][column] = true;
                count++;
                row = row + dr[direction];
                column = column + dc[direction];
 
                if(row >= N || column >= N || row < 0 || column < 0) {
                    row = row - dr[direction];
                    column = column - dc[direction];
                    direction = (direction + 1) % 4;
                    row = row + dr[direction];
                    column = column + dc[direction];
                }
            }
            System.out.println("#" + test_case);
            for(int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    System.out.print(matrix[i][j] + " ");
                System.out.println();
            }
        }
    }
}
