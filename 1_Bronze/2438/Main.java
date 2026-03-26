/**
 * Baekjoon Online Judge 문제 풀이
 */

import java.io.*;
import java.util.*;

public class Main {

    public void solution() throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= T; i++) {
            for (int j = 1; j <= i; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
