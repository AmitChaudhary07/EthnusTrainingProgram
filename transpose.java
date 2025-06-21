public class transpose {
    public static void main(String []args){
         int [][] arr1={{11,21,42},{63,82,29},{51,11,7}}; 

        for (int i =0; i < arr1.length; i++){
            for (int j=0; j<arr1.length ; j++){

            if (i<j){    
            int temp = arr1[i][j];
                arr1[i][j] = arr1[j][i];
                arr1[j][i]= temp;
            }
           
            }
        }

        System.out.println("Transpose of the array is :");
        for (int i =0; i < arr1.length ; i++){
            for (int j= 0; j < arr1.length ; j++){

                System.out.print(arr1[i][j] +" ");
            }System.out.println();
        }

    }
}
