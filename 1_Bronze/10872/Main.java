/**
 * Baekjoon Online Judge 문제 풀이
 */

import static java.lang.Math.abs;

import java.io.*;
import java.util.*;

public class Main {

    public void solution() throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int fac = 1;
        for (int i = 1; i < N + 1; i++) {
            fac *= i;
        }

        bw.write(String.valueOf(fac));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
