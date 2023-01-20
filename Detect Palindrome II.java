/*
Description

You are given a string S. Find if the string, can be converted into a palindrome.

You are free to rearrange the string in any way you want. Rearrangement refers to the fact that the characters can be arranged in any way in the string.

Deletion or addition of characters is not allowed.


Input
The first line contains T, the number of test cases.

The first line of each test case contains N, the length of the string.

The next line contains the string.

Constraints

1 <= T <= 10

1 <= N <= 100


Output
If the string can be rearranged into a palindrome, print "Possible!", else print "Not Possible!".


Sample Input 1 

2
6
aabbcc
5
aabcd
Sample Output 1

Possible!
Not Possible!
Hint

In the first sample test case, the string can be rearranged as "acbca", which is a palindrome.

In the second sample test case, the string cannot be rearranged into a palindrome.*/
public static void detectPalII(int N, String str){
    //write your code here
    int [] fre = new int [26];
   for( int i = 0; i < str.length(); i++){
       int p = str.charAt(i)-'a';
       fre[p] +=1;
   }
   int odd = 0;
   for( int i = 0; i < 26; i++){
    if (fre[i]%2 != 0){
          odd = odd + 1;}}      
            if (odd <= 1){
       System.out.println("Possible!");
            }else{
       System.out.println("Not Possible!");}}
       
