package SW4월2주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 가장빠른문자열타이핑3143 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src =
            "2\n" +
            "banana bana\n" +
            "asakusa sa";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(input.readLine());
            String A = st.nextToken();
            String B = st.nextToken();

            int ans = 0;
            for(int i = 0; i < A.length(); i++){
                if(A.charAt(i) == B.charAt(0) && A.length()-i >= B.length()){
                    boolean isOk = true;
                    for(int j = 1; j < B.length(); j++){
                        if(A.charAt(i+j) != B.charAt(j)){
                            isOk = false;
                            break;
                        }
                    }
                    if(isOk){
                        i += B.length()-1;
                    }
                }
                ans++;
            }
            output.append("#" + test_case + " " + ans + "\n");
        }
        System.out.println(output);
    }
}
