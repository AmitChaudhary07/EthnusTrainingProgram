import java.util.Stack;

public class insertElementAtK {
    public static void main (String args[]){
    Stack<Integer> st= new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(6);
    st.push(7);
    Stack<Integer> s= new Stack<>();
    int k = 5;
    int x =5;
    

    while (st.size()-k>=0){
        int temp = st.pop();
        s.push(temp);
    }
    st.push(x);
    while (!s.isEmpty()){
        int temp = s.pop();
        st.push(temp);
    }
    
    
    while (!st.isEmpty()){
        System.out.println(st.pop());

    }
    
}
}
