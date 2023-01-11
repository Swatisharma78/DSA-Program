/*Description

You are given an array stored in a variable with the namearr
The size of the array is stored in a variable with the nameN
You have to find the value of the equation5*x + 2*y,
where x - sum of all elements in the array
and y - product of all elements in the array
For example, consider the value stored inN = 4, andarr = [1 2 3 4]
Therefore, the value ofx = 1 + 2 + 3 + 4 = 10, and the value ofy = 1*2*3*4 = 24
Therefore, the value of the given equation =5*x + 2*y = 5*10 + 2*24 = 50 + 48 = 98, which is the required answer

Input
The first line of the input contains the value stored inN
The next line contains the elements of the array, which are stored inarr

Output
Print the value of the equation, as explained in the problem statement

Sample Input 1 

4
1 2 3 4
Sample Output 1

98
Hint

In the sample test case, the value stored inN = 4, andarr = [1 2 3 4]
Therefore, the value ofx = 1 + 2 + 3 + 4 = 10, and the value ofy = 1*2*3*4 = 24
Therefore, the value of the given equation =5*x + 2*y = 5*10 + 2*24 = 50 + 48 = 98, which is the required answer*/
public static void arrayEquation(int n,int[] arr){
    //write your product here
     int sum=0;
     int sum2=1;
    for(int i=0; i<n; i++){
      sum+=arr[i];
      sum2=sum2*arr[i];
      
    }
    System.out.println((5*sum)+(2*sum2));
    
  }
