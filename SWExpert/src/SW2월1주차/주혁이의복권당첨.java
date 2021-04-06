package SW2월1주차;
import java.util.Scanner;

public class 주혁이의복권당첨 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int M = sc.nextInt();

            String[] numbers = new String[N];
            int[] rewards = new int[N];

            for(int i = 0; i < N; i++){
                numbers[i] = sc.next();
                rewards[i] = sc.nextInt();
            }
            int reward = 0;
            String j_number;
            for(int i = 0; i < M; i++){
                j_number = sc.next();
                int find_index = -1;
                for(int k = 0; k < N; k++) {
                    for (int j = 0; j < 8; j++) {
                        if (numbers[k].charAt(j) == '*' || j_number.charAt(j) == numbers[k].charAt(j)) {
                            if(j == 7)
                                find_index = k;
                        }
                        else
                            break;
                    }
                    if(find_index >= 0) {
                        reward += rewards[find_index];
                        break;
                    }
                }
            }
            System.out.println("#" + test_case + " " + reward);

        }
    }
}
