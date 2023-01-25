/*Description

You are given n trees and their heights. Your task is to write a program that calculates the maximum number of trees whose height is in increasing order. They need not be in continuous manner.

For instance, if heights of 9 trees are 10, 22, 9, 33, 21, 50, 41, 60, 80. The maximum number of trees whose height is in increasing order is 6 : (10, 22, 33, 50, 60, 80).

(9,21, 41, 60, 80) is also in increasing manner but you need to find the maximum number of trees whose height is increasing. So, the answer is 6


Input
Input Format

First line contains n

Next line contains n space separated integers which representing heights of n trees.

Constraints

n <= 1000


Output
Output Format

Output the max number of trees whose height is in increasing order


Sample Input 1 

9
10 22 9 33 21 50 41 60 80
Sample Output 1

6*/
import java.util.*;
public class Main{ 
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        int arr[]=new int[n]; 
        for (int i=0;i<n;i++){ 
        arr[i]=sc.nextInt(); 
        }
        int dp[]=new int[n]; 
        int maxValue=0;
        for (int i=0;i<n;i++){ 
            int max=0; 
            for (int j=0;j<i;j++){ 
                if(arr[j]<arr[i]){
            max=Math.max(dp[j],max); 
               }
            }
        dp[i]=max+1;
        maxValue=Math.max(maxValue, dp[i]);
     }
        System.out.println(maxValue);
    }
 }
