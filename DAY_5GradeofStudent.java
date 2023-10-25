import java.util.*;
class GradeofStudent{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter total marks of student1:");
int student1 = sc.nextInt();
System.out.println("Enter total marks of student2:");
int student2 = sc.nextInt();
System.out.println("Enter total marks of student3:");
int student3 = sc.nextInt();
// For student1
if (student1 >= 0 && student1 <= 40){
System.out.println("Student1's grade is C");
} else if (student1 >= 41 && student1 <= 75){
System.out.println("Student1's grade is B");
} else if (student1 >= 76 && student1 <= 100){
System.out.println("Student1's grade is A");
}
// For student2
if (student2 >= 0 && student2 <= 40) {
System.out.println("Student2's grade is C");
} else if (student2 >= 41 && student2 <= 70){
System.out.println("Student2's grade is B");
} else if (student2 >= 71 && student2 <= 100){
System.out.println("Student2's grade is A");
}
// For student3
if (student3 >= 0 && student3 <= 40) {
System.out.println("Student3's grade is C");
} else if (student3 >= 41 && student3 <= 70){
System.out.println("Student3's grade is B");
} else if (student3 >= 71 && student3 <= 100){
System.out.println("Student3's grade is A");
}
}
}
