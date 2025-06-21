public class snake {
    public static void main(String []args){
         int [][] arr1={{11,21,42},{63,82,29},{51,11,7}}; 

        int a=0;

        for (int i = a; i<arr1.length ;i++){
            if (a==0){
                for (int j = a; j <arr1.length; j++){
                    System.out.print(arr1[i][j] + " ");
                }

            }
            if (a==arr1.length-1){
                for (int j =0; j <arr1.length; j++){
                    System.out.print(arr1[j][i] + " ");
                }
            }
        }
        
    }
}
