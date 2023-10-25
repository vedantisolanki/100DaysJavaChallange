import java.util.*;
class RectanglePerimeter{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a length of rectangle");
int length=sc.nextInt();
System.out.println("Enter a width of rectangle");
int width=sc.nextInt();
System.out.println("The perimeter of the rectangle is:"+(2*(length+width)));
}
}
