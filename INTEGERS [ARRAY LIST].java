/*
Perform the following operations on an arraylist containing Integers, and print the arraylist in the end

Add 100 to the list
Add 50 to the list
Add 25 to the list
Add 40 to the list
Add 200 at the second position
Check if 500 is present in the list or not - print the output of this operation
Check if 100 is present in the list or not - print the output of this operation
Remove 40 from the list
Add 27 to the list
Check if 27 is present in the list or not - print the output of this operation
Print the final list*/
import java.util.ArrayList;
 public class Integers {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(100);
    list.add(50);
    list.add(25);
    list.add(40);
    list.add(1,200);
    if(list.contains(500)){
      System.out.println("500 is prestent in the list");
    }
    else{
      System.out.println("500 is not present in the list");
    }
    if(list.contains(100)){
      System.out.println("100 is prestent in the list");
    }
    else{
      System.out.println("100 is not present in the list");
    }
    if(list.contains(27)){
      System.out.println("27 is prestent in the list");
    }
    else{
      System.out.println("27 is not present in the list");
        }
     System.out.println(list);
    }  
 }
