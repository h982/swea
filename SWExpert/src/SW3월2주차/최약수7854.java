package SW3월2주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.HashSet;

public class 최약수7854 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src =
            "3\n" +
            "2\n" +
            "100\n" +
            "1000000000";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            int X = Integer.parseInt(input.readLine());
            HashSet<Integer> set = new HashSet<>();
            int idx = 10;
            int five = 0;
            int two = 0;
            int temp = idx;
            while(temp % 5 == 0){
                temp /= 5;
                five++;
            }
            while (temp % 2 == 0){
                temp /= 2;
                two++;
            }
            for(int i = 0; i <= five; i++){
                for(int j = 1; j <= five; j++){
                    int a = (int)(Math.pow(2, i) * Math.pow(5, j));
                    if(a <= X)
                        set.add(a);
                }
            }


            output.append("#" + test_case + " " + set.size() + "\n");
        }
        System.out.println(output);
    }
}
