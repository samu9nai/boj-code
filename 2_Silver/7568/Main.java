import java.io.*;
import java.util.*;

public class Main {

    static class Person {

        int weight;
        int height;

        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            persons[i] = new Person(
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken())
            );
        }

        int grade;
        for (int i = 0; i < n; i++) {
            grade = 1;
            for (int j = 0; j < n; j++) {
                if (
                    (persons[i].weight < persons[j].weight) &&
                    (persons[i].height < persons[j].height)
                ) grade++;
            }
            System.out.print(grade + " ");
        }
    }
}
