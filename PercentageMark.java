import java.util.Scanner;
public class PercentageMark{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int s1 , s2 ,s3, s4,s5, s6;
int total;
double  percentage;
System.out.println("Enter the marks of subject 1");
s1 =sc.nextInt();

System.out.println("Enter the marks of subject 2");
s2 =sc.nextInt();

System.out.println("Enter the marks of subject 3");
s3 =sc.nextInt();

System.out.println("Enter the marks of subject 4");
s4 =sc.nextInt();

System.out.println("Enter the marks of subject 5");
s5 =sc.nextInt();

System.out.println("Enter the marks of subject 6");
s6 =sc.nextInt();

total = s1 + s2+ s3 + s4 + s5 + s6;
percentage = (total/600.0) * 100;

System.out.println("total marks=" + total);
System.out.println("total percentage=" + percentage);
sc.close();
}
}








