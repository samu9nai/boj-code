import java.io.*;
import java.util.*;

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] assigned = new boolean[31];
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            assigned[n] = true;
        }

        for (int i = 1; i < 31; i++) {
            if (assigned[i]) continue;
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
