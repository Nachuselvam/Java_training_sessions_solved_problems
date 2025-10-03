import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        int result = word1.compareTo(word2);

        if (result == 0) {
            System.out.println(0);
        } else if (result < 0) {
            System.out.println(-1);
        } else {
            System.out.println(1);
        }

        sc.close();
    }
}
