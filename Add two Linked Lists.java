/*
Description

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Return the head of the updated linked list (In reverse order)


Input
This is a function complete problem.

Refer to sample input for understanding

First Line contains the number of elements in the first linked list (t1)

Next t1 lines contains a single node of linked list in which the first element is the head

The next line contains the number of elements in the second linked list (t2)

Next t2 lines contains a single node of linked list in which the first element is the head

t1,t2 <= 1000

list[i] <= 1000


Output
Complete the function


Sample Input 1 

3
2
4
3
3
5
6
4
Sample Output 1

7 0 8
Hint
342 + 465 = 807*/
/*
class Node{
  int data;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
*/
class Solution{ 
    public Node addTwoLinkedList(Node head1 , Node head2){
        // write your code here.
    Node result = null; 
    Node temp = result;
    
    int carry = 0;
    
    while (head1 != null || head2 != null){
        int val = 0; 
        
        if (head1 == null){ 
            val = head2.data; 
            head2 = head2.next;
        } 
         else if (head2 == null){
            val = head1.data; 
            head1 = head1.next; 
         }else{ 
        val = head1.data + head2.data;
         head1 = head1.next; 
         head2 = head2.next; 
         }
         val = val + carry; 
         carry = val / 10; 
         val = val % 10; 
         
         if (result == null){ 
            result = new Node(val);
            temp = result;
         }else{
             temp.next = new Node(val);
             temp = temp.next;
         }
    }
    if (carry != 0){
        temp.next = new Node(carry);
    }
    return result;
    }
}
    

