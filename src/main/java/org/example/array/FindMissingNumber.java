package org.example.array;

public class FindMissingNumber {
    static int findMissingNum(int[] arr){
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        for (int num : arr){
            sum = sum -num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5};
        int missingNum = findMissingNum(arr);
        System.out.println("missing number:"+missingNum);
    }
}
