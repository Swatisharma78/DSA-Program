/*
Description

Robbery is pretty common in dp nation.

A robber is planning to rob houses along a street. Each house has a certain amount of gold stashed, the only constraint stopping you from robbing each of them is that adjacent houses have a very smart security system connected andit will automatically alert the police if two adjacent houses were robbed  on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money the roober can rob tonightwithoutgetting caught.


Input
1<=T<=10

1<=N<=1000

1<=Ai<=100


Output
output a single integer , which is the solution to the question.


Sample Input 1 

3
2
1 100
3
2 100 99
4
100 1 1 100
Sample Output 1

100
101
200*/
import java.util.*;
public class Main{
    public static int check (int [] arr , int N , int [] dp ){ 
        if ( N <= 0 ){
           return 0;
        }
         if (dp[N]!=-1){ 
         return dp [N];
         }
        int take = arr [N-1] + check (arr , N - 2 , dp); 
        int leave = check (arr , N - 1 , dp) ;
        return dp [N] = Math.max (take , leave) ; 
         } 
         public static void main ( String [] args ) {
            Scanner sc = new Scanner (System.in);
             int t = sc.nextInt () ; 
             while (t--!= 0){ 
            int N = sc.nextInt (); 
            int [] arr = new int [N] ; 
            for ( int i = 0; i < N; i++ ) { 
            arr [i] = sc.nextInt() ; 
            } 
            int [] dp = new int [N + 1] ;
            for (int i = 0; i<N+1 ; i++){ 
                dp [i] = -1; 
                } 
            System.out.println(check(arr , N , dp));
             }
         }
    }
