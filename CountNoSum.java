public class CountNoSum {
    public static void main(String []args){
        // count number of subarray equal to k
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        System.out.println("Number of subarrays with sum equal to " + k + " is: " + count);
        
        //count number of subarray equal to k using two pointer approach
    
        int count2 = 0;
        int sum = 0;
        int left = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            while (sum > k && left <= i) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                count2++;
            }
        }

        System.out.println("Number of subarrays with sum equal to " + k + " is: " + count);

    }
}
