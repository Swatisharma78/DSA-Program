/*
Description

Given an array of length N and an integer X, the task is to find the number of subsets with a sum equal to X.


Input
Input Format

First line consists of N and X separated by space.

Second line consists of N integers separated by spaces.

Constraints

1 <= N <= 20

1 <= X <= 100


Output
Print the count in a single line.


Sample Input 1 

4 10
1 2 3 4
Sample Output 1

1
Hint

Sample 1 Explanation

The possible subsets with sum 10 are : [1,2,3,4]
*/
import java.util.*;
class Main{ 
    static int count = 0; 
    static void solve(int [] arr, int index, ArrayList<Integer> s,int k){
        if(s.size() != 0){ 
            int sum =0; 
            for(int i = 0 ; i< s.size() ;i++) sum = sum + s.get(i); 
            if(sum == k) count++; 
        }
            if(index == arr.length) return; 
            for (int i = index ; i < arr.length ; i++){ 
                s.add(arr[i]);
                solve(arr,i+1,s,k); 
                s.remove(s.size()-1);
                   }
                } 
            public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
             int n = sc.nextInt(); 
             int [] arr = new int[n]; 
             int k = sc.nextInt(); 
             for(int i = 0 ; i < n; i++) arr[i] = sc.nextInt(); 
             int index = 0 ; 
             ArrayList<Integer> s = new ArrayList<Integer>(); 
             solve(arr, index,s,k); 
             System.out.println(count); 
            }
     }
