/*
Description

You are given a 2D array, whose dimensions are stored in two variables with the nameNandM

The value stored inNdenotes the number of rows, and the value inMdenotes the number of columns

The 2D array is stored in a variable with the namearr

For all rows, you have to print the sum of even elements present in the row

For example, consider the value stored inN = 3,M = 3, and the array isarr = [1,2,3],[4,5,6],[7,8,9], then the required output will be

2  (Even numbers in the row are, [2]. Therefore, the sum becomes 2)
10 (Even numbers in the row are, [4,6]. Therefore, the sum becomes 10) 
8  (Even numbers in the row are, [8]. Therefore, the sum becomes 8)


Input
The first line of the input contains the value stored inNandM

The nextNlines containMvalues each denoting the value stored inarr


Output
For each row, print the sum of even numbers present in the row, line by line

Sample Input 1 

3 3
1 2 3
4 5 6
7 8 9
Sample Output 1

2
10
8
Hint

In the sample test case, the value stored inN = 3,M = 3, and the array isarr = [1,2,3],[4,5,6],[7,8,9], then the required output will be

2  (Even numbers in the row are, [2]. Therefore, the sum becomes 2)
10 (Even numbers in the row are, [4,6]. Therefore, the sum becomes 10) 
8  (Even numbers in the row are, [8]. Therefore, the sum becomes 8)
*/
public static void evenSumRows(int rows, int cols, int mat[][]){
    //write your code here
      for(int j=0; j<rows; j++){
        int sum = 0;
        for(int k=0; k<cols; k++){
       if (mat[j][k]%2==0){
           sum = sum + mat[j][k];
           }
         }
         System.out.println(sum);
      }
     
  }
