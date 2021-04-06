package SW2월1주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 항구에들어오는배4371 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    static String src = "3\n" +
            "3\n" +
            "1\n" +
            "3\n" +
            "4\n" +
            "5\n" +
            "1\n" +
            "7\n" +
            "10\n" +
            "13\n" +
            "19\n" +
            "3\n" +
            "1\n" +
            "500000000\n" +
            "999999999";

    public static void main(String[] args) throws IOException {

        input = new BufferedReader(new StringReader(src));
        int T = Integer.parseInt(input.readLine());
        for (int test_case = 1; test_case <= T; test_case++){
            int boats_num = Integer.parseInt(input.readLine());
            int[] boats = new int[boats_num];
            for(int i = 0; i < boats_num; i++)
                boats[i] = Integer.parseInt(input.readLine());

            List<Integer> boats_cycle = new ArrayList<>();
            for(int i = 1; i < boats.length; i++){
                int boat_time = boats[i] - boats[0];
                boolean newBoat = true;
                for(int j = 0; j < boats_cycle.size(); j++){
                    if(boat_time % boats_cycle.get(j) == 0) {
                        newBoat = false;
                        break;
                    }
                }
                if(newBoat)
                    boats_cycle.add(boat_time);
            }
            output.append("#" + test_case + " " + boats_cycle.size() + "\n");
        }
        System.out.println(output);
    }

}
