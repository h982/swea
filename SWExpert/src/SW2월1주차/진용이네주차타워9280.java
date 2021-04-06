package SW2월1주차;
import java.util.Scanner;

public class 진용이네주차타워9280 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[]cost = new int[N];
            int[]car_weight = new int[M];
            boolean[] filled = new boolean[N];
            int[] car_loca = new int[M];
            int[] wait = new int[M];

            for(int i = 0; i < N; i++)
                cost[i] = sc.nextInt();
            for(int i = 0; i < M; i++)
                car_weight[i] = sc.nextInt();

            int wait_index = 0;
            int action = 0;
            int income = 0;
            int count = M;
            do{
                action = sc.nextInt();
                if(action > 0){
                    action = action - 1;
                    for(int i = 0; i < N; i++){
                        if(!filled[i]){
                            income += (cost[i] * car_weight[action]);
                            car_loca[action] = i;
                            filled[i] = true;
                            break;
                        }
                        if(i == N-1){
                            wait[wait_index] = action;
                            wait_index++;
                        }
                    }
                }
                else{
                    action = - action - 1;
                    if(wait_index > 0){
                        income += (cost[car_loca[action]] * car_weight[wait[0]]);
                        car_loca[wait[0]] = car_loca[action];
                        for(int i = 1; i < wait_index; i++){
                            wait[i - 1] = wait[i];
                        }
                        wait_index--;
                        count--;
                    }
                    else{
                        filled[car_loca[action]] = false;
                        count--;
                    }
                }
            }while(count != 0);

            System.out.println("#" + test_case + " " + income);
        }
    }
}
