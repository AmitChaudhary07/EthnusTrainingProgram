public class palindrome {
    public static int pali(int n){
        if ( n== 0){
            return 0;
        }
        return sum (n/10)+(n%10);
    }
    public static void main(String args[]){

        int n = 12321;
       
        System.out.println(pali(n));
    }  
}
