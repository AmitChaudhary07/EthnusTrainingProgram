public class Practice {
    public static void main (String [] args){
        //find max consecutive of 0's and 1's in an array
        int[] arr = {1, 0, 1, 1,0,0,0, 0, 0, 1, 0, 0, 0, 1};
        int maxCount0 = 0, maxCount1 = 0;
        int currentCount0 = 0, currentCount1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== 0){
                currentCount0++;
                maxCount0 = Math.max(maxCount0, currentCount0);
                currentCount1= 0;

            }else {
                currentCount1++;
                maxCount1 = Math.max(maxCount1, currentCount1);
                currentCount0=0;
            }
        }
        
        
        System.out.println(Math.max(maxCount1, maxCount0));
        


    }
}
