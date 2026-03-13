import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char c = br.readLine().charAt(0);
        System.out.println((int) c);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}