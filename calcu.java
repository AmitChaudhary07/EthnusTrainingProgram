import java.util.Scanner;
public class calcu {

    static void cal(int a , int b , String c ){

        if (c.equals("+") ){
            System.out.println("Result:" + (a + b));

        }else if (c.equals("-") ){
            System.out.println("Result:" +(a - b));

        }else if (c.equals("*")){
            System.out.println("Result:" +(a * b));

        }else if (c.equals("/") && b!=0){ 
            

            System.out.println("Result:" +(a / b));
        }else {
            System.out.println("invalid input");
        }


    }
    public static void main (String [] args ){

        Scanner src = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int a = src.nextInt();
        System.out.println("Enter the second number: ");
        int b = src.nextInt();
        src.nextLine();
        System.out.println("Enter the operator : ");
        String c = src.nextLine();

        cal( a, b, c );



    }


    
}

