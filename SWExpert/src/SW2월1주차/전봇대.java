package SW2월1주차;
import java.util.Scanner;

public class 전봇대 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];

            for(int i = 0; i < N; i++){
                A[i] = sc.nextInt();
                B[i] = sc.nextInt();
            }
            int points = 0;
            for(int i = 0; i < N; i++){
                for(int j = i + 1; j < N; j++){
                    if((A[i] - A[j]) * (B[i] - B[j]) < 0)
                        points++;
                }
            }

            System.out.println("#" + test_case + " " + points);

        }
    }
}
