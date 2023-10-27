import java.util.*;
class UpperOrLowerCase{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Character");
char ch=sc.next().charAt(0);
System.out.println(ch);
if(ch>='A'&&ch<='Z'){
System.out.println("UpperCase");
}
else if(ch>='a'&&ch<='z'){
System.out.println("LowerCase");
}
else{
System.out.println("Not a Alphabet");
}
}
}
