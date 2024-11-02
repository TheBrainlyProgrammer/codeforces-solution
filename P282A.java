import java.util.*;
public class P282A{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        for(int i=0;i<n;i++){
            String s=sc.next();
            if(s.charAt(0)=='+'){
                ++x;
            }
            else if(s.charAt(1)=='+'){
                x++;
            }
            if(s.charAt(0)=='-'){
                --x;
            }
            else if(s.charAt(1)=='-'){
                x--;
            }
        }
        System.out.println(x);
    }
}