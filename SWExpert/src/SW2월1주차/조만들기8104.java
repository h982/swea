package SW2월1주차;
import java.util.Scanner;

public class 조만들기8104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[K];
            for(int i = 0; i <arr.length; i++)
                arr[i] = 0;

            for(int i = 0; i < N; i++){
                if(i % 2 == 0)
                    for(int j = 1; j <= K; j++){
                        arr[j-1] += K * i + j;
                    }
                else
                    for(int j = 1; j <= K; j++){
                        arr[K - j] += K * i + j;
                    }
            }


            System.out.print("#" + test_case + " ");
            for(int a : arr)
                System.out.print(a + " ");
            System.out.println();
        }
    }
}
