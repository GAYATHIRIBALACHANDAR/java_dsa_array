import java.util.Scanner;
public class MinArrayElement {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total element");
        int n=sc.nextInt();
        int[] arr=new int[n];
        //entering elements
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //min element
         int min=arr[0];
        for(int i=1;i<n-1;i++){
           if(min > arr[i]) 
            min=arr[i] ;

        }
        System.out.println(min);

sc.close();
    }
    
}
