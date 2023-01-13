/*Description

Teena is very good at competitive programming, she solved enough problems on arrays and her friend wants to test her knowledge in arrays, so gave her following task :

The problem is given an array A having N integers, for each element i (1 <= i <= N), find x+y  where x is the largest number less than i such that A[x]>A[i] and y is the smallest number greater than i such that A[y]>A[i].
If there is no x < i such that A[x]>A[i], then take x=−1. Similarly, if there is no y>i such that A[y]>A[i], then take y=−1.

Input
Input Format

First line consists of a single integer denoting N.

Second line consists of N space separated integers denoting the array A.

Constraints

1 <= N <= 10^6

1 <= A[i] <= 10^9


Output
Print N space separated integers, denoting x+y for each i


Sample Input 1 

5
5 4 1 3 2
Sample Output 1

-2 0 6 1 3 
Hint

Sample 1 Explanation

Values of x for each i: -1,1,2,2,4

Values of y for each i: -1,-1,4,-1,-1

So, x+y for each i: -2,0,6,1,3 */
import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
    public static int [] left ( int [] a){
        int [] ans = new int [a.length];
        Stack<Integer>stack= new Stack<>();
        for ( int i = 0; i<a.length; i++){
             while(!stack.isEmpty()&& a[stack.peek()]<=a[i]) stack.pop();
            if ( stack.isEmpty()) ans[i] = -1;
            else {
                ans [i] = stack.peek() + 1;
               }
                stack.push(i);
            }
            return ans ; 
        }
        public static int [] right( int[] a){
            int[] ans = new int [a.length];
            Stack<Integer>stack=new Stack<>();
            for( int i = a.length-1; i>=0;i--){
                while(!stack.isEmpty()&& a[stack.peek()]<=a[i]) stack.pop();
                if(stack.isEmpty()) ans[i] = -1;
                else{
                    ans [i] = stack.peek()+1;
                }
                stack.push(i);
            }
            return ans ;
        }
        public static void main ( String [] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int [] a = new int[n];
    for ( int i = 0; i<a.length ; i++){
        a[i] = sc.nextInt();
    }
    int [] right = right(a);
    int [] left = left(a);
    int [] ans = new int[n];
    for ( int i=0;  i < a.length; i++) ans[i] = left[i] + right[i];
    for ( Integer i : ans) System.out.print(i + " ");
        }
    }
// function runProgram(input){
//   input = input.trim().split("\n");
//   let n = +input[0];
//   let arr = input[1].trim().split(" ").map(Number);
//   let ans = [];
//   for(let j=0; j<n ;j++){
//       let len = left(arr,j,arr[j]);
//       let row = right(arr,j,arr[j]);
//       ans.push(len+row);}
//   console.log(ans.join(" "));}
// function left(arr,t,num){
//     for(let i=t-1;i>=0; i--){
//         if(arr[i]>num){
//             return i+1;}}
//           return -1;}
// function right(arr,t,num){
//     for(let i=t+1; i<arr.length; i++){
//         if(arr[i]>num){
//             return i+1;}}
//           return -1;}
// if (process.env.USER === "Talib") {
//  runProgram(``);
// } else {
//  process.stdin.resume();
//  process.stdin.setEncoding("ascii");
//  let read = "";
//  process.stdin.on("data", function (input) {
//   read += input;
//  });
//  process.stdin.on("end", function () {
//   read = read.replace(/\n$/, "");
//   read = read.replace(/\n$/, "");
//   runProgram(read);
//  });
//  process.on("SIGINT", function () {
//   read = read.replace(/\n$/, "");
//   runProgram(read);
//   process.exit(0);
//  });
// }
