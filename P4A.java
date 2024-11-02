import java.util.Scanner;
public class P4A {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print((a==1||a==2||a%2!=0)?"NO":"YES");
        sc.close();
    }
}