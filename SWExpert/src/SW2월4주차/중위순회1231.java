package SW2월4주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 중위순회1231 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src = "8\n" +
            "1 W 2 3\n" +
            "2 F 4 5\n" +
            "3 R 6 7\n" +
            "4 O 8\n" +
            "5 T\n" +
            "6 A\n" +
            "7 E\n" +
            "8 S\n" +
            "32\n" +
            "1 _ 2 3\n" +
            "2 _ 4 5\n" +
            "3 I 6 7\n" +
            "4 U 8 9\n" +
            "5 E 10 11\n" +
            "6 _ 12 13\n" +
            "7 R 14 15\n" +
            "8 M 16 17\n" +
            "9 E 18 19\n" +
            "10 C 20 21\n" +
            "11 C 22 23\n" +
            "12 N 24 25\n" +
            "13 N 26 27\n" +
            "14 E 28 29\n" +
            "15 N 30 31\n" +
            "16 O 32\n" +
            "17 P\n" +
            "18 T\n" +
            "19 R\n" +
            "20 S\n" +
            "21 I\n" +
            "22 N\n" +
            "23 E\n" +
            "24 A\n" +
            "25 D\n" +
            "26 E\n" +
            "27 G\n" +
            "28 N\n" +
            "29 E\n" +
            "30 I\n" +
            "31 G\n" +
            "32 C\n" +
            "33\n" +
            "1 _ 2 3\n" +
            "2 L 4 5\n" +
            "3 A 6 7\n" +
            "4 R 8 9\n" +
            "5 I 10 11\n" +
            "6 _ 12 13\n" +
            "7 R 14 15\n" +
            "8 W 16 17\n" +
            "9 _ 18 19\n" +
            "10 O 20 21\n" +
            "11 H 22 23\n" +
            "12 N 24 25\n" +
            "13 A 26 27\n" +
            "14 S 28 29\n" +
            "15 C 30 31\n" +
            "16 O 32 33\n" +
            "17 A\n" +
            "18 E\n" +
            "19 A\n" +
            "20 G\n" +
            "21 R\n" +
            "22 T\n" +
            "23 M\n" +
            "24 A\n" +
            "25 D\n" +
            "26 D\n" +
            "27 T\n" +
            "28 _\n" +
            "29 T\n" +
            "30 U\n" +
            "31 T\n" +
            "32 S\n" +
            "33 F\n" +
            "42\n" +
            "1 A 2 3\n" +
            "2 R 4 5\n" +
            "3 T 6 7\n" +
            "4 I 8 9\n" +
            "5 _ 10 11\n" +
            "6 F 12 13\n" +
            "7 A 14 15\n" +
            "8 T 16 17\n" +
            "9 _ 18 19\n" +
            "10 A 20 21\n" +
            "11 R 22 23\n" +
            "12 H 24 25\n" +
            "13 R 26 27\n" +
            "14 S 28 29\n" +
            "15 C 30 31\n" +
            "16 E 32 33\n" +
            "17 _ 34 35\n" +
            "18 S 36 37\n" +
            "19 E 38 39\n" +
            "20 H 40 41\n" +
            "21 D 42\n" +
            "22 B\n" +
            "23 E\n" +
            "24 T\n" +
            "25 _\n" +
            "26 I\n" +
            "27 S\n" +
            "28 _\n" +
            "29 E\n" +
            "30 R\n" +
            "31 H\n" +
            "32 D\n" +
            "33 P\n" +
            "34 H\n" +
            "35 F\n" +
            "36 R\n" +
            "37 T\n" +
            "38 S\n" +
            "39 A\n" +
            "40 C\n" +
            "41 _\n" +
            "42 N\n" +
            "36\n" +
            "1 _ 2 3\n" +
            "2 L 4 5\n" +
            "3 _ 6 7\n" +
            "4 _ 8 9\n" +
            "5 I 10 11\n" +
            "6 B 12 13\n" +
            "7 V 14 15\n" +
            "8 C 16 17\n" +
            "9 _ 18 19\n" +
            "10 O 20 21\n" +
            "11 H 22 23\n" +
            "12 R 24 25\n" +
            "13 E 26 27\n" +
            "14 O 28 29\n" +
            "15 N 30 31\n" +
            "16 E 32 33\n" +
            "17 M 34 35\n" +
            "18 O 36\n" +
            "19 A\n" +
            "20 G\n" +
            "21 R\n" +
            "22 T\n" +
            "23 M\n" +
            "24 P\n" +
            "25 O\n" +
            "26 L\n" +
            "27 M\n" +
            "28 S\n" +
            "29 L\n" +
            "30 I\n" +
            "31 G\n" +
            "32 W\n" +
            "33 L\n" +
            "34 O\n" +
            "35 E\n" +
            "36 T\n" +
            "35\n" +
            "1 Q 2 3\n" +
            "2 G 4 5\n" +
            "3 E 6 7\n" +
            "4 T 8 9\n" +
            "5 A 10 11\n" +
            "6 E 12 13\n" +
            "7 R 14 15\n" +
            "8 A 16 17\n" +
            "9 I 18 19\n" +
            "10 S 20 21\n" +
            "11 K 22 23\n" +
            "12 E 24 25\n" +
            "13 T 26 27\n" +
            "14 _ 28 29\n" +
            "15 P 30 31\n" +
            "16 R 32 33\n" +
            "17 _ 34 35\n" +
            "18 R\n" +
            "19 N\n" +
            "20 _\n" +
            "21 T\n" +
            "22 C\n" +
            "23 _\n" +
            "24 U\n" +
            "25 U\n" +
            "26 _\n" +
            "27 R\n" +
            "28 E\n" +
            "29 G\n" +
            "30 A\n" +
            "31 H\n" +
            "32 A\n" +
            "33 R\n" +
            "34 Y\n" +
            "35 S\n" +
            "49\n" +
            "1 S 2 3\n" +
            "2 V 4 5\n" +
            "3 H 6 7\n" +
            "4 W 8 9\n" +
            "5 E 10 11\n" +
            "6 C 12 13\n" +
            "7 H 14 15\n" +
            "8 W 16 17\n" +
            "9 D 18 19\n" +
            "10 H 20 21\n" +
            "11 L 22 23\n" +
            "12 R 24 25\n" +
            "13 _ 26 27\n" +
            "14 _ 28 29\n" +
            "15 L 30 31\n" +
            "16 E 32 33\n" +
            "17 O 34 35\n" +
            "18 U 36 37\n" +
            "19 H 38 39\n" +
            "20 _ 40 41\n" +
            "21 _ 42 43\n" +
            "22 N 44 45\n" +
            "23 M 46 47\n" +
            "24 _ 48 49\n" +
            "25 A\n" +
            "26 K\n" +
            "27 T\n" +
            "28 E\n" +
            "29 S\n" +
            "30 E\n" +
            "31 L\n" +
            "32 H\n" +
            "33 _\n" +
            "34 H\n" +
            "35 _\n" +
            "36 O\n" +
            "37 L\n" +
            "38 _\n" +
            "39 A\n" +
            "40 E\n" +
            "41 T\n" +
            "42 E\n" +
            "43 K\n" +
            "44 R\n" +
            "45 E\n" +
            "46 _\n" +
            "47 U\n" +
            "48 T\n" +
            "49 C\n" +
            "33\n" +
            "1 E 2 3\n" +
            "2 N 4 5\n" +
            "3 T 6 7\n" +
            "4 R 8 9\n" +
            "5 S 10 11\n" +
            "6 E 12 13\n" +
            "7 M 14 15\n" +
            "8 _ 16 17\n" +
            "9 S 18 19\n" +
            "10 _ 20 21\n" +
            "11 T 22 23\n" +
            "12 P 24 25\n" +
            "13 E 26 27\n" +
            "14 M 28 29\n" +
            "15 N 30 31\n" +
            "16 H 32 33\n" +
            "17 P\n" +
            "18 E\n" +
            "19 E\n" +
            "20 T\n" +
            "21 I\n" +
            "22 _\n" +
            "23 H\n" +
            "24 _\n" +
            "25 R\n" +
            "26 S\n" +
            "27 N\n" +
            "28 _\n" +
            "29 O\n" +
            "30 E\n" +
            "31 T\n" +
            "32 T\n" +
            "33 E\n" +
            "35\n" +
            "1 P 2 3\n" +
            "2 E 4 5\n" +
            "3 E 6 7\n" +
            "4 R 8 9\n" +
            "5 D 10 11\n" +
            "6 _ 12 13\n" +
            "7 R 14 15\n" +
            "8 O 16 17\n" +
            "9 P 18 19\n" +
            "10 O 20 21\n" +
            "11 R 22 23\n" +
            "12 S 24 25\n" +
            "13 R 26 27\n" +
            "14 _ 28 29\n" +
            "15 C 30 31\n" +
            "16 N 32 33\n" +
            "17 D 34 35\n" +
            "18 _\n" +
            "19 R\n" +
            "20 _\n" +
            "21 R\n" +
            "22 E\n" +
            "23 _\n" +
            "24 O\n" +
            "25 T\n" +
            "26 O\n" +
            "27 D\n" +
            "28 R\n" +
            "29 T\n" +
            "30 A\n" +
            "31 E\n" +
            "32 I\n" +
            "33 _\n" +
            "34 R\n" +
            "35 E\n" +
            "29\n" +
            "1 N 2 3\n" +
            "2 O 4 5\n" +
            "3 T 6 7\n" +
            "4 H 8 9\n" +
            "5 T 10 11\n" +
            "6 _ 12 13\n" +
            "7 T 14 15\n" +
            "8 E 16 17\n" +
            "9 O 18 19\n" +
            "10 Y 20 21\n" +
            "11 A 22 23\n" +
            "12 N 24 25\n" +
            "13 N 26 27\n" +
            "14 T 28 29\n" +
            "15 E\n" +
            "16 T\n" +
            "17 C\n" +
            "18 N\n" +
            "19 L\n" +
            "20 G\n" +
            "21 _\n" +
            "22 R\n" +
            "23 I\n" +
            "24 I\n" +
            "25 G\n" +
            "26 I\n" +
            "27 S\n" +
            "28 I\n" +
            "29 U";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = 10;
        for(int test_case = 1; test_case <= T; test_case++){
            N = Integer.parseInt(input.readLine());
            tree = new char[N+1];
            StringTokenizer str;
            for(int i = 1; i <= N; i++){
                str = str = new StringTokenizer(input.readLine());
                str.nextToken();
                tree[i] = str.nextToken().charAt(0);
            }
            output.append("#" + test_case + " ");
            searchTree(1);
            output.append("\n");
        }
        System.out.println(output);
    }
    static int N;
    static char[] tree;
    static void searchTree(int index){

        if(index * 2 <= N){
            searchTree(index * 2);
        }
        output.append(tree[index]);
        if(index * 2 + 1 <= N){
            searchTree(index * 2 + 1);
        }
    }
}
