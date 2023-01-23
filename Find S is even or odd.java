/*Description

You are given a number S. Find if the value of S is even or odd after the following operation

8 is added to S.

3 is multiplied to S.


Input
Input will contain one number S


Output
Print whether the value of S isevenoroddafter the operations are performed.


Sample Input 1 

20
Sample Output 1

even
Hint

In the sample inputS = 20and we have to do the following operations

S = 20 + 8 = 28

S = 28 * 3 = 84

Since84is even number. Therefore, the output iseven.*/
public static void evenOrOdd(int n){
    //write your code here
     if ((n+8*3)%2==0){
        System.out.println("even");
     }else{
    System.out.println("odd");
  }
}
