package SW2월1주차;
import java.util.Scanner;

public class 화섭이의정수나열3809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = sc.nextInt();

            int number = 0;
            int num_length = 1;
            boolean end = false;
            boolean isFound = false;

            while(!end){
                isFound = false;
                int[] numList = new int[num_length];
                int num_copy = number;
                for(int i = 0; i < num_length; i++){
                    int num_size = (int)Math.pow(10,num_length-1 - i);
                    numList[i] = num_copy / num_size;
                    num_copy = num_copy % num_size;
                }
                for(int i = 0; i < N - (num_length - 1); i++){
                    if(arr[i] == numList[0]){
                        if(num_length > 1)
                            for(int j = 1; j < num_length; j++){
                                if(arr[i+j] != numList[j]) {
                                  break;
                                }
                                else if(j == num_length-1)
                                    isFound = true;
                            }
                        else{
                            isFound = true;
                            break;
                        }
                    }
                }
                if(!isFound)
                    break;
                number++;
                num_length = (int)(Math.log10(number) + 1);
            }
            System.out.println("#" + test_case + " " + number);
        }
    }
}
