import java.util.Scanner;
public class MinMaxArray {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //intializing array
        int[] arr= new int[n];
        //entering value
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
                
            }
        }
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
                
            }
        }
        System.out.println("From the given array the max is "+max);
        System.out.println("From the given array the min is "+min);
        sc.close();
    }
    
}
