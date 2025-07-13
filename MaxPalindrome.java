
import java.util.Scanner;

public class MaxPalindrome {
    static void findMaxPalindrome(int[] arr,int n){
       int Palindrome=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        if(isPalindrome(arr[i])){
            if(arr[i]>Palindrome){
                Palindrome=arr[i];
            }
        }
        }
        System.out.print(Palindrome);
       }
    
       static boolean isPalindrome(int num){
        int original=num;
        int reverse=0;
        while(num>0){
            int digit=num%10;
            reverse=(reverse*10)+digit;
            num=num/10;
        }
        return original==reverse;
       }


    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findMaxPalindrome(arr,n);
        sc.close();
    }
    
}
