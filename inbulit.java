
public class inbulit {

    public static void main(String[] args) {

       
        int[] source = {10, 20, 30, 40, 50};
        int[] destination = new int[5];

        System.arraycopy(source, 0, destination, 0, 5);

        System.out.println("Copied Array:");
        for (int i = 0; i < destination.length; i++) {
            System.out.println(destination[i]);
        } 
        long time = System.currentTimeMillis();
        System.out.println("Current Time in Milliseconds: " + time);
        System.gc();
        System.out.println("Garbage Collection requested.");

        

        System.out.println("\n MATH CLASS ");

        System.out.println("Square root of 25: " + Math.sqrt(25));

        System.out.println("Absolute value of -10: " + Math.abs(-10));

        System.out.println("Minimum of 10 and 20: " + Math.min(10, 20));

        System.out.println("Maximum of 10 and 20: " + Math.max(10, 20));


        System.out.println("Round of 5.6: " + Math.round(5.6));

        int random10 = (int) (Math.random() * 11);
        System.out.println("Random number from 0 to 10: " + random10);

        int random100 = (int) (Math.random() * 101);
        System.out.println("Random number from 0 to 100: " + random100);


      

        System.out.println("\n STRING CLASS ");

        String str = "Hello Java";

        System.out.println("Length: " + str.length());

        System.out.println("Character at index 1: " + str.charAt(1));

        System.out.println("Substring from index 6: " + str.substring(6));

        System.out.println("Substring from index 0 to 5: "
                + str.substring(0, 5));

        String str1 = "Java";
        String str2 = "Java";

        System.out.println("Using equals(): "
                + str1.equals(str2));

        String str3 = "JAVA";
        String str4 = "java";

        System.out.println("Using equalsIgnoreCase(): "
                + str3.equalsIgnoreCase(str4));

        String a = "Apple";
        String b = "Banana";

        System.out.println("Using compareTo(): "
                + a.compareTo(b));

        System.out.println("Contains 'Java': "
                + str.contains("Java"));

        System.out.println("Index of 'l': "
                + str.indexOf('l'));


       
        System.out.println("\nINTEGER CLASS");

        String numberString = "100";

        int number = Integer.parseInt(numberString);

        System.out.println("Using parseInt(): " + number);

        Integer numberObject = Integer.valueOf("200");

        System.out.println("Using valueOf(): " + numberObject);

        Integer decodedNumber = Integer.decode("100");

        System.out.println("Using decode(): " + decodedNumber);

        Integer x = 500;

        int intNumber = x.intValue();

        System.out.println("Using intValue(): " + intNumber);

        byte byteNumber = x.byteValue();

        System.out.println("Using byteValue(): " + byteNumber);

        int value = 1000;

        String stringValue = Integer.toString(value);

        System.out.println("Using toString(): " + stringValue);

        System.out.println("\n STATIC VS INSTANCE METHODS ");

        System.out.println("Static Method Example:");
        System.out.println(Math.sqrt(100));

        System.out.println("Instance Method Example:");

        String name = "Shefali";

        System.out.println(name.length());
        System.out.println(name.charAt(0));
    }
}

