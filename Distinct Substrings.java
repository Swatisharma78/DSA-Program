/*Description

Given a string s of length n, find out the number of distinct substrings possible from the given string.


Input
The first line of the input contains one integer t (1 ≤ t ≤ 100) — the number of test cases. Then t test cases follow.

The first line of each test case contains a single integer n (1 ≤ n ≤ 100) — the length of the string.

The second line of each test case contains a string s of length n.


Output
For each test case, print the answer: The number of distinct substrings possible from given string.


Sample Input 1 

2
5
abcde
3
aaa
Sample Output 1

15
3*/
import java.util.*;
public class Main{
    public static int solve (String t){
     HashSet<String>map = new HashSet<>();
            for(int i = 0; i <= t.length(); i++){
                for(int j = i+1; j <= t.length(); j++){
                    String temp = t.substring(i,j);
                 map.add(temp);
                }
            } 
            return map.size();
       }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
       while(tc--!=0){
      int len = sc.nextInt();
       String t = sc.next();
        System.out.println(solve(t));
        }
    }
}
