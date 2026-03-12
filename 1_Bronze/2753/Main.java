/**
 * Baekjoon Online Judge 문제 풀이
 */

import java.util.*;
import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) bw.write("1");
        else bw.write("0");

        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}