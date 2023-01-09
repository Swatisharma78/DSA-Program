/*Description

You are given an arraymatrixofnrows andmcolumns which contains lower case English letters.

How many times does the phrase "saba" appear horizontally, vertically, and diagonally in the grid?

OJ2.png


Input
Input Format

First line: Two integer n and m, where n denotes the number of rows and m denotes the number of columns in the grid

Next n lines: Each line contains m characters which contains lower-case English letters only

Constraints

1 <= n,m <= 100


Output
Output Format

Print the number of times the word “saba” appears in the grid.


Sample Input 1 

5 5
safer
amjad
babol
aaron
songs
Sample Output 1

2*/
public static void twoArrayAndPhrase(int N,int M, char matrix[][]){
    //write your code here
 int count = 0;
    for(int i = 0; i < N; i++) {
    for(int j = 0; j < M; j++) {
    if(j+3<M) {
    if(matrix[i][j]=='s'&&matrix[i][j+1]=='a'&& matrix[i][j+2]=='b'&& matrix[i][j+3]=='a'){
                   count++;
           }
       }
          if( i+3<N ){
        if(matrix[i][j]=='s'&&matrix[i+1][j]=='a'&& matrix[i+2][j]=='b'&& matrix[i+3][j]=='a'){
                   count++;
             }
          }
          if(i+3< N && j+3 < M){
if (matrix[i][j]=='s' && matrix[i+1][j+1]=='a' && matrix[i+2][j+2]=='b'&& matrix[i+3][j+3]=='a'){
               count++;
               }
         }
         if(i-3>=0&&j+3<M){
if (matrix[i][j]=='s' && matrix[i-1][j+1]=='a' && matrix[i-2][j+2]=='b'&&matrix[i-3][j+3]=='a'){
               count++;
           }
         }
       }
     }
 System.out.println(count);
}
  
