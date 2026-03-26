import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(findZ(n, r, c));
    }

    static int findZ(int n, int r, int c) {
        if (n == 0) return 0;

        int half = 1 << (n - 1);
        int area = half * half;

        if (r < half && c < half) {
            return findZ(n - 1, r, c); // top left
        } else if (r < half && c >= half) {
            return area + findZ(n - 1, r, c - half); // top right
        } else if (r >= half && c < half) {
            return area * 2 + findZ(n - 1, r - half, c); // bottom left
        } else {
            return area * 3 + findZ(n - 1, r - half, c - half); // bottom right
        }
    }
}
