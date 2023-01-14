/*Description

You are given a 2D array, whose dimensions are stored in two variables with the nameNandM

The value stored inNdenotes the number of rows, and the value inMdenotes the number of columns

The 2D array is stored in a variable with the namearr

You have to print the sum of elements of the first and last column of the 2D array

For example, consider the value stored inN = 3,M = 3, and the array isarr = [1,2,7],[3,4,6],[5,6,10], then the required output will be

the first column contains elements 1, 3 and 5
the last column contains elements 7, 6 and 10

Total Sum = 1 + 3 + 5 + 7 + 6 + 10 = 32


Input
The first line of the input contains the value stored inNandM

The nextNlines containMvalues each denoting the value stored inarr


Output
Print thesum of elements of the first and last column presentin the 2D Array

Sample Input 1 

3 3
1 2 7
3 4 6
5 6 10
Sample Output 1

32
Hint

In the sample test case, the value stored inN = 3,M = 3, and the array isarr = [1,2,7],[3,4,6],[5,6,10], then the required output will be

1 + 3 + 5 + 7 + 6 + 10 = 32, which is the required output
*/
 public static void cornerSum(int n,int m,int[][] arr){
    //write your code here
    int sum = 0; 
    for (int i = 0; i<m; i++){
     for (int j = 0; j<n; j++){ 
      if(i==0){
        sum+=arr[j][i];
        }else if(i==m-1){
        sum+=arr[j][i];
         }
      }
    }
    System.out.println(sum);
  }
