package SW2월1주차;
import java.util.Scanner;
public class 부분수열의합2817 {
    // 비트연산 전체탐색
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//
//        for(int test_case = 1; test_case <= T; test_case++){
//            int N = sc.nextInt();
//            int K = sc.nextInt();
//            int[]arr = new int[N];
//            for(int i = 0; i < N; i++)
//                arr[i] = sc.nextInt();
//
//            int count = 0;
//            int search_all = (int)Math.pow(2, N);
//            for(int i = 0; i < search_all; i++){
//                int sum = 0;
//                for(int j = 0; j < N; j++){
//                    if((i>>j & 1) == 1)
//                        sum += arr[j];
//                    if(sum > K)
//                        break;
//                }
//                if(sum == K)
//                    count++;
//            }
//            System.out.println("#" + test_case + " " + count );
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[]arr = new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = sc.nextInt();

            int count = sum(arr, K, 0, 0);

            System.out.println("#" + test_case + " " + count );
        }
    }
    public static int sum(int[] arr, int K, int sum, int count){
        if(count > arr.length - 1) {
            if(sum == K)
                return 1;
            else
                return 0;
        }
        if(sum == K)
            return 1;
        int a = sum(arr, K,sum + arr[count], count+1);
        int b = sum(arr, K,  sum, count+1);
        return a + b;
    }
}
