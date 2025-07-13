55
import java.util.Scanner;
public class AddDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        if(n==0){
            System.out.print("0");
        }
        int res=n%9==0?9:n%9;
        System.out.print(res);
    }
    
}
