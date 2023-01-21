/*
Description

This is an easy question. You just have to find the sum of an array given the elements of the array.

The only constraint is that you have to write a recursive code


Input
Input Format :

There are several test cases within a test case.

First line contains t which is the number of test cases

First line of each test case contains n which is the number of integers

Second line of each test case contains n space separated integers

Constraints :

n <= 100000

arr[i] <= 10


Output
Output t lines where each line contains sum of all the elements in that test case


Sample Input 1 

3
5
6 3 8 2 -4
5
-10 -7 10 2 -2
5
-4 -5 6 -3 9
Sample Output 1

15
-7
3*/
import java.util.*;
public class Main {
    public static int solve (int [] arr , int n ){
        if( n<=0){
            return 0;
        }
        return solve(arr,n-1)+arr[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 0; t < test; t++) {
        int num = sc.nextInt();
        int[] arr = new int[num];
             int sum = 0;
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            sum += arr[i];}
            System.out.println(sum);
         }
    }
}
// import java.util.Scanner;
// class Main{
//     public static int sum (int arr[], int n){
//         if ( n==arr.length){
//             return 0 ;
//         }
//         return arr[n] + sum(arr,n+1);
//     }
//     public static void main (String[] args){
//         Scanner sc = new Scanner( System.in);
//         int tc = sc.nextInt();
//         for(int t = 0; t<tc; t++){
//             int num = sc.nextInt();
//             int [] arr = new int [num];
//             for(int i = 0; i<num; i++){
//                 arr[i] = sc.nextInt();
//             }
//             int a = 0;
//             int b = sum(arr,a);
//             System.out.println(b);
//         }
//     }
// }


