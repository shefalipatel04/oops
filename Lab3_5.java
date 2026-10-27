import java.util.Scanner;
class StringNotValidException extends Exception {
    public StringNotValidException(String message) {
        super(message);
    }
}

public class Lab3_5 {
    static void checkString(String str) throws StringNotValidException {

        if (!str.matches("(?i).* [aeiou].*".replace(" ", ""))) {
            throw new StringNotValidException("String does not contain vowels!");
        } else {
            System.out.println("Valid String: " + str);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        try {
            checkString(str);
        } catch (StringNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}

    

