import java.util.*;
public class Contest2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s[]=sc.next().split(":");
        //find nearest palindrome time
        int h=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        int c=0;
        while(true){
            if(h/10==m%10&&h%10==m/10){
                break;
            }
            if(m==59){
                m=0;   //case of last minute
                h++;
            }
            else
                m++;   //time-travelling
            if(h==24){
                h=0;   //case of midnight
            }
            c++;
        }
        System.out.println(c);
    }
}