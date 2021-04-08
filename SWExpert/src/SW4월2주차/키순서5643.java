package SW4월2주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class 키순서5643 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src =
            "1\n" +
            "6\n" +
            "6\n" +
            "1 5\n" +
            "3 4\n" +
            "5 4\n" +
            "4 2\n" +
            "4 6\n" +
            "5 2";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            N = Integer.parseInt(input.readLine());
            M = Integer.parseInt(input.readLine());

            personArr = new Person[N+1];
            for(int i = 1; i <= N; i++)
                personArr[i] = new Person();

            StringTokenizer st;
            for(int i = 0; i < M; i++){
                st = new StringTokenizer(input.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                personArr[a].bigger.add(b);
                personArr[b].smaller.add(a);
            }
            int ans = 0;
            for(int i = 1; i <= N; i++){
                if(isOk(i))
                    ans++;
            }
            output.append("#" + test_case + " " + ans + "\n");
        }
        System.out.println(output);
    }
    static Person[] personArr;
    static int N,M;
    static boolean isOk(int num){
        Person p = personArr[num];
        Set<Integer> answer = new HashSet<>();

        Iterator iter = p.bigger.iterator();
        while(iter.hasNext()){
            countBigger((int)iter.next(), answer);
        }

        Iterator iter2 = p.smaller.iterator();
        while(iter2.hasNext()){
            countSmaller((int)iter2.next(), answer);
        }
        int size = answer.size();
        if(size == N-1)
            return true;
        return false;
    }
    static void countBigger(int from, Set<Integer> answer){
        answer.add(from);
        Iterator iter = personArr[from].bigger.iterator();
        while(iter.hasNext()){
            int temp = (int)iter.next();
            if(!answer.contains(temp)) {
                countBigger(temp, answer);
            }
        }
    }
    static void countSmaller(int from,Set<Integer> answer){
        answer.add(from);
        Iterator iter = personArr[from].smaller.iterator();
        while(iter.hasNext()){
            int temp = (int)iter.next();
            if(!answer.contains(temp)) {
                countSmaller(temp, answer);
            }
        }
    }
    static class Person {
        Set<Integer> bigger;
        Set<Integer> smaller;

        public Person(){
            bigger = new HashSet<>();
            smaller = new HashSet<>();
        }
    }
}
