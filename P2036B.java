import java.util.*;
public class P2036B{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s[]=new int[t];
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int b[]=new int[k];
            int c[]=new int[k];
            for(int j=0;j<k;j++){
                b[j]=sc.nextInt();
                c[j]=sc.nextInt();
            }
            for(int j=0;j<k;j++){
                for(int l=j+1;l<k;l++){
                    if(b[j]>b[l]){
                        int temp=b[j];
                        b[j]=b[l];
                        b[l]=temp;
                        temp=c[j];
                        c[j]=c[l];
                        c[l]=temp;
                    }
                }
            }
            
            for(int j=0,d=1;j<k;){
                while(b[i]==d)
                    s[i]+=c[j++];
                
                d++;
            }
        }
        for(int i=0;i<t;i++)
            System.out.println(s[i]);
    }
}