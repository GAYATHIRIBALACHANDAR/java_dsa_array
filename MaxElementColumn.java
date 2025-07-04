//find the largest element in the column
import java.util.*;
public class MaxElementColumn {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[] [] arr=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<c;i++){//c is used for traversing up to columns 
           int max=arr[0][i];//initial element as max
          for(int j=0;j<r;j++){
            if(max<arr[j][i]){
                max=arr[i][j];
            }
          }
         
         System.out.println("Maximum in column " + i + ": " + max);

        }
        sc.close();

    }
    
}
