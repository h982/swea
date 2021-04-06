package SW3월2주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.*;
import java.util.List;

public class contact1238 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src = "24 2 \n" +
            "1 17 3 22 1 8 1 7 7 1 2 7 2 15 15 4 6 2 11 6 4 10 4 2\n" +
            "300 42\n" +
            "42 68 35 1 70 25 79 59 63 65 6 46 82 28 62 92 96 43 28 37 92 5 3 54 93 83 22 17 19 96 48 27 72 39 70 13 68 100 36 95 4 12 23 34 74 65 42 12 54 69 48 45 63 58 38 60 24 42 30 79 17 36 91 43 89 7 41 43 65 49 47 6 91 30 71 51 7 2 94 49 30 24 85 55 57 41 67 77 32 9 45 40 27 24 38 39 19 83 30 42 34 16 40 59 5 31 78 7 74 87 22 46 25 73 71 30 78 74 98 13 87 91 62 37 56 68 56 75 32 53 51 51 42 25 67 31 8 92 8 38 58 88 54 84 46 10 10 59 22 89 23 47 7 31 14 69 1 92 63 56 11 60 25 38 49 84 96 42 3 51 92 37 75 21 97 22 49 100 69 85 82 35 54 100 19 39 1 89 28 68 29 94 49 84 8 22 11 18 14 15 10 17 36 52 1 50 20 57 99 4 25 9 45 10 90 3 96 86 94 44 24 88 15 4 49 1 59 19 81 97 99 82 90 99 10 58 73 23 39 93 39 80 91 58 59 92 16 89 57 12 3 35 73 56 29 47 63 87 76 34 70 43 45 17 82 99 23 52 22 100 58 77 93 90 76 13 1 11 4 70 62 89 2 90 56 24 3 86 83 86 89 27 18 58 33 33 70 55 22 90 \n" +
            "300 77\n" +
            "77 30 69 93 26 56 35 50 42 13 46 61 19 54 40 24 80 97 88 30 50 38 67 50 94 96 98 17 87 6 89 83 56 35 15 2 17 72 87 64 14 56 86 54 13 9 33 46 14 57 22 59 47 83 82 45 97 23 30 62 36 51 74 67 45 60 93 40 54 25 55 11 46 50 87 14 75 23 69 19 88 6 59 92 3 26 78 15 15 25 35 75 73 60 34 71 88 98 19 78 74 71 64 69 93 86 3 81 14 28 3 100 28 26 44 25 24 73 62 82 4 33 6 94 26 32 93 43 23 87 65 1 88 61 14 75 71 71 36 34 12 61 97 68 86 51 41 95 96 25 20 26 77 95 59 3 72 67 79 94 52 85 19 65 20 53 1 88 61 27 11 58 71 16 77 28 44 59 65 10 83 87 66 88 78 75 26 28 30 29 24 21 3 63 24 97 38 62 96 26 65 61 3 17 31 27 12 72 12 48 54 21 91 25 89 64 41 52 63 30 1 14 59 79 66 8 78 1 59 40 4 61 58 25 78 9 14 88 2 51 61 29 94 85 6 41 12 5 36 57 73 51 24 86 57 17 27 58 27 58 38 72 70 62 97 23 18 13 18 97 86 42 24 30 30 66 60 33 97 56 54 63 85 35 55 73 58 70 33 64 8 84 12 36 68 49 76 39 24 43 \n" +
            "300 55\n" +
            "55 12 42 76 60 26 22 71 27 35 6 84 51 99 80 2 94 35 38 35 57 94 77 6 63 49 82 1 14 42 56 56 43 63 12 78 25 79 53 44 97 74 41 14 76 73 19 11 18 33 13 96 70 32 41 89 86 91 98 90 91 46 54 15 52 41 45 59 36 60 93 6 65 82 4 30 76 9 93 98 50 57 62 28 68 42 30 41 14 75 2 78 16 84 14 93 25 2 93 60 71 29 28 85 76 87 99 71 88 48 5 4 22 64 7 64 11 72 90 41 65 43 20 14 92 5 19 33 51 6 76 40 4 23 99 48 85 49 72 65 14 76 46 13 47 79 70 63 20 86 90 45 66 41 46 9 19 71 2 24 33 73 53 88 71 64 2 4 24 28 1 70 16 66 29 44 48 89 44 38 10 64 50 82 89 43 9 61 22 59 55 89 47 91 50 44 31 21 49 68 37 84 36 27 86 39 54 30 25 49 24 60 58 67 45 56 19 27 12 26 56 2 50 97 85 16 65 43 76 14 43 97 49 73 27 7 74 30 5 6 27 13 76 94 66 37 37 42 15 95 57 53 37 39 83 56 16 32 31 42 26 12 38 87 91 51 63 35 94 54 17 53 9 63 34 55 4 35 4 57 49 25 18 14 10 29 1 81 19 59 51 56 62 65 4 77 44 10 3 62 \n" +
            "300 90\n" +
            "90 49 83 54 75 21 3 24 32 70 79 60 9 20 72 4 46 82 5 93 86 14 99 90 23 39 38 11 62 35 9 62 60 94 16 70 38 70 59 1 72 65 18 16 56 16 31 40 13 89 83 55 86 11 85 75 81 16 52 42 16 80 11 99 74 89 78 33 57 90 14 9 42 91 24 64 29 85 79 1 72 86 75 72 34 68 54 96 69 26 77 30 51 99 10 94 87 81 17 50 68 29 80 65 22 6 27 17 17 27 67 88 82 65 41 87 22 63 22 65 10 16 3 74 25 42 46 63 24 32 7 69 19 3 8 8 82 13 37 31 15 10 85 57 91 94 97 53 55 46 9 49 92 13 32 15 40 59 23 5 96 53 70 80 39 24 19 67 60 99 87 97 63 34 59 23 47 93 38 26 48 59 3 8 99 31 93 1 79 100 53 49 83 41 16 76 63 68 37 98 19 98 29 52 17 31 50 26 59 30 21 41 61 48 63 56 76 93 62 55 99 47 15 47 89 70 39 64 76 16 22 76 16 29 35 71 6 65 58 63 62 25 50 70 31 24 51 34 26 11 38 37 38 79 94 37 15 65 92 50 36 6 38 5 38 24 65 71 9 69 82 86 53 74 53 95 77 27 97 73 50 41 75 20 44 12 42 90 20 66 6 86 17 51 16 10 65 67 94 75 \n" +
            "300 10\n" +
            "10 1 96 74 90 62 73 69 59 32 69 27 11 23 75 80 11 53 83 92 96 65 75 65 3 56 61 75 73 22 23 48 78 90 6 96 95 51 44 55 82 13 73 40 29 13 63 68 9 16 9 24 60 35 5 87 20 59 46 7 67 1 68 93 88 33 57 75 48 22 84 23 32 77 84 49 24 83 19 77 21 12 83 57 91 26 25 87 78 70 44 35 78 69 69 92 97 84 29 28 27 72 98 13 4 28 9 46 9 86 39 38 44 14 2 51 29 12 51 50 93 55 70 82 66 68 14 94 35 73 73 31 2 43 78 78 71 3 65 82 91 24 38 24 80 96 70 28 43 11 83 59 27 88 71 29 52 59 14 61 84 87 43 11 73 29 35 42 19 4 68 66 39 82 58 51 15 99 59 62 64 57 8 79 90 36 66 76 87 87 34 61 31 49 29 93 34 41 67 36 11 100 38 93 83 29 53 70 45 95 9 53 48 33 36 9 65 98 44 50 16 42 90 1 13 49 24 52 75 34 92 1 55 91 98 20 81 79 32 45 41 88 100 26 84 39 93 94 53 12 61 35 41 98 86 30 41 6 92 93 11 50 79 80 72 78 74 94 21 98 27 77 91 83 79 60 19 90 60 50 25 73 81 9 68 9 78 4 71 8 97 75 23 12 20 62 57 91 64 84 \n" +
            "300 17\n" +
            "17 33 53 42 55 14 63 97 61 16 5 100 37 81 99 33 88 85 41 18 7 71 42 83 50 24 59 6 22 96 97 17 79 79 80 59 78 51 8 30 82 96 79 77 54 100 85 66 94 9 73 44 30 15 69 56 92 74 23 49 52 87 45 47 78 18 30 17 75 92 70 13 47 94 92 16 50 58 41 53 37 52 88 27 63 56 84 95 81 98 66 66 14 62 79 79 79 41 12 48 46 71 76 90 51 50 34 66 15 83 8 33 97 68 23 83 11 42 32 88 6 80 22 39 52 48 9 47 77 60 90 23 67 87 56 29 15 61 54 78 49 4 62 32 83 56 98 7 53 22 97 82 22 56 48 25 19 36 77 75 60 99 75 54 23 36 44 89 54 33 48 81 27 79 51 2 62 100 56 64 17 74 62 46 74 75 51 54 82 88 100 11 44 66 73 30 82 13 77 82 48 91 72 6 73 33 90 21 66 32 59 94 7 79 49 7 72 67 97 98 21 95 30 89 10 85 70 79 18 16 27 85 69 7 29 98 19 91 100 86 87 100 21 11 72 14 16 86 19 81 32 68 88 45 87 8 61 28 75 32 53 72 69 94 86 38 12 5 78 7 69 23 14 1 43 38 39 89 56 90 48 82 94 85 88 62 94 18 2 83 48 66 54 5 85 96 26 22 65 82 \n" +
            "300 73\n" +
            "73 7 57 44 94 81 81 69 12 14 69 52 17 80 69 41 32 34 80 64 60 54 37 96 66 75 21 36 81 77 56 26 72 9 60 57 3 33 6 41 76 63 86 63 81 37 98 3 9 81 41 77 59 94 41 47 75 74 98 81 36 73 1 8 56 67 42 89 82 69 16 97 26 10 13 37 56 63 44 43 22 23 13 49 19 69 18 15 51 91 36 60 70 96 4 41 80 100 6 92 62 82 53 54 34 30 88 43 54 84 21 15 19 45 64 30 53 65 70 71 6 48 95 88 27 77 24 41 80 91 89 11 72 46 22 71 84 90 56 79 80 7 63 36 88 97 34 89 36 80 94 91 63 66 2 6 8 68 70 35 72 58 99 46 98 19 39 45 73 64 29 65 2 24 91 5 2 28 98 93 72 64 2 64 22 66 22 46 11 96 42 23 13 52 16 56 94 39 80 83 9 55 23 8 46 39 45 91 40 55 5 24 26 79 25 82 31 34 24 95 31 47 88 46 6 17 51 90 39 64 36 98 10 31 25 9 38 75 21 73 94 56 35 62 57 7 85 76 83 20 42 33 85 80 80 84 68 37 26 19 38 29 20 78 38 92 57 96 61 2 94 33 37 81 76 8 85 75 20 91 77 42 52 30 91 75 73 92 90 88 91 40 94 54 64 82 4 6 77 80 \n" +
            "300 96\n" +
            "96 40 69 99 84 40 16 22 94 27 23 39 29 82 100 79 92 24 44 35 44 50 3 8 3 42 88 47 92 38 14 1 17 91 63 36 27 11 78 83 61 90 6 75 64 23 96 67 61 39 89 12 46 68 26 68 90 43 64 48 3 18 100 24 27 4 49 52 71 37 59 68 57 6 32 63 20 76 57 32 96 45 92 4 89 16 51 20 73 92 84 34 76 43 70 1 55 79 86 58 34 94 91 4 51 34 23 72 12 91 39 42 59 48 53 59 80 3 84 91 3 69 23 96 36 9 62 43 95 100 89 79 43 58 42 48 70 46 81 14 65 11 62 86 74 5 63 4 3 70 55 30 53 75 50 31 45 45 50 19 66 64 53 74 71 32 48 12 70 99 99 4 53 80 54 44 23 89 64 35 51 23 41 12 93 52 81 78 17 77 79 21 16 49 99 80 36 58 84 63 3 63 21 71 23 74 42 87 89 18 18 93 99 68 50 66 90 33 20 82 4 31 29 32 90 53 31 73 65 8 96 29 82 91 11 78 72 37 60 44 41 34 38 94 31 75 94 83 4 62 91 63 8 98 52 24 91 18 41 4 67 84 62 60 46 87 52 66 2 41 10 98 84 51 59 22 76 82 88 72 88 100 5 80 39 1 31 62 19 6 41 29 60 23 99 61 99 36 82 15 \n" +
            "300 68\n" +
            "68 94 97 62 47 39 71 39 77 56 18 72 61 53 59 34 56 66 27 2 35 60 94 49 74 93 94 34 38 4 91 12 95 69 28 99 90 49 80 48 50 32 70 76 99 50 37 100 24 44 32 55 62 35 86 68 17 94 5 67 54 9 24 85 93 68 49 70 31 12 15 91 28 44 5 100 75 96 7 59 90 59 10 90 48 41 19 65 76 27 90 4 67 13 41 71 77 96 42 87 52 10 88 84 86 91 51 87 56 82 29 3 78 63 25 66 73 33 86 29 47 90 79 84 26 66 61 46 79 22 56 21 28 74 35 52 76 37 35 2 38 11 75 91 57 72 81 36 46 83 26 19 74 13 38 99 6 63 18 93 40 48 47 4 32 16 40 59 30 46 95 100 46 73 76 63 73 74 81 39 98 43 9 4 78 26 35 2 79 83 70 37 79 40 39 22 27 64 78 76 25 82 1 62 63 3 49 96 85 17 38 8 94 85 45 60 22 59 44 69 78 20 58 42 92 65 24 16 73 30 42 16 16 37 58 60 1 53 94 42 30 49 28 99 25 25 75 34 86 39 71 63 30 85 10 79 24 86 1 25 94 6 13 66 68 8 78 85 5 91 35 92 22 86 35 91 43 99 87 19 22 25 98 77 55 70 9 28 94 69 67 3 39 1 20 19 91 85 40 57 ";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = 10;
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer str = new StringTokenizer(input.readLine());
            int N = Integer.parseInt(str.nextToken());
            int start = Integer.parseInt(str.nextToken());

            graph = new ArrayList[101];
            for(int i = 0; i <= 100; i++){
                graph[i] = new ArrayList<>();
            }

            str = new StringTokenizer(input.readLine());
            for(int i = 0; i < N/2; i++){
                int a = Integer.parseInt(str.nextToken());
                int b = Integer.parseInt(str.nextToken());
                if(!graph[a].contains(b))
                    graph[a].add(b);
            }

            visited = new boolean[101];
            visited[start] = true;
            output.append("#" + test_case + " " + bfs(start) + "\n");
        }
        System.out.println(output);
    }
    static boolean[] visited;
    static List<Integer>[] graph;
    static int bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        int save = 0;
        while (!queue.isEmpty()){
            int q_size = queue.size();
            save = 0;
            for(int i = 0; i < q_size; i++){
                int now = queue.poll();
                for(int j = 0; j < graph[now].size();j++){
                    int next = graph[now].get(j);
                    if(!visited[next]){
                        visited[next] = true;
                        queue.add(next);
                    }
                }
                save = Math.max(now, save);
            }
        }
        return save;
    }
}
