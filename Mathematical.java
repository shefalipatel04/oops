import java.util.Scanner;
public class Mathematical{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double a;
double b;
System.out.print("Enter the value a: ");
 a = sc.nextDouble();

System.out.print("Enter the value b: ");
b = sc.nextDouble();
System.out.println("\n matheamatical operation");
System.out.println("sum " + (a + b));
System.out.println("min" + (a - b));
System.out.println("multiple" + (a * b));
if(b!=0){
System.out.println("division" + (a/b));
System.out.println("modulus" +  (a%b));
}
else{
System.out.print("Divison and Modulus are not possible");
}
sc.close();
}
}








