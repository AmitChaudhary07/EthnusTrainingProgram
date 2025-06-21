import java.util.Scanner;

public class DAY4 {
    public static void main(String [] args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the value of n ");
    int n = scn.nextInt();
    
    for (int i = 0 ; i <n ; i ++){
        for (int j = 0 ; j < n ; j++){
            System.out.print(" "+(i +j));
        }
        System.out.println(" ");
    }

    // for (int i = 0 ; i < n ;i ++){
    //     for (int j =0 ; j <=i; j++){
    //         System.out.print("* ");

    //     }
    //     System.out.println();

    
    // print patterns in square form

    // for (int i = 0 ; i < n ; i ++){
    //     for (int j = 0 ; j < n ; j++){
    //         if (i == 0 || i == n-1 || j == 0 || j == n-1){
    //             System.out.print(" "+(i +j) );
                
    //         } else {
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }

    
    //     // print pattern of pyramid 
    // for (int i = 0 ; i < n ; i ++){
    //     for (int j = 0 ; j < n-i-1 ; j++){
    //         System.out.print(" ");
    //     }
    //     for (int j = 0 ; j <= i ; j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    // //pattern in X;
    //  for (int i = 0 ; i < n ; i ++){
    //      for (int j = 0 ; j < n ; j++){
    //             if (i == j || i + j == n - 1){
    //                 System.out.print("* ");
    //             } else {
    //                 System.out.print("  ");
    //             }
    //         }
    //     System.out.println();




    //     for (int i = 0 ; i < n ; i ++){
    //         for (int j = 0 ; j < n ; j++){
    //             if (i == 0 || i == n-1 || j == 0 || j == n-1){
    //                 System.out.print("*" );
                    
    //             } else {
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    // }
    


    for (int i =n ; i<0; i ++){
        for (int j=i )

    }


}

}





