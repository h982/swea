package SW2월1주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 삼성시의버스노선6485 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    static String src =
            "1\n" +
            "2\n" +
            "1 3\n" +
            "2 5\n" +
            "5\n" +
            "1\n" +
            "2\n" +
            "3\n" +
            "4\n" +
            "5";
    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());

        for(int test_case = 1; test_case <= T; test_case++){
            int N = Integer.parseInt(input.readLine());
            int[] A = new int[N];
            int[] B = new int[N];
            StringTokenizer str;
            for(int i = 0; i < N; i++){
                str = new StringTokenizer(input.readLine());
                A[i] = Integer.parseInt(str.nextToken());
                B[i] = Integer.parseInt(str.nextToken());
            }
            int P = Integer.parseInt(input.readLine());
            int[] bus_station_index = new int[P];
            for(int i = 0; i < P; i++)
                bus_station_index[i] = Integer.parseInt(input.readLine());

            int[] bus_station = new int[5001];
            for(int i = 0; i < N; i++){
                for(int j = A[i]; j <= B[i]; j++)
                    bus_station[j]++;
            }

            output.append("#" + test_case + " ");
            for(int bs : bus_station_index)
                output.append(bus_station[bs] + " ");
            output.append("\n");
        }
        System.out.println(output);
    }
}
