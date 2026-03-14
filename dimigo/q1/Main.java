import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (h == 6) {
            if (m >= 30 && m <= 59) System.out.println("Yes");
            else System.out.println("No");
        } else if (h == 7 || h == 8 || (h >= 17 && h <= 21)) {
            System.out.println("Yes");
        } else if (h >= 9 && h <= 12) {
            if (m == 0 || (m >= 50 && m <= 59)) System.out.println("Yes");
            else System.out.println("No");
        } else if (h == 13 || h == 22) {
            if (m >= 0 && m <= 50) System.out.println("Yes");
            else System.out.println("No");
        } else if (h == 14 || h == 15) {
            if (m >= 40 && m <= 50) System.out.println("Yes");
            else System.out.println("No");
        } else if (h == 16) {
            if (m >= 40 && m <= 59) System.out.println("Yes");
            else System.out.println("No");
        } else System.out.println("No");
    }
}