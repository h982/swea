package SW2월2주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class 암호문1 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    static String src = "11\n" +
            "449047 855428 425117 532416 358612 929816 313459 311433 472478 589139 568205\n" +
            "7\n" +
            "I 1 5 400905 139831 966064 336948 119288 I 8 6 436704 702451 762737 557561 810021 771706 I 3 8 389953 706628 552108 238749 661021 498160 493414 377808 I 13 4 237017 301569 243869 252994 I 3 4 408347 618608 822798 370982 I 8 2 424216 356268 I 4 10 512816 992679 693002 835918 768525 949227 628969 521945 839380 479976\n" +
            "19\n" +
            "566753 244528 233616 328235 268163 292641 646305 944392 643695 385788 444752 939244 637877 325283 779273 712343 953523 846222 204307\n" +
            "5\n" +
            "I 0 4 600576 565945 486128 594841 I 0 1 150706 I 8 8 556294 697547 932203 845517 116062 300371 621038 358830 I 10 8 747039 701738 805438 502654 476665 919177 367272 859931 I 15 3 844423 973297 658751";
    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = 2;
        for(int test_case = 1; test_case <= T; test_case++){
            int N = Integer.parseInt(input.readLine());

            List<Integer> encode = new LinkedList<>();
            StringTokenizer str = new StringTokenizer(input.readLine());
            for(int i = 0; i < N; i++)
                encode.add(Integer.parseInt(str.nextToken()));
            int K = Integer.parseInt(input.readLine());
            str = new StringTokenizer(input.readLine(), "I");

            for(int i = 0; i < K; i++ ){
                String line = str.nextToken();
                StringTokenizer operation = new StringTokenizer(line);
                int x = Integer.parseInt(operation.nextToken());
                int y = Integer.parseInt(operation.nextToken());
                for(int j = 0; j < y; j++){
                    encode.add(x++, Integer.parseInt(operation.nextToken()));
                }
            }
            output.append("#" + test_case + " ");
            for(int i = 0; i < 10; i++)
                output.append(encode.get(i) + " ");
            output.append("\n");
        }
        System.out.println(output);
    }
}
