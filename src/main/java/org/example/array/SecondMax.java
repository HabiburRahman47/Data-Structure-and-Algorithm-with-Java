package org.example.array;

public class SecondMax {
    public static int getSecoundMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i]>secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static int findSecoundMax(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        int dif = max-arr[0], secondMax = 0;
        for(int i=0;i<arr.length;i++){
            int dif2 = (max-arr[i]);
            if( dif2 != 0 &&  dif2 < dif ){
                secondMax = arr[i];
                dif = dif2;
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{12,34,2,34,33,1};
//        System.out.println(findSecoundMax(arr));
        System.out.println(getSecoundMax(arr));
    }
}
