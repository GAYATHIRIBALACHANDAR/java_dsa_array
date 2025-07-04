//  input 3
// 1 2 3
// 4 5 6
// 7 8 9
// Your Output (stdout)

// 1 2 3 
// 4 5 6 
// 7 8 9 
// Transpose matrix is:
// 1 4 7 
// 2 5 8 
// 3 6 9 

import java.io.*;
import java.util.*;

public class TransporseMatrix{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
