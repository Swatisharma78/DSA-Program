/*
Description

You are given a ciphered string, you have to decipher the string.

For example, if the given string is "a2b1c2", then the deciphered string will be "aabcc".

Note: The string contains only lower-case letters and numbers.


Input
The first line of the input contains T, the number of test cases.

The first line of each test case contains N, the length of the string.

The next line contains the string, for which the decipher string is to be generated.

Constraints

1 <= T <= 10

1 <= N <= 200


Output
For each test case, print the deciphered string for the given string, on a new line.


Sample Input 1 

2
6
a2b1c2
6
a2z1a2
Sample Output 1

aabcc
aazaa
Hint

For the first sample test case, the deciphered string will be aabcc.

For the second sample test case, the deciphered string will be aazaa.
*/
import java.util.*;
class Main {
    public static void main(String [] args ){
        Scanner sc= new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int num = sc.nextInt();
            String s = sc.next();
            for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                int t = s.charAt(i)-'0';
                for ( int j = 0; j<t;j++){
                    System.out.print(s.charAt(i-1));}
                }
            }
            System.out.println();
        }
    }
}
