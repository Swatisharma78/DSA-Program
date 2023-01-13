/*
Description

Given an array of N distinct integers. Check if this array is sorted and rotated counter-clockwise.

A sorted array is not considered as sorted and rotated, i.e., there should be at least one rotation.


Input
Input Format

First line consists of integer N

Second consists of N integers separated by spaces.

Constraints

1 <= N <= 1000


Output
Print "YES" if the array is sorted and rotated at least once else print "NO"


Sample Input 1 

6
3 4 7 9 1 2
Sample Output 1

YES 
*/
import java.lang.*;
import java.util.*;
import java.io.*;
class Main{
    public static int solve(int [] arr){
        int low = 0, high = arr.length-1;
        while( low <= high){
            int mid = low +(high-low)/2;
            if (arr[mid] < arr [high]) high = mid;
            else if ( arr [mid] > arr[high] )low= mid +1;
            else { 
                high --;
        }
    }
    return low ;
}
public static boolean check( int[] arr, int low, int high){
    for( int i = low; i<= high-1; i++){
        if (arr[i] > arr [i+1]) return false;
    }
    return arr [high] < arr[low] ? false : true;
}
public static void main (String [] args){
    Scanner sc = new Scanner ( System.in);
    int n = sc.nextInt();
    int [] arr = new int [n];
    for ( int i = 0; i< arr.length; i++) arr[i] = sc.nextInt();
    int index = solve (arr);
    if ( index == 0) System.out.println("NO");
    else{
        if (check(arr, 0 ,index-1) && check(arr,index,arr.length-1)) System.out.println("YES");
        else{
            System.out.println("NO");
        }
    }
  }
}
