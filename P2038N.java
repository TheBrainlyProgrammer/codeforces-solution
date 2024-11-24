import java.util.*;

public class P2038N {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String a[] = new String[t];
        for (int i = 0; i < t; i++) {
            String s = sc.next(); // 3<5
            char k[] = s.toCharArray();
            switch (k[1]) {
                case '<':
                    if (k[0] > k[2])
                        k[1] = '>';
                    else if (k[0]==k[2])
                    k[1]='=';
                    break;
                case '>':
                    if (k[0] < k[2])
                        k[1]='<';
                    else if (k[0]==k[2])
                        k[1]='=';
                    break;
                case '=':
                    if (k[0] < k[2])
                        k[1] = '<';
                    else if (k[0] > k[2])
                        k[1] = '>';
                    break;
            }
            a[i] = new String(k);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(a[i]);
        }
        sc.close();
    }
}