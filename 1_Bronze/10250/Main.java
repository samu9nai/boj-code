import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int floor = n % h == 0 ? h : n % h;
            int room = (floor * 100) + (n / h) + (floor % h == 0 ? 0 : 1);

            sb.append(room).append("\n");
        }

        System.out.println(sb);
    }
}
