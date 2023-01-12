/*Description

You are given an array of N unsorted numbers. Your task is to write BUBBLE SORT such that numbers present in the array gets sorted.

USING ANY OTHER ALGORITHM OR USING IN BUILT SORT FUNCTION WOULD LEAD TO YOUR DISQUALIFICATION


Input
Input Format:

First line of input contains N

Second line of input contains N numbers

Constraints:

N < 500


Output
Output the numbers given after sorting it in increasnig order


Sample Input 1 

5
3 5 0 9 8
Sample Output 1

0 3 5 8 9*/
import java.util.*;  
public class Main  
{  
   public static void main(String args[])  
   {  
        Scanner scan = new Scanner(System.in); 
       int n, i, j, x;  
        n = scan.nextInt(); 
      int[] array = new int[n];
      for(i=0; i<n; i++)
      {
         array[i] = scan.nextInt();
      }
      for(i=0; i<(n-1); i++)
      {
         for(j=0; j<(n-i-1); j++)
         {
            if(array[j]>array[j+1])
            {
               x = array[j];
               array[j] = array[j+1];
               array[j+1] = x;
            }
         }
      }
          for(i=0; i<n; i++)
         System.out.print(array[i]+ " ");
   }
}
