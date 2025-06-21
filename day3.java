import java.util.Scanner;

public class day3 {
    public static void main(String[] args){

    // sum of natural numbers ,input by use 
    Scanner scn = new Scanner(System.in);
    // System.out.println("Enter the number to find sum of natural numbers");
    // int n = scn.nextInt();
    // int sum = 0;
    // for (int i = 1; i <= n; i++) {
    //     sum += i;
    // }
    // System.out.println(" sum of natural numbers is: " + sum);

    // multiplication table of a number, input by user
    // System.out.println("Enter the number to find multiplication table");
    // int m = scn.nextInt();
    // System.out.println("Multiplication table of " + m + ":");
    // for (int i = 1; i <= 10; i++) {
    //     System.out.println(m + " x " + i + " = " + (m * i));
    // }
    
    // // factorial of a number, input by user
    // System.out.println("Enter the number to find factorial");
    // int n = scn.nextInt();
    // int factorial = 1;
    // for (int i = 1; i <= n; i++) {
    //     factorial *= i;
    // }
    // System.out.println("Factorial of " + n + " is: " + factorial);


    // sum of n odd numbers, input by user
    // System.out.println("Enter the number of odd numbers to sum");
    // int num = scn.nextInt();
    // int sum = 0;
    // for (int i = 1, count = 0; count < num; i += 2, count++) {
    //     sum += i;
    // }
    // System.out.println("Sum of first " + num + " odd numbers is: " + sum);

    // find the number of digits in a number
    // System.out.println("Enter the number to find number of digits");
    // int n = scn.nextInt();
    // int count = 0;
    // int sum = 0;
    // int revnum = 0 ;
    // for (int i = n; i > 0; i /= 10) {
    //     count++;
    //     int newval= i%10;
    //     revnum = revnum*10+newval;

    //     sum += i % 10; 
    
    
    // }
    // System.out.println(revnum);
    // System.out.println("Number of digits in " + n + " is: " + count);
    // System.out.println("Sum of digits in " + n + " is: " + sum);
    // 
    
    // find the miximum digit in a number 
    System.out.println("Enter the number to find maximum digit");
    int n = scn.nextInt();
    int maxDigit = 0;
    int Even = 0;
    int odd =0;
    for (int i = n ; i > 0; i /= 10){
        int currentDigit = i % 10;
        if (currentDigit%2==0 ){
            Even++;
        }else 
            odd++;

        
        if (currentDigit > maxDigit){
            maxDigit = currentDigit;

        }

    }
    System.out.println(maxDigit);
    System.out.println("no of Even: "+ Even);
    System.out.println("no of odd: "+ odd);





}
}








 // Code here
        while (n>0){
            
            int num = n%10;
            n/= 10;
            
            rev = rev*10+num;
        }return rev;