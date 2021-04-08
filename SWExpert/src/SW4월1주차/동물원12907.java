package SW4월1주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class 동물원12907 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();


    public static void main(String[] args) throws IOException {

        int T = Integer.parseInt(input.readLine());

        for(int test_case = 1; test_case <= T; test_case++){
            int N = Integer.parseInt(input.readLine());

            StringTokenizer st = new StringTokenizer(input.readLine());
            int[] arr = new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);

            int cat_num = 0;
            int rabit_num = 0;
            boolean isOk = true;
            for(int i = 0; i < N; i++){
                if(arr[i] == cat_num){
                    cat_num++;
                    continue;
                }else if(arr[i] == rabit_num){
                    rabit_num++;
                    continue;
                }else{
                    isOk = false;
                    break;
                }
            }
            if(!isOk){
                output.append("#" + test_case + " " + 0 + "\n");
                continue;
            }
            int ans = 0;
            if( cat_num == rabit_num)
                ans = (int)Math.pow(2, rabit_num);
            else
                ans = (int)Math.pow(2, rabit_num) * 2;
            output.append("#" + test_case + " " + ans + "\n");
        }
        System.out.println(output);
    }
}
