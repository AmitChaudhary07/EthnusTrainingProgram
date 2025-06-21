public class sorting {
    public static void main(String [] args){

        //binary search
        int[] arr = {1, 2,2 ,2,2,3, 4, 5};
        int target = 3;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                
                    System.out.println("Element found at index: " + mid);
                
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            } 
        }




    }
}
