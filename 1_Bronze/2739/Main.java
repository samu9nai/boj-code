/**
 * Baekjoon Online Judge 문제 풀이
 */

import java.util.*;
import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        br.close();

        for  (int i = 1; i <= 9; i++) {
            bw.write(T + " * " + i + " = " + (T * i));
            bw.newLine();
        }
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}