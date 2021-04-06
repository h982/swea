package SW2월1주차;
import java.util.Scanner;

public class 기차사이의파리 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){
            double distance = sc.nextInt();
            int train_a = sc.nextInt();
            int train_b = sc.nextInt();
            int fly = sc.nextInt();

            boolean AtoB = true;
            double time;
            double total_dist = 0;

            while(distance > 0.0000001){
                if(AtoB) {
                    time = ((double) distance) / (fly + train_b);
                    total_dist += time * fly;
                    AtoB = false;
                }
                else{
                    time = ((double) distance) / (fly + train_b);
                    total_dist += time * fly;
                    AtoB = true;
                }
                distance -= time * (train_a + train_b);
            }
            System.out.printf("#%d %.6f", test_case, total_dist);

        }
    }
}
