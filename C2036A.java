import java.util.*;

public class C2036A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String s[] = new String[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 1; j < n; j++) {
                int k = Math.abs(a[j] - a[j - 1]);
                if (k == 5 || k == 7)
                    s[i] = "YES";
                else {
                    s[i] = "NO";
                    break;
                }
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(s[i]);
        }
    }
}