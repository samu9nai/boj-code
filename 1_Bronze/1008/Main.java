import java.io.*;
import java.util.*;

public class Main {

    public void solution() throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        bw.write(A / B + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
