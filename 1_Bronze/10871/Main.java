import java.io.*;
import java.util.*;

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(st.nextToken());
            if (k < X) bw.write(k + " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
