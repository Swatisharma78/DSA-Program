/*Description

You are given a number stored in a variable with the nameN

You have to print the series starting from 10 to N having a difference of 10,

For example, if the value is stored inN = 100, then all the numbers in the range, from [10,100] need to be printed, such that there are 3 numbers on each line. Therefore, the required output is

10
20
30
40
50
60
70
80
90
100
Note : The value of N will always be multiple of 10.

Input
The first and the only line of the input contains the value stored in the variableN


Output
Print all the numbers in the range from [10, N] with a difference of 10, as shown in the problem statement.


Sample Input 1 

100
Sample Output 1

10
20
30
40
50
60
70
80
90
100
Hint

In the sample test case, the value stored atN = 100. Therefore, all the values in the range[10,100]need to be printedwith a difference of 10.

Also, there should be 1 element on each line. Therefore, the output becomes

10
20
30
40
50
60
70
80
90
100*/
 public static void differenceOf10(int n){
    //write your code here
        for(int i = 0; i<n;){
          i+=10;
     System.out.println(i);
    }
  }
