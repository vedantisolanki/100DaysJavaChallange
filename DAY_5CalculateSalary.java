import java.util.*;
class CalculateSalary{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter your monthly Salary");
double monthlySalary= sc.nextDouble();
System.out.println("1 day salary:"+(monthlySalary/30));
}
}
