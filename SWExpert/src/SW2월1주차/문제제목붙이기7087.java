package SW2월1주차;
import java.util.Scanner;

public class 문제제목붙이기7087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            boolean[] alphabets = new boolean['Z'-'A' + 1];
            for(int i = 0; i < N; i++){
                char alphabet = sc.next().charAt(0);
                if(alphabet >= 'A' && alphabet <= 'Z'){
                    alphabets[alphabet - 'A'] = true;
                }
            }
            int count = -1;
            for(int i = 0; i < alphabets.length; i++){
                if(!alphabets[i]) {
                    count = i;
                    break;
                }
            }
            if(count == -1)
                count = alphabets.length;
            System.out.println("#" + test_case + " " + count);

        }
    }
}
