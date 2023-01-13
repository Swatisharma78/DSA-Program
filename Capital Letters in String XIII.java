/*
Description

You are given a string stored in a variable with the namestr, containing a mix of upper case and lower case English characters

The length of the string is stored in a variable with the nameN

You have to solve the equation13*x, wherexis the number of capital upper case English characters in the string

For example, consider the value stored inN = 5, andstr = raHuL

The number of upper case characters in the string is2:H, L

Therefore, the value of the equation13*x, becomes13*2 = 26, which is the required answer


Input
The first line of the input contains the value stored inN

The second line of the input contains the value stored instr


Output
Solve the equation given in the problem statement, as explained

Sample Input 1 

5
raHuL
Sample Output 1

26
Hint

In the sample test case, the value stored inN = 5, andstr = raHuL

The number of upper case characters in the string is 2 :H, L

Therefore, the value of the equation13*x, becomes13*2 = 26, which is the required answer*/
public static void capitalLetters(int n, String str){
    //write your code here
    int count = 0;
    for (int i=0; i<n; i++){
    if (str.charAt(i) >= 65 && str.charAt(i) <= 90){
        count++;
      }
    }
    System.out.println(13*count);
  }
