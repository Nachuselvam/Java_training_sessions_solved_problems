import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();  
        for (int i = 0; i < count; i++) {
            String word = sc.nextLine();

            if (word.length() <= 10) {
                System.out.println(word);
            } else {
                int middleCount = word.length() - 2;
                System.out.println("" + word.charAt(0) + middleCount + word.charAt(word.length() - 1));
            }
        }
    }
}
