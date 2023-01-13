/*Description

You are given an integern. Your task is to find if the string420is present in it or not.

If 420 is present in it PrintCaughtor PrintEscaped.


Input
Input Format

You are provided an integern.

Constraints

`1 <= N <= 1000000


Output
Output Format

Output an string based on the conditions mentioned in description.


Sample Input 1 

97420
Sample Output 1

Caught
Hint

Sample 1 Explanation

97420 contains 420.

Hence output is "Caught"*/
public static void catch420(String s){
    //write your code here
    for(int i=0; i<s.length()-2; i++){
        if(s.substring(i,i+3).equals("420")){
            System.out.println("Caught");
             return;
        }
    }
        System.out.println("Escaped");}
    
