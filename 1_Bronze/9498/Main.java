import java.io.*;
import java.util.*;

public class Main {

    public void solution() throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        if (a >= 90) bw.write("A");
        else if (a >= 80) bw.write("B");
        else if (a >= 70) bw.write("C");
        else if (a >= 60) bw.write("D");
        else bw.write("F");

        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
