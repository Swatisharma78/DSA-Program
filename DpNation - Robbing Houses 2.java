/*
Description

Robbery is pretty common in dp nation.

A robber is planning to rob houses along a street. Each house has a certain amount of gold stashed, the only constraint stopping you from robbing each of them is that adjacent houses have a very smart security system connected andit will automatically alert the police if two adjacent houses were robbed  on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money the roober can rob tonightwithoutgetting caught.


Input
1<=T<=10

1<=N<=100000

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
class Main{
    public static void main(String args []){ 
    Scanner sc = new Scanner(System.in); 
    int t = sc.nextInt(); 
       while (t-->0){ 
        int n = sc.nextInt(); 
        int arr[] = new int[n]; 
        for ( int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(rob(arr,n));
         }
     }
        public static int rob(int arr [],int n){
            if (n==0) 
            return 0;
            if (n==1) return arr[0]; 
            if (n==2) return Math.max(arr[0],arr[1]); 
            int []dp = new int [n]; 
            dp[0]  = arr[0]; 
            dp [1] = Math.max(arr[0],arr [1]);
            for (int i = 2; i<n; i++)
            dp[i] = Math.max(arr[i] + dp[i-2], dp[i-1]);
            return dp[n-1];
           }
        }
