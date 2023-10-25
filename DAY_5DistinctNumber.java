import java.util.*;
class Sample{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter your Hindi marks");
double Hindimarks= sc.nextDouble();
System.out.println("Enter your Maths marks");
double Mathsmarks= sc.nextDouble();
System.out.println("Enter your English marks");
double Englishmarks= sc.nextDouble();
if(Hindimarks >= 75)
{
System.out.println("You got distinct in Hindi:"+Hindimarks);
}
if(Mathsmarks >= 75)
{
System.out.println("You got distinct in Maths:"+Mathsmarks);
}
if(Englishmarks >= 75)
{
System.out.println("You got distinct in English:"+Englishmarks);
}
}
}
