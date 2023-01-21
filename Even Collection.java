/*Description

You are given two numbers, stored in variables with the following names

max, min

You have to find the sum of all even numbers that fall between two numbersfrom min to max(including both min and max).

For example, if the value stored inmax = 19, and the value stored inmin = 14, then the output will be computed as follows

sum of even = 14 + 16 + 18 = 48
Note : The value stored in max will always be greater than or equal to min


Input
The first and the only line of input contains the value stored inmax, minrespectively


Output
print thesum of all even numbers that fall between two numbers(including both numbers)from min to max.


Sample Input 1 

19 13
Sample Output 1

48
Hint

Given max = 19, min = 13

The range contain following number : 13, 14, 15, 16, 17, 18, 19

From above range , The even numbers are : 14, 16, 18

Sum of even numbers = 14 + 16 + 18 = 48*/
public static void evenCollection(int max,int min){
    //write your code here
    int sum = 0;
    for (int i=min ; i<=max ; i++){
        if (i%2==0){
          sum=sum+i;  
        }
    }
    System.out.println(sum);
  }
