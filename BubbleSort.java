 import java.util.*;
public class BubbleSort {
    static void BubbleSort(int n, int[] arr){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                   int  temp=arr[j];
                   
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter array elements; ");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        BubbleSort(n,arr);
        System.out.println("Sorted array");
        for(int i:arr){
            
            System.out.print(i+" ");
        }
        sc.close();
    }
    
}
