package SW3월4주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class 나는개구리로소이다 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src = "8\n" +
            "crcoarkcoroakak\n" +
            "ccccrrrrooooaaaakkkk\n" +
            "karoc\n" +
            "croakcorakcroak\n" +
            "ccroak\n" +
            "croakcroakcroakcroakcroakcroakcroakcroakcroakcroak\n" +
            "ccccccccccrrrrrrrrrrooooooooooaaaaaaaaaakkkkkkkkkk\n" +
            "crcocrroaokacakkrocrakcorakoak";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            String croak = input.readLine();
            List<StringBuilder> list = new ArrayList<>();
            int croak_count = 0;
            boolean isOk = true;
            for(int i = 0; i < croak.length(); i++){
                if(croak.charAt(i) == 'c'){
                    list.add(new StringBuilder("c"));
                    continue;
                }
                out:switch (croak.charAt(i)){
                    case 'r':
                        for (int j = 0; j < list.size(); j++){
                            if(list.get(j).toString().equals("c")){
                                list.get(j).append("r");
                                break out;
                            }
                        }
                        isOk = false;
                        break;
                    case 'o':
                        for (int j = 0; j < list.size(); j++){
                            if(list.get(j).toString().equals("cr")){
                                list.get(j).append("o");
                                break out;
                            }
                        }
                        isOk = false;
                        break;
                    case 'a':
                        for (int j = 0; j < list.size(); j++){
                            if(list.get(j).toString().equals("cro")){
                                list.get(j).append("a");
                                break out;
                            }
                        }
                        isOk = false;
                        break;
                    case 'k':
                        for (int j = 0; j < list.size(); j++){
                            if(list.get(j).toString().equals("croa")){
                                croak_count = Math.max(croak_count,list.size());
                                list.remove(j);
                                break out;
                            }
                        }
                        isOk = false;
                        break;
                }
                if (!isOk)
                    break;
            }
            output.append("#" + test_case + " ");
            if(!isOk || list.size() != 0)
                output.append("-1" + "\n");
            else
                output.append(croak_count + "\n");
        }
        System.out.println(output);
    }
}
