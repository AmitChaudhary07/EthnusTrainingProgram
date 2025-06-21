public class spiral {
    public static void main(String[] var0) {
        int[][] arr = new int[][]{{11, 21, 42}, {63, 82, 29}, {51, 11, 7}};
        int n =arr.length;
        int top=0 ;int bottom=n-1;
        int front = 0; int back=n-1;
        while (top < bottom && front< back){
            for (int i=front; i<=back; i++){
                System.out.print(arr[top][i]+" ");
            }top++;
            for (int i=top;i<=bottom;i--){
                System.out.print(arr[i][back]+" ");

            }back--;
            for (int i =back ; i<=front; i++){ 
                System.out.print(arr[bottom][i]+" ");
            }bottom--;
            for (int i =bottom;i<=top;i--){
                System.out.print (arr[i][front]+" ");
            }front++;
        }
    }  
}
