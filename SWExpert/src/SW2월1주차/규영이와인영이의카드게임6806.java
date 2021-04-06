package SW2월1주차;
import java.util.Scanner;

public class 규영이와인영이의카드게임6806 {

    static int[]cards_A;
    static int[]cards_B;
    static int[]cards;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){
            cards_A = new int[9];
            cards_B = new int[9];
            cards = new int[18];
            for(int i = 0; i < 18; i++)
                cards[i] = i + 1;
            for(int i = 0; i < 9; i++) {
                cards_A[i] = sc.nextInt();
                cards[cards_A[i] - 1] = 0;
            }
            int idx = 0;
            for(int i = 0; i < 18; i++)
                if(cards[i] != 0)
                    cards_B[idx++] = cards[i];
            boolean[] isSelected = new boolean[9];
            int win_A = checkWin(isSelected,0 ,0, 0);
            int win_B = TOTAL_GAMES - win_A;

            System.out.println("#" + test_case + " " + "A: " + win_A +  ", B :" + win_B);
        }
    }
    static int TOTAL_GAMES = 362880;
    static int checkWin(boolean[] isSelected, int cnt, int A, int B){
        if(A >= 77){
            int sum = 1;
            for(int i = 9-cnt; i > 1; i-- )
                sum *= i;
            return sum;
        }
        else if(B >= 77 || cnt == 9){
            return 0;
        }

        int ret = 0;
        for(int i = 0; i < 9; i++){
                if(!isSelected[i]){
                    isSelected[i] = true;
                    if(cards_B[i] > cards_A[cnt])
                        ret = checkWin(isSelected, cnt+1, A, B + cards_B[i] + cards_A[cnt]);
                    else
                        ret = checkWin(isSelected, cnt+1, A + cards_B[i] + cards_A[cnt], B);
                    isSelected[i] = false;
                }
        }

        return ret;
    }
}
