import java.util.ArrayList;

public class usingArraylist{

    public static void main ( String[]args ){
        ArrayList<Integer> list = new ArrayList<>();

        public void push(int data){
            list.add(data);
        }
        public void pop(int data){
            if (isEmpty()){
                 list.remove(data)
            }
        }

        public void peek(){
            
            list.get(list.size()-1)
        }

    }
}