/*Perform the following operation on ArrayList containing names of the people in the Indian Cricket Team, and then print the list in the end

Add "Rohit"
Add "Shikhar"
Add "Virat"
Add "Dhoni"
Remove "Dhoni"
Remove the second player in the list
Check if the name "Virat" is present or not - Print the output of this operation
Add "Rahul" at position 2
Print the final list*/
import java.util.ArrayList;
public class Indiancricketteam {
  public static void main(String[] args) {
   ArrayList<String> arr = new ArrayList<String>();
        arr.add("Rohit");
        arr.add("Shikhar");
        arr.add("Virat");
        arr.add("Dhoni");
        arr.remove("Dhoni");
        arr.remove(1);
        if(arr.contains("Rahul")){
            System.out.println("Virat is not present in the list");
        }else{
            System.out.println("Virat is present in the list");
        }
        arr.add(1,"Rahul");
        System.out.println(arr);
  
  }
}
