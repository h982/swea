package SW2월1주차;
import java.util.Scanner;

public class 부먹왕국의차원관문7964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int D = sc.nextInt();
            boolean[] isBuilt = new boolean[N + 2];

            isBuilt[0] = true;
            isBuilt[N + 1] = true;
            for(int i = 1; i < N + 1; i++)
                if(sc.nextInt() == 1)
                    isBuilt[i] = true;
                else
                    isBuilt[i] = false;

            int count = 0;
            int temp = 1;
            boolean isLeftOk = false;
            while(temp <= N){
                isLeftOk = false;
                if(isBuilt[temp] == false){
                    for(int i = 1; i < D; i++){
                        if(temp - i >= 0 )
                            if(isBuilt[temp - i] == true){
                                isLeftOk = true;
                                break;
                            }
                    }

                    if(!isLeftOk ) {
                        isBuilt[temp] = true;
                        System.out.println(temp);
                        count++;
                    }
                    temp++;
                }
                else
                    temp++;
            }

            System.out.println("#" + test_case + " " + count);

        }
    }
}
