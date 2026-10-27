import java.util.Scanner;
public class Lab2_5 {
    static void Checknumber(int num) {
        if(num % 2 != 0){
            throw new NumberFormatException("number is odd");
        }
        System.out.println("Number is odd : " + num);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer");
        int num = sc.nextInt();
        try{
            Checknumber(num);
        }
        catch (NumberFormatException e){
            System.out.print("Exception" + e.getMessage());

        }
        sc.close();
    }
    
}
