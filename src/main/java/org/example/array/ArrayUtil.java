package org.example.array;

public class ArrayUtil {

    public void printArray(int[] arr){
        int size = arr.length;
        for (int i=0;i<size;i++){
            System.out.println("myArray["+i+"] = "+ arr[i]);
        }
    }

    public void arrayDemo(){
        int[] myArray = new int[5];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[3] = 3;
        myArray[4] = 4;
        printArray(myArray);

        System.out.println(myArray[myArray.length-1]);

    }
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.arrayDemo();
    }
}
