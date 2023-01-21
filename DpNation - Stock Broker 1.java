/*
Description

on day i, price of element is pi

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.

Input
1<=T<=10

2<=N<=100000

1<=Ai<=1000*1000*1000


Output
output a single integer, the profit attained


Sample Input 1 

2
6
7 1 5 3 6 4
4
4 3 2 1
Sample Output 1

5
0*/
import java.util.*;
  class Main{ 
    public static void main (String [] args ){
        Scanner sc = new Scanner (System.in); 
        int t = sc.nextInt();
        while (t--!= 0){ 
        int n = sc.nextInt(); 
        int [] a = new int [n]; 
        for ( int i = 0 ; i < n ; i++){ 
            a[i] = sc.nextInt(); 
        }
        int max = 0; 
        int min = a[0]; 
        for ( int i = 1 ; i < n ; i++){ 
            min = Math.min(min , a[i]);
            max = Math.max (max , a[i]-min); 
        } 
        System.out.println(max);
         } 
       }
    }
