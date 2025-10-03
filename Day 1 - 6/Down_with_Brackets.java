import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            
            if (n == 2) {
                System.out.println("NO");
                continue;
            }
            
            boolean fullyNested = true;
            for (int i = 0; i < n; i++) {
                if (i < n/2 && s.charAt(i) != '(') {
                    fullyNested = false;
                    break;
                }
                if (i >= n/2 && s.charAt(i) != ')') {
                    fullyNested = false;
                    break;
                }
            }
            
            if (fullyNested) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
