public class arr {
    public static void main(String[] args) {
        // sum of all elements in an array
        int[] arr = {10,15,24,64,24,9,48,15,35,14,18,37,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of all elements in the array: " + sum);

        // find the max and min elements in an array

        int max = arr[0];
    
        int min = arr[0];
        for (int i =1; i<arr.length; i ++){
            if (arr[i]>max) {
                
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }

        }
        System.out.println("Max element in the array: " + max);
        System.out.println("Min element in the array: " + min);

        //count the number of even and odd elements in an array



        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even elements in the array: " + evenCount);
        System.out.println("Number of odd elements in the array: " + oddCount);

        // find the element k in array
        int k = 24;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
               System.out.println("Element " + k + "at index: " + i);
            }
        }

        // print all array element greater then m

        int m = 5;
        int[] array = {};
        for (int i = 0; i <arr.length; i ++) {
            if (arr[i] > m) {
            System.out.print( arr[i]+ " ,");
            
            }
            
        }System.out.println();

        //alternet element 
        for (int i = 0; i <arr.length; i ++) {
            if (i %2 ==0 ) {
            System.out.print( arr[i] +" ,");
            }
            
        }System.out.println();

        
        
        
        System.out.print ("reversed array:");
        
        for (int i = arr.length -1 ; i >=0 ; i --){
            System.out.print(arr[i] + " ");
        }
        System.out.println();




        // revers the array using temp veriable
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - 1 - i];
        }
        System.out.print("Reversed array using temp variable: ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();


        


        // sorted array or not 
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("The array is not sorted.");
                return;
            }
        }
        



    // add n maximum numbers of any array
        int n = 3; 
        int[] maxElements = new int[n];
        for (int i = 0; i < n; i++) {
            maxElements[i] = Integer.MIN_VALUE; // Initialize with the smallest integer
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] > maxElements[j]) {
                    // Shift smaller elements down
                    for (int k = n - 1; k > j; k--) {
                        maxElements[k] = maxElements[k - 1];
                    }
                    maxElements[j] = arr[i];
                    break;
                }
            }
        }

        System.out.print("The " + n + " maximum elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(maxElements[i] + " ");
        }
        System.out.println();
    

            
        int kItems = 5;
        int[] items = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int maxValue = 0;
        
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {
                if (items[j] < items[j + 1]) {
                    int temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }



        //bubble sort
        System.out.println("Sorted array in descending order:");
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
        // Calculate the maximum value of k items

        




       
        




    }
}

