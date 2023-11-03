import java.util.*;
class CheckTriangle{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first angle of triangle");
int angle1=sc.nextInt();
System.out.println("Enter the second angle of triangle");
int angle2=sc.nextInt();
System.out.println("Enter the third angle of triangle");
int angle3=sc.nextInt();
if((angle1+angle2+angle3)==180)
System.out.println("It is a valid triangle");
else
System.out.println("It is not a valid triangle");
}
}
