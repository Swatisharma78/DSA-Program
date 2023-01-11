/*Description

You are given an array whose size is stored in a variable with the nameN

The array is stored in a variable with the namearr

The value stored inNis always divisible by 3

You have to solve the equation -4*c1 + 5*c2 + 6*c3, such that after dividing the array into 3 equal parts

c1 -> sum of the first half

c2 -> sum of the second half

c3 -> sum of the third half

For example, consider the value stored inN = 6, andarr = [1 2 3 4 5 6]

Therefore, the first half of the array is -1 2, the second half of the array is3 4, and the third half of the array is5 6

Therefore,

c1 = 1 + 2 = 3

c2 = 3 + 4 = 7

c3 = 5 + 6 = 11

Now, the equation4*(3) + 5*(7) + 6*(11) = 113, which is the required output.

Input
The first line of the input contains the value stored inN

The next line contains the value stored inarr


Output
Print the output as explained in the problem statement.

Sample Input 1 

6
1 2 3 4 5 6
Sample Output 1

113
Hint

From the sample test case, the value stored inN = 6, andarr = [1 2 3 4 5 6]

Therefore, the first half of the array is -1 2, the second half of the array is3 4, and the third half of the array is5 6

Therefore,


c1 = 1 + 2 = 3

c2 = 3 + 4 = 7

c3 = 5 + 6 = 11

Now, the equation4*(3) + 5*(7) + 6*(11) = 113, which is the required output.*/
public static void arrayParts(int n,int[] arr){
    //write your code here
    int c1=0;
    int c2=0;
    int c3=0;
    for (int t=0; t<n/3;t++){
        c1=c1+arr[t];}
    for (int l=n/3; l<2*n/3;l++){
        c2=c2+arr[l];}
    for (int b=2*n/3; b<n;b++){
        c3=c3+arr[b];}
    System.out.print(4*(c1)+5*(c2)+6*(c3));
  }
