package org.example.array;

public class MoveAllZeros {

    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //method 1
    public static int[] movesZerosM1(int[] arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i] ==0 && arr[j]>0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    //method 2
    public static int[] moveZerosM2(int[] arr){
        int n = arr.length;
        int j=0;
        for (int i=0;i<n;i++){
            if (arr[i] != 0 && arr[j] == 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            if (arr[j] != 0){
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{8,1,2,0,1,0,3};
        int[] result = movesZerosM1(arr);
        System.out.println("By method(1):");
        printArray(result);
        System.out.println("By method(2):");
        int[] arr2 = new int[]{8,1,2,0,1,0,3};
        int[] result2 = moveZerosM2(arr2);
        printArray(result2);
    }
}
