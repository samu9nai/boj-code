/**
 * Baekjoon Online Judge 문제 풀이
 */

import java.util.*;
import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        if (a > 0 && b > 0) bw.write("1");
        else if  (a < 0 && b > 0) bw.write("2");
        else if  (a < 0 && b < 0) bw.write("3");
        else bw.write("4");

        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}