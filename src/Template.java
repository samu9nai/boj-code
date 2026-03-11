/**
 * Baekjoon Online Judge 문제 풀이
 */
import java.util.*;
import java.io.*;

public class Template {
    public void solution() throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int a =  Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int b =  Integer.parseInt(st.nextToken());
        int c =  Integer.parseInt(st.nextToken());
        String d = br.readLine();

        bw.write(a + b + c + " " + d);

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws Exception {
        new Template().solution();
    }
}