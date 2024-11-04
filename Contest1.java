import java.util.*;

public class Contest1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s[] = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            while (!(n >= 1 && n <= 9))
                n = sc.nextInt();
            int a[] = new int[n];
            int k = 9;
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                while (!(a[j] >= 0 && a[j] <= 9))
                    a[j] = sc.nextInt();
                k = Math.min(k, a[j]);
            }
            int p = 1;
            for (int j = 0; j < n; j++) {
                if (k == a[j]) {
                    p *= a[j] + 1;
                    k = 10;
                } else
                    p *= a[j];
            }
            s[i] = p;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(s[i]);
        }
    }
}