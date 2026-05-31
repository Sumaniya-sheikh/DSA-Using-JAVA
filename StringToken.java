// import java.io.*;
import java.util.*;

public class StringToken{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        String s = scan.nextLine();
            String[] ac = s.split("[!,?._'@\\s]+");
        int count = 0;
        for (String word : ac) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
        for (String word : ac) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
}
scan.close();
    }
}

