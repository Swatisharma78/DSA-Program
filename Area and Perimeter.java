/*
Description

You are given the sides of the rectangle 1: L1 and B1 and sides of the rectangle 2 : L2 and B2.

You need print if area of rectangle 1 is greater than rectangle 2.

You need print if perimeter of rectangle 1 is greater than rectangle 2.


Input
The first line of each test case contains two space-separated integers L1, B1, L2, B2 , the length and breadth of the rectangle1 andthe length and breadth of the rectangle2.

Constraints

1 <= L1, B1, L2, B2 <= 100


Output
Print(Area of rectangle 1 > Area of rectangle 2)

Print(Perimeter of rectangle 1 >Perimeter of rectangle 2)


Sample Input 1 

1 2 2 3
Sample Output 1

false
false*/
public static void areaAndPerimeter(int l1,int b1,int l2,int b2){
    //write your code here
    int rectangle1 = l1*b1;
    int rectangle2 = l2*b2;
    if (rectangle1>rectangle2){
        System.out.println(true);
    }else{
        System.out.println(false);
    }
    
    int Perimeter1 = 2*(l1+b1);
    int Perimeter2 = 2*(l2+b2);
    if (Perimeter1>Perimeter2){
        System.out.println(true);
    }else{
        System.out.println(false);
    }
  }
