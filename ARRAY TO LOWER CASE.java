/*Write a function to convert a character to lower case
Use this function to convert a given word to lower case
Use that function to convert an array of strings to array of lower case strings
Sample Input
["MA", "SA", "I", "SCH", "OOL"]

Sample Output
["ma","sa","i","sch","ool"]*/
public class lowercase{
   public static void main(String args[]) {
	String []arr = new String[]{"MA","S","AI","SCH","OOL"};
     for (int i=0; i<5; i++){
       String curr= arr[i];
       String ansNow =curr.toLowerCase();
       System.out.print(ansNow+" ");
     }
   }
}
