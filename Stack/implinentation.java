import java.util.Stack;
public class implinentation {

    public static void main (String []args){
        Stack<Integer> s= new Stack<>();
        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        int k = 4;
        while (!s.isEmpty()){
            int temp = s.pop();
            if (k == temp){
                System.out.println("element found ");
            }
        }
        

    }
}