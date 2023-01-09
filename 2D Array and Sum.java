/*Description

You are given an arraymatrixofnrows andmcolumns which contains positive integers and sums.

You need to find occurrences of the sum of three consecutive numbers (i.e x,y, and z ) whose sum is equal to s appear horizontally, vertically and diagonally in the given matrix.

Image


Input
Input Format

First line: Three integers n, m and s, where n denotes the number of rows, m denotes the number of columns in the matrix and s is the sum.

Next n lines: Each line contains m characters which contain positive integers only.

Constraints

1 <= n,m < 10

1 <= s <= 50


Output
Print the number of times the sum s appear in the matrix.


Sample Input 1 

3 3 6
3 2 1
2 2 2
1 5 1
Sample Output 1

4
Hint

Sample 1 Explanation

here s is 6 presents 4 times( 2 Horizontal + 1 Vertical + 1 Diagonal)*/
public static void twoArrayAndSum(int N,int M, int matrix[][], int s){
    //write your code here
    int count = 0;
    for(int i = 0; i < N; i++) {
    for(int j = 0; j < M; j++) {
    if(j+2<M) {
    if(matrix[i][j]+matrix[i][j+1]+ matrix[i][j+2]==s){
                   count++;
           }
       }
          if( i+2<N ){
        if( matrix[i][j] + matrix[i+1][j] + matrix[i+2][j]==s){
               count++;
             }
          }
          if(i+2< N && j+2 < M){
        if (matrix[i][j] + matrix[i+1][j+1] + matrix[i+2][j+2]==s){
               count++;
               }
         }
         if(i-2>=0&&j+2<M){
           if (matrix[i][j] + matrix[i-1][j+1] + matrix[i-2][j+2]==s){
               count++;
           }
         }
       }
     }
 System.out.println(count);
}
 
