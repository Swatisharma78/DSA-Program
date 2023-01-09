/*
Write code to find the absolute difference of two numbers
Sample Input-1 12,4
Sample Output-1 8
Sample Input-2 4,18
Sample Output-2 14
NOTE: It must consist of two functions 1. To find the difference 2. To find the absolute value */
public class absolute
{  
  static int d (int a, int b ){
    return a - b ;
  } 
   static int absolute (int diff) {
     if ( diff < 0 )
     return 0 - diff ;
     else return diff;}                
 
public static void main(String args[]){   
 int a = 4 , b = 18;
  int val = d (a, b);
  int ans = absolute(val);
  System.out.println(ans);  
   } 
}
