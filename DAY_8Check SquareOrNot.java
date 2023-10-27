import java.util.*;
class SquareOrNot{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter length of Square");
int length=sc.nextInt();
System.out.println("Enter breadth of Square");
int breadth=sc.nextInt();
if(length==breadth){
System.out.println("It is a Square");
}
else{
System.out.println("Not a Square");
}
}
}
