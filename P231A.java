import java.util.*;
public class P231A{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int d=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<3;j++){
                if(a[i][j]==1)
                c++;
            }
            if(c>=2)
            d++;
        }
        System.out.println(d);
    } 
}