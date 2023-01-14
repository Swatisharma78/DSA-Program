/*Description

You are give a strings.

Your task is to write a program that counts the number of consonants (non-vowels characters) present in the string.


Input
Input Format:

First-line contains a stringS

Constraints:

1 <= length of (S) <= 100


Output
Output one number which is the count of number of consonants present in the string.


Sample Input 1 

masaischool
Sample Output 1

6
Hint

For stringmasaischool, vowels are (highlighted in bold)

masaischool*/
public static void countConsonants(String s){
    //write your code here
    int consonants = 0;
    for (int i = 0; i < s.length(); i++) {
    char letter = s.charAt(i); 
    if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
               }else{
              consonants++;
               
               }
       }
          System.out.print(consonants);}
  
