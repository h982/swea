package SW2월1주차;
import java.util.Arrays;
import java.util.Scanner;

public class 붕어빵가게1860 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();

            int[]times = new int[N];
            for(int i = 0; i < N; i++)
                times[i] = sc.nextInt();

            Arrays.sort(times);

            int make_count = 0;
            int remains = 0;
            boolean possible = true;
            for(int time : times){
                if(time > make_count * M)
                    time -= make_count * M;
                while(time >= M) {
                    remains += K;
                    make_count++;
                    time -=M;
                }
                if(remains > 0)
                    remains--;
                else{
                    possible = false;
                    break;
                }
            }
            System.out.println("#" + test_case + " " + (possible?"Possible" : "Impossible"));

        }
    }
}
