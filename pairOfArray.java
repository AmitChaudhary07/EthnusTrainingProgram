public class pairOfArray {
    public static void main(String []args){

        int[] arr={ 1,2,3,4,5};
        int k = 10;
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            for (int j=0; j <arr.length; j++){
                sum = arr[i]+arr[j];
                if (sum>k){
                    System.out.print("("+arr[i]+ ","+ arr[j]+")");
                }
            }System.out.println();
        }



    } 
}
