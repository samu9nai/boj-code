/**
 * Baekjoon Online Judge 문제 풀이
 */

import java.util.*;
import java.io.*;

import static java.lang.Math.abs;

public class Main {
    public void solution() throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        for  (int i = 0; i < N; i++) {
            bw.write(String.valueOf(i + 1));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}