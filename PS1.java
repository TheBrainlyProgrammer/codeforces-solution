//missing coin sum
// input 
//5
//2 9 1 2 7
// output
//6
import java.util.*;
public class PS1 {

    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of coins");
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the coin value");
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        //check for minimum missing sum
        int res=1;
        for(int i=0;i<n && a[i]<=res;i++){
            res+=a[i];
        }
        System.out.println(res);
        
    }
}