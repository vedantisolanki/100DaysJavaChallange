import java.util.*;
class CheckNumber{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number");
int num=sc.nextInt();
if(num%3==0 && num%7==0){
System.out.println("yes");
}
else{
System.out.println("No");
}
}
}
