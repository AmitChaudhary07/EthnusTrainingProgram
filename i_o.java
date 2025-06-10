
import java.util.Scanner;

public class i_o {
    public static void main (String [] args){

    Scanner scn = new Scanner(System.in);
// integer 
    System.out.println("Enter the input for number ");
    int a = scn.nextInt();

    System.out.println("The number is :" + a );
//string
    System.out.println("Enter a word ");
    String str1 = scn.nextLine();
    
    System.out.println("The String is"+str1);
    }
}
