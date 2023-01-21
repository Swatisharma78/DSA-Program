/*Description

Given an unsorted array of size, N. Find the first element in the array such that all of its left elements are smaller and all right elements to it are greater than it.

Note: Left and right side elements can be equal to the required element. And extreme elements cannot be required element.


Input
Input Format

The first line contains an integer n denoting the size of the array and the second line contains n space separated array elements.

Constraints

n <= 1000

Ai <= 10000




Output
For each test case, in a new line print the required element. If no such element present in the array then print -1.


Sample Input 1 

5
4 3 6 7 8
Sample Output 1

6*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static int solve (int[] a , int[] left, int[] right){
        for(int i = 0; i<a.length; i++){
            if (a[i] >= left[i] && a[i]<= right[i]) return a[i];
            
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] a = new int [n];
        for ( int i = 0; i<a.length; i++) a[i] = s.nextInt();
        int [] left = new int[n];
        int [] right = new int[n];
        right[n-1] = Integer.MIN_VALUE;
        left [0] = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i<a.length; i++){
            max = Math.max(max,a[i-1]);
            left[i] = max;
        }
        int min = Integer.MAX_VALUE;
        for(int i = n-2; i>= 0; i--){
            min = Math.min(min,a[i+1]);
            right[i] = min;
        }
        System.out.println(solve(a,left,right));
    }
}

// import java.util.Arrays;
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int N = scanner.nextInt();
//         int[] arr = new int[N];
//         for (int i = 0; i < N; i++) {
//             arr[i] = scanner.nextInt();
//         }
//         Arrays.sort(arr);
//          // int a = 0;
//              int  a = N / 2;
//         for (int i = 0; i < N; i++) {
//             if (N % 2 == 0) {
//                 System.out.println("-1");
//                 break;
//             }else {
//                 if (i == a)
//                     System.out.println(arr[i]);
//             }
//         }
//     }
// }
