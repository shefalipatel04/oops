import java.util.Scanner;
public class Lab1_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("Enter value of i: ");
        int i = sc.nextInt();

        System.out.print("Enter value of j: ");
        int j = sc.nextInt();

        try {
    
            int result = arr[i] / arr[j];

            System.out.println("Result = " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index.");
        }

        sc.close();
    }


    
}
