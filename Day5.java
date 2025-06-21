import java.util.Scanner;
public class Day5 {

    static void myfun( String first, String last){
        

        System.out.println("Your full name is  "+ first + " " + last);
    }

    public static void main (String [] args){
        Scanner src = new Scanner (System.in);
        System.out.println("Enter the First name:  ");
        String first = src.nextLine();
        System.out.println("Enter the last name: ");
        String last = src.nextLine();

        myfun(first , last);



        
    }
}
