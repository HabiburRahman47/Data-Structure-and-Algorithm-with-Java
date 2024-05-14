package org.example.array;

public class Palindrome {

    // method 1
    public static boolean isPalindrome(String input){
        boolean palindrome = true;
        int n = input.length();
        for (int i=0;i<n;i++){
            if(input.charAt(i) != input.charAt(n-1-i)){
                palindrome = false;
            }
        }
        return palindrome;
    }

    // method 2
    public static boolean isPalindrome2(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length-1;
        boolean isPalindrome = true;

        while (start<end){
            if (charArray[start] != charArray[end] ){
                isPalindrome = false;
            }
            start++;
            end--;
        }
        return isPalindrome;
    }
    public static void main(String[] args) {
        String value = "madam";
        if (isPalindrome2(value)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }
}
