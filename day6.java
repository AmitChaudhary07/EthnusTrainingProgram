public class day6 {
    public static void main (String []args){

        int[] arr= {11,12,13,14,15,16};

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("The array is not sorted.");
                return ;
            }

            
        }System.out.println("array is sorted");
        System.out.println();

        // find the max and min elements in an array

        int max = arr[0];
        int secondLargest= -1;
       
        for (int i =1; i<arr.length; i ++){
            if (arr[i]>max) {
                
                max = arr[i];    
            }

        }
        for (int i =1; i<arr.length; i ++){
            if (arr[i]==max){

            }else if (arr[i]>secondLargest) {
                  secondLargest = arr[i];
            }

        }

        System.out.println("the second largest is :"+secondLargest);
        System.out.println("max sum is :" +( max + secondLargest));
    
        // check is array a palindrome using for loop
        boolean isPalindrome = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else { 
            System.out.println("The array is not a palindrome.");
        }


        // right rotate an array by 1 position
        int n = 2;
        for (int j = 0; j< n; j++ ){
            int lastElement = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i -1];
    }
            arr[0] = lastElement;
            
            } 
        System.out.print("Array after right rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        
        }
        System.out.println();





    
    }
}



