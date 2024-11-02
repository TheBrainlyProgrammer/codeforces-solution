import java.util.*;

public class P71A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[]=new String[n];
        String k[]=new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            k[i] = s[i].charAt(0) + Integer.toString(s[i].length() - 2) + s[i].charAt(s[i].length() - 1);
            
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s[i].length() > 10 ? k[i] : s[i]);
        }
    }
}