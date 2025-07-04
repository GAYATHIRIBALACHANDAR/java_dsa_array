//when there is no dupicate values we can use this method
import java.util.*;
public class SecondMax {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        //total elements in array
        int n=sc.nextInt();
        int secondlarge=0;
        //getting elements
        int[] arr=new int[n];
         for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();
         }
         Arrays.sort(arr);
         if((n==1)||(n==2)){
            secondlarge=arr[0];
         }
         //n is greater than 2
         else{
            
                secondlarge=arr[n-2];
            
         }
         System.out.println(secondlarge);
sc.close();
    }
    
}
