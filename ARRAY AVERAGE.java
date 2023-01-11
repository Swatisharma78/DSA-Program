/*Write code to calculate the average of an array
If there are no items in the array it should return 0
NOTE: Create a function to find the sum of elements in an array and use that function to find out the average*/
public class Arrayaverage
{  
    static int sum (int arr[], int n){
      int sum = 0;
      for ( int i = 0; i<n; i++){
        sum = sum + arr[i];}
      return sum ;
      }
   static int avg( int sum , int n){
     sum = sum/n;
     return sum ;
   }
  public static void main ( String args[]){
    int [] arr = new int[]{2,4,6,8,10};
    int add = sum (arr,5);
    int average = avg(add,5);
    System.out.println(average);}
  }
