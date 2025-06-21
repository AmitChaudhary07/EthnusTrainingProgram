import java.util.Stack;

public class MaxElement{

    public static void main (String []args){
        Stack<Integer> s= new Stack<>();
        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        int max = 0;
        while (!s.isEmpty()){
            int temp = s.pop();
            if (temp>max){
                max = temp;
            }
        }
        
        System.out.println("Max element "+max );

    }
}