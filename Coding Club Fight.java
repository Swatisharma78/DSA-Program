/*
Description

Piyush went to fight for Coding Club. There were N soldiers with various powers. There will be Q rounds to fight and in each round Piyush's power will be varied. With power M, Piyush can kill all the soldiers whose power is less than or equal to M(<=M). After each round, All the soldiers who are dead in previous round will reborn.Such that in each round there will be N soldiers to fight. Count the number of soldiers that he can kill in each round and total sum of their powers.


Input
Input Format

First line contains N

Next N line contains N integers which represents power of N soldiers

Next line contains Q

Next Q line contains Piyush's power for each of the Q rounds

Constraints

1<=N<=10000

1<=power of each soldier<=100

1<=Q<=10000

1<=power of bishu<=100




Output
Output Format

In each line, print the number of soldiers that he can kill in each round and total sum of their powers.


Sample Input 1 

7
1 
2 
3 
4 
5 
6 
7
3
3
10
2
Sample Output 1

3 6
7 28
2 3
*/
import java.io.*;
import java.lang.*;
import java.util.*;
 class Main{
     public static int solve ( int[] a, int k){
         int low = 0, high = a.length-1 , ans = a.length;
         while( low <= high){
             int mid = low + ( high-low)/2;
             if (a[mid] > k){
                 ans = mid ;
                 high = mid-1;
             }else{
                 low = mid + 1;
             }
         }return ans;
     }
     public static int sum ( int[] a, int index){
         int sum = 0;
         for ( int i = 0; i< index ; i++) sum += a[i];
         return sum;
     }
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int [] arr = new int [n]; 
         for ( int i = 0; i < n; i++) arr[i] = sc.nextInt();
         Arrays.sort(arr);
         int sum = 0;
         int q = sc.nextInt();
         for (int i = 0; i<q; i++){
             int x = sc.nextInt();
             int index = solve(arr,x);
             sum = sum (arr,index);
             System.out.println(index + " " + sum);
             sum = 0;
         }
     }
 }
