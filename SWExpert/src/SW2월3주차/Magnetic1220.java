package SW2월3주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Magnetic1220 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();


    public static void main(String[] args) throws IOException {

        int T = 10;
        for(int test_case = 1; test_case <= T; test_case++){
            int table_size = Integer.parseInt(input.readLine());
            char[][] table = new char[table_size][];
            for(int i = 0; i < table_size; i++){
                StringTokenizer str = new StringTokenizer(input.readLine());
                char[] row = new char[table_size];
                for(int j = 0; j < table_size; j++)
                    row[j] = str.nextToken().charAt(0);
                table[i] = row;
            }
            int count = 0;
            boolean state = false;
            for(int i = 0; i < table_size; i++){
                state = false;
                for(int j = 0; j < table_size; j++){
                    if(table[j][i] == '0')
                        continue;
                    else if(!state && table[j][i] == '1')
                        state = true;
                    else if(state && table[j][i] == '2'){
                        count++;
                        state = false;
                    }
                }
            }
            output.append("#" + test_case + " " + count + "\n");
        }
        System.out.println(output);
    }
}
