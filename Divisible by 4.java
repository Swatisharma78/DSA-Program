/*Description

You are given a number, stored in the variable with the nameN

PrintYes, if the number is divisible by 4, else printNo

Note : A number is divisible by 4, if the result of the following expression number % 4 == 0


Input
First and only line contains one positive integer

N < 100000


Output
Output "Yes" and "No" depending on N.


Sample Input 1 

12
Sample Output 1

Yes*/
 public static void divisibleBy4(int n){
    //write your code here
    if (n%4 == 0) {
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
  }
