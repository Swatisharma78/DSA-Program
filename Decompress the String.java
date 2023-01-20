/*
Description

Given a string of lowercase characters and integers, decompress the string under the following rules:

- If an integer is encountered, the character just before it gets added to a final string as many times as the number

For instance, if the string is "a3b2" => the output should be "aaabb" because *a* is followed by 3, and *b* is followed by 2

Write a program that decompresses the string based on rules above


Input
Input Format

Input contains one string

Constraints

Length of string <= 100


Output
Output the decompressed string


Sample Input 1 

a3b2
Sample Output 1

aaabb*/
public static void decompressTheString(String a){
    //write your code here
    //  for(int i=0;i<a.length();i++)
    // {
    // char d = a.charAt(i);
    // int n = Character.digit(d, 10);
    // if(n>0){
    // for(int j=0;j<n;j++){
    // System.out.print(a.charAt(i-1));}}}}
   StringBuilder ans = new StringBuilder();
   for (int i = 0; i<a.length(); i++){
       if(a.charAt(i) >='1' && a.charAt(i) <= '9'){
           char l = a.charAt(i-1);
           int t = a.charAt(i)-'0';
           while (t>0){
               ans.append(l);
               t--;
           }
       }
   }
   System.out.println(ans.toString());}
