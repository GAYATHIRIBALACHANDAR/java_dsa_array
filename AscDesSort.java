import java.util.Scanner;

public class AscDesSort {
    static void Sort(int n,int[] arr){
        int mid=n/2;
        for(int i=0;i<=mid;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=n-1;i>mid;i--){
            System.out.print(arr[i]+" ");
        }
    
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Sort(n,arr);
        sc.close();
        
    }
    
}
