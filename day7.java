public class day7 {
    public static void main(String[] args) {
        
        //move zero to the end of an array
        int[] arr1 = {0, 1, 0, 3, 12, 0, 5};
        int zeroCount = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                zeroCount++;
            }
        }
        int[] newArr = new int[arr1.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 0) {
                newArr[index++] = arr1[i];
            }
        }
        for (int i = index; i < newArr.length; i++) {
            newArr[i] = 0;
        }
        System.out.print("Array after moving zeros to the end: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // way 2
        int[] arr = {0,0,3,4,0,6,7,8,9,10,0};
        int ptr2 = arr.length-1;
        if (arr[ptr2] ==0){
                    ptr2--;
                }
        for (int i = 0; i < ptr2 ; i ++){
            if (arr[i]==0){
                int temp= arr[i];
                arr[i] = arr[ptr2];
                arr[ptr2]= temp;
                ptr2--; 
                
            }

        }
        for (int i= 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }


        //Q3 leader in the array 
        int[] arr = {16, 17, 4, 3, 5, 2};
        int maxFromRight = arr[arr.length - 1];
        System.out.print("Leaders in the array: " + maxFromRight + " ");
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
        System.out.println();


        // Q4 Xor function in array 
        int[] arr5 = {1, 1, 2, 3, 3,4 ,4, 5,};
        int Xor = arr5[0];
        for (int i = 1; i < arr5.length; i++) {
            Xor ^= arr5[i];
        } 
        System.out.println("The element that appears only once is: " + Xor);

         

        // // Q7 print elements greater then avg

        int[] arr2= {12, 9 ,11 ,18, 2};

        int sum =0;
        for (int i = 0; i < arr2.length; i ++){
            sum += arr2[i];}
        int avg = sum/arr2.length;
        System.out.println();
        System.out.println("element greater then avg ");
        
        for (int i = 0 ; i < arr2.length; i ++){
            if (arr2[i]>avg){
                System.out.print(arr2[i] + " ");
            }

        }
    
        //Q7

        int[] arr3 = {12,9,11,8,2, };

        int k = 3;
        int num = 6;
        for (int i =arr3.length; i>k; i--){
            arr3[i]= arr3[i-1];

        }
        arr3[k]= num;

        for (int i = 0; i <arr3.length; i ++){
            System.out.println(arr3[i]+" ");

        }




        





    }
}
