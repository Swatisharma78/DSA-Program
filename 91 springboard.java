/*
Description

The floor of 91 springboard is covered by h × w square tiles, where there are h rows of tiles from front (first row) to back (last row) and w columns of tiles from left to right. Each tile has value of 1 to 100 written on it.

You have to walk on tiles such that sum of numbers is as high as possible, subject to the following restrictions:

You start by choosing any tile in the first row, and collects the value on that tile. Then, you move to a tile in the next row, collects the value on the tile, and so on until you reach the last row.

When you move from one tile to a tile in the next row, you can only move to the tile just below it or diagonally to the left or right.

Given the values of h and w, and the value on each tile, write a program to compute the maximum possible sum you can grab in one single trip from the first row to the last row.


Input
Input Format :

The first line consists of a single integer T, the number of test cases.

In each of the test cases, the first line has two integers. The first integer h is the number of rows of tiles on the floor. The second integer w is the number of columns of tiles on the floor.

Next, there are h lines of inputs. The i-th line of these, specifies the value in each tile of the i-th row from the front. Each line has w integers, where each integer m (0 <= m <= 100) is the number on that tile. The integers are separated by a space character.

Constraints:

1 <= T <= 100

1 <= w <= 100

1 <= h <= 100


Output
The output should consist of T lines, one for each test case. Each line consists of a single integer, which is the maximum possible sum you can grab, in one single trip from the first row to the last row for the corresponding test case.


Sample Input 1 

1
6 5
3 1 7 4 2
2 1 3 1 1
1 2 2 1 8
2 2 1 5 3
2 1 4 4 4
5 2 7 5 1
Sample Output 1

32*/
import java.io.*; 
import java.util.*;
  public class Main{ 
      public static void main(String args[]){ 
          Scanner sc = new Scanner(System.in); 
          int t=sc.nextInt(); 
          for (int i=1;i<=t;i++){ 
              int h=sc.nextInt(); 
              int w=sc.nextInt(); 
              int mat[][]=new int[h][w]; 
              for (int j=0;j<h;j++){ 
              for (int k=0;k<w;k++){ 
              mat[j][k]=sc.nextInt(); 
                }
              }
             int dp[][]=new int[h][w]; 
             int max=0; 
             for (int j=0;j<w;j++){ 
             max=Math.max(max, recursive(0,j,mat, dp));
             }
             System.out.println(max); 
          }
      }
     public static int recursive(int i,int j, int mat[][],int dp[][]){ 
         if(i>=mat.length || j<0 || j>=mat[0].length) {
             return 0;
             }
             int inc=0, ex=0; 
             if(dp[i][j]!=0)
             return dp[i][j];
             inc = mat[i][j] + Math.max(recursive(i+1,j,mat,dp),
             Math.max(recursive(i+1,j+1,mat,dp),
             recursive(i+1,j-1,mat,dp)));
             return dp[i][j] = inc;
     }
  }
// function runProgram(input) {
//   input = input.trim().split("\n")
//   var t = +input[0]
//   var line = 1
//   for(var i=0; i<t; i++){
//     var [r,c] = input[line++].trim().split(" ").map(Number)
//     var grid = []
//     var dp = []
//     for(var j=0; j<r; j++){
//       grid[j] = input[line++].trim().split(" ").map(Number)
//       dp[j] = []
//     }
//      springRoad(grid,r,c,dp);
//   }

// }

// function springRoad(grid,r,c,dp){
//  for(var i=r-1; i>=0; i--){
//      for(var j=c-1; j>=0; j--){
//       if(i==r-1 && j==c-1){
//         dp[i][j] = grid[i][j]
//       }
//       else if(i==r-1){
//         dp[i][j] =  grid[i][j] 
//       }
//       else if(j==c-1){
//       dp[i][j] =  grid[i][j] + Math.max(dp[i+1][j],dp[i+1][j-1])
//       }
//       else if(j==0){
//         dp[i][j] = grid[i][j] + Math.max(dp[i+1][j],dp[i+1][j+1])
//       }
//       else{
//       dp[i][j] = Math.max(dp[i+1][j] , Math.max(dp[i+1][j+1],dp[i+1][j-1])) + grid[i][j]
//       }
//      }
//  }
//   var max = dp[0][0]
//   for(var j=0; j<c; j++){
//     if(dp[0][j] > max){
//       max = dp[0][j]
//     }
//   }
//   console.log(max);
// }

// if (process.env.USERNAME === "") {
 
// } else {
 
//   let read = "";
//   process.stdin.on("data", function (input) {
//     read += input;
//   });
//   process.stdin.on("end", function () {
//     runProgram(read);
//   });
 
// }
