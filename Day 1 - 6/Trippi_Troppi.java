import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<count;i++){
            String sentence = sc.nextLine();
            String[] word = sentence.split(" ");
            String new_word = "";
            for(String w : word){
                char[] new_arr = w.toCharArray();
                new_word += new_arr[0];
            }
            System.out.println(new_word);
        }
    }
}