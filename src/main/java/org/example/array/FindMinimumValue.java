package org.example.array;

public class FindMinimumValue {

    public static int findMinimumValue(int[] arr){
        int n = arr.length;
        int min= arr[0];
        for (int i=0;i<n;i++){
            if(arr[i]<min){
                min= arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,8,3,0,7,9};
        int minValue = findMinimumValue(arr);
        System.out.println("Minimum value:"+minValue);
    }
}
