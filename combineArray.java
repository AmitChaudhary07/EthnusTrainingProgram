import java.lang.reflect.Array;

public class combineArray {
    public static void main (String [] args){
        int[] arr1 = {7,21,23,55};
        int[] arr2 ={12,15,33,57,63,65};

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr3=  new int [n1+n2];

        int a1=0;
        int a2=0;
        int a3=0;
        while (a1<n1 && a2<n2){
            if (arr1[a1]<=arr2[a2]){
                arr3[a3]=arr1[a1];
                a3++;
                a1++;
            }else if (arr1[a1]>arr2[a2]){
                arr3[a3] = arr2[a2];
                a3++;
                a2++; 
            }
        }

        if (a1<n1){
            for (int i= a1; i<n1; i++){
                arr3[a3]= arr1[i];
                a3++;
            }

        }
        if (a2<n2){
            for (int i= a2; i<n2; i++){
                arr3[a3]= arr2[i]
                a3++;
            }


        System.out.print("Combined array :");
        for (int i = 0; i <arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }    
        }
    }
}
