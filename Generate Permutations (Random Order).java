/*Description

Given a collection of numbers, return all possible permutations.

NOTE:

No two entries in the permutation sequence should be the same.

For the purpose of this problem, assume that all the numbers in the collection are unique.

USING BUILT-IN LIBRARY FUNCTION TO PERMUTE WILL LEAD TO DISQUALIFICATION

Note :Return the permutations in any order.


Input
The first line of input contain an integer n - denoting the size of array

The next line contain n distinct integers, A[1],A[2]...A[N]

Constraints:

1<= n <=6


Output
This is a function complete problem. Return the collection of permutations of the array.


Sample Input 1 

3
1 2 3
Sample Output 1

1 2 3 
1 3 2 
2 1 3 
2 3 1 
3 1 2 
3 2 1
  */
class Solution{
  public List<List<Integer>> generatePermutation(int[] a){
   List<List<Integer>> list = new ArrayList<>();
   permute(a,list,0);
   return list;
  }
  public void swap ( int [] arr , int i , int j ){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }
  public void permute (int [] arr, List<List<Integer>> list,int cur){
      if ( cur == arr.length){
          List<Integer> temp = new ArrayList<>();
          for ( int i = 0; i< arr.length; i++) temp.add(arr[i]);
          list.add(temp);
          return;
      }
      for ( int i = cur; i<arr.length; i++){
          swap (arr, cur, i);
          permute(arr,list,cur+1);
          swap (arr,cur,i);
      }
      return;
  }
}
