/*Description

Dr. Strange has n distinct integers from 1 to n. He uses his mind power and time stone to calculate all the possible subsets using the given n integers. Generate all the possible subsets.


Input
The first line of the input contains one integer n (1 ≤ n ≤ 10).


Output
Print each possible subset in a new line.

Elements within the set must be in non-decreasing order. All the subsets must be distinct and sorted in ascending order or lexicographically. For an empty subset just print a blank line.


Sample Input 1 

3
Sample Output 1


1 
1 2 
1 2 3 
1 3 
2 
2 3 
3
  */
// import java.util.Scanner;
// class Main {
//     static void Possible(String Str, String[] arr, int start, int end){
//         if (start <= end && !Str.equals(" ")){
//             System.out.println(Str);
//         }
//         for (int i = start; i < end; i++){
//             Possible(Str + arr[i] + " ", arr, i + 1, end);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         String[] arr = new String[num];
//         for (int i = 1; i <= num; i++) {
//             arr[i - 1] = i + "";
//         }
//         Possible("", arr, 0, num);
//     }
// }
import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
    public static void solve (List<List<Integer>>ans ,List<Integer>list,int n, int i){
        List<Integer> temp = new ArrayList<> (list);
        ans.add(temp);
        for ( int j = i; j<=n; j++){
            list.add(j);
            solve(ans,list,n,j+1);
            list.remove(list.size()-1);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans,new ArrayList<>(),n,1);
        for (List<Integer> i: ans){
            for ( Integer j : i) System.out.print(j + " ");
            System.out.println();
        }
    }
}
