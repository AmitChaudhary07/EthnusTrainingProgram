import java.util.*;

public class slidingWindow {
    public static void main(String[] args) {
        //O(n) Solution
        //int[] arr = {5,11,23,16,21,11,13 };
        
        Scanner src = new Scanner(System.in);

        System.out.println("Ehter the lenght of array");
        int n= src.nextInt();
        int []arr= new int[n];

        for (int i =0; i < n; i++){
            
            System.out.println("Enter the array at index "+i);
            arr[i]= src.nextInt();
        }
        
        int k = 3;
        int fkSUm=0;
        int maxSum=0;
        
        for (int i =0;i <k ; i ++){
            fkSUm+=arr[i];

        }
        maxSum=fkSUm;
         
        for (int i = k; i < n; i++) {
            fkSUm = fkSUm - arr[i-k]+arr[i];
            maxSum= Math.max(maxSum, fkSUm);
                
            
        }System.out.println("maxsum is " +maxSum);


    }
}
