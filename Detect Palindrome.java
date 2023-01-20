/*
Description

You are given a integernum.

You need to printYesif that integer is a palindrome or else printNo.

A palindrome is a word, number, phrase, or other sequence of characters that reads the same backward as forward, such asmadamorracecar.


Input
Input Format

First line containsnum, a integer.

Constraints

1 <= num <= 1000000


Output
PrintYesorNodepending upon the integer.


Sample Input 1 

1221
Sample Output 1

Yes
Hint

Sample 1 Explanation

We printYesas1221`is a palindrome.*/
public static void detectPalindrome(String s){
    //write your code here
      String rev = "";
      int length = s.length();
      for ( int i = length - 1; i >= 0; i-- ){
         rev = rev + s.charAt(i);}
      if (s.equals(rev)){
         System.out.println("Yes");}
      else{
         System.out.println("No");}
  }
