/*
Description

Given two strings, s1 and s2, you need to print YES if s1 is a subsequence of s2 else NO.


Input
1<=T<=10

1<=|S1|<=100

1<=|S2|<=10000


Output
output YES or NO for each test case.


Sample Input 1 

2
abc
adbce
ax
xaa
Sample Output 1

YES
NO*/
import java.util.*;
public class Main{ 
    public static void main(String[] args){ 
        Scanner sc = new Scanner (System.in); 
        int T = sc.nextInt(); 
        for(int t=0; t<T; t++){ 
            String s1 = sc.next(); 
            String s2 = sc.next(); 
            int l1 = s1.length(); 
            int l2 = s2.length();
            boolean value = solve(s1, s2); 
            if(value){ 
                System.out.println("YES");
                }else{ 
            System.out.println("NO");
            }
        }
    }
        public static boolean solve(String s1, String s2){ 
            int i=0,j=0;
            for(;i<s1.length() && j<s2.length(); j++){ 
                if(s1.charAt(i)==s2.charAt(j)){
                    i++; 
               }
            }
            return (i==s1.length());
        }
    }

// import java.util.*;
// class Main{
//     public static boolean find(char [] s1, char[] s2){
//         int s1_ind = 0;
//         int s2_ind = 0;
//         while(s1_ind < s1.length && s2_ind < s2.length){
//             if(s1[s1_ind]==s2[s2_ind]){
//                 s1_ind++;
//             }
//             s2_ind++;
//     }
//     return s1_ind == s1.length;
// }
// public  static void main(String[] args){
//     Scanner s = new Scanner(System.in);
//     int tc = s.nextInt();
//     while(tc-->0){
//         String s1 = s.next();
//         String s2 = s.next();
//         char[] str1 = s1.toCharArray();
//         char[] str2 = s2.toCharArray();
//         boolean ans = find (str1,str2);
//         if(ans){
//             System.out.println("YES");
//         }else{
//           System.out.println("NO"); 
//         }
//      }
//   }
//  }
