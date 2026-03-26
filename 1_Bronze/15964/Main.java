import java.io.*;
import java.util.*;

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long result = 0;
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        result = (a + b) * (a - b);

        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
