import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());
        int set = 0;

        while (m-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("all")) {
                set = (1 << 20) - 1;
            } else if (cmd.equals("empty")) {
                set = 0;
            } else {
                int x = Integer.parseInt(st.nextToken());

                if (cmd.equals("add")) {
                    set |= (1 << (x - 1));
                } else if (cmd.equals("remove")) {
                    set &= ~(1 << (x - 1));
                } else if (cmd.equals("check")) {
                    sb.append((set & (1 << (x - 1))) != 0 ? 1 : 0).append('\n');
                } else if (cmd.equals("toggle")) {
                    set ^= (1 << (x - 1));
                }
            }
        }

        System.out.print(sb);
    }
}
