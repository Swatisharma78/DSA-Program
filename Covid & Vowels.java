/*
Description

Given a string S, find the number of substrings which contains all the vowels present in "coronavirus".


Input
Input Format

The single line consists of string S

Constraints

Length of S <=100


Output
Print count of substrings in a single line


Sample Input 1 

dangerouscovid
Sample Output 1

4
Hint

Sample 1 Explanation

Out of all possible substrings following 4 substrings have all vowels [a,i,o,u]

dangerouscovi

dangerouscovid

angerouscovi

angerouscovid  */
import java.util.*;
class Main{
    public static boolean vowel(String str, int i , int j){
        int [] arr = new int [5];
        for( int r = i; r <= j; r++){
            if ( str.charAt(r) == 'a' || str.charAt(r) == 'A'){
             arr[0] = arr[0]+1;
         }else if (str.charAt(r)=='i' || str.charAt(r)=='I'){
         arr[1] = arr[1]+1;
         }else if (str.charAt(r)=='o' || str.charAt(r)=='O'){
         arr[2] = arr[2]+1;
         }else if (str.charAt(r)=='u' || str.charAt(r)=='U'){
         arr[3] = arr[3]+1;
      }  
  }
          for ( int x=0; x<4; x++){
             if(arr[x] ==0){
              return false;
         }
     }
         return true;
 }
public static void main( String [] args){
    Scanner sc= new Scanner (System.in);
         String str = sc.next();
          int n = str.length();
           int count = 0;
      for ( int i=0; i<n; i++){
       for(int j=i+1; j<n; j++){
           if(vowel(str,i,j)){
               count++;
              }
           }
       }System.out.println(count);
    }
}
