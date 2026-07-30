public class Stream {
    public static void main(String[] args) {
        String name = "STREAM";

        for (int i = 0; i < name.length(); i++) {

            // Print spaces
            for (int j = i; j < name.length() - 1; j++) {
                System.out.print(" ");
            }

            // Print characters
            for (int j = 0; j <= i; j++) {
                System.out.print(name.charAt(j) + " ");
            }

            System.out.println();
        }
    }
}