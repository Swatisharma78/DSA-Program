/*Description

Dr. Strange is back again and this time he has an array A with n integers which may have duplicates. So he again uses his mind power and time stone to calculate all the possible subsets of the input array A. Generate all the possible subsets.


Input
The first line of the input contains one integer n (1 ≤ n ≤ 10) — The size of the array A.

The second line of the input contains n integers (1 ≤ Ai ≤ 10) - The elements of the array A.


Output
Print each possible subset in a new line.

Elements within the subset must be in non-decreasing order. All the subsets must be distinct and sorted lexicographically. For an empty subset just print a blank line.


Sample Input 1 

3
1 2 2
Sample Output 1


1 
1 2 
1 2 2 
2 
2 2 */
import java.util.*;
import java.io.*;
import java.lang.*;

class Main{
    public static void solve(List<List<Integer>> ans,List<Integer> current, int index,int[]a,HashSet<List<Integer>>map){
        if (!map.contains(current)){
            ans.add(new ArrayList<> (current));
            map.add(new ArrayList<> (current));
        }
        for ( int i = index; i < a.length; i++){
            current.add(a[i]);
            solve ( ans , current,i+1, a, map);
            current.remove(current.size()-1);
        }
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for ( int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        HashSet<List<Integer>> map = new HashSet<>();
        Arrays.sort(a);
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans , new ArrayList<>(),0,a,map);
        for ( List <Integer> i: ans){
        for ( Integer j : i) System.out.print(j + " ");
               System.out.println();
        }
    }
}
