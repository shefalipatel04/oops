import java.util.Scanner;
public class CapitalWordCount {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a line: ");
String line = sc.nextLine();
String[] words = line.split("\\s+");
int count = 0;
for (String word : words) {
if (word.length() > 0 && Character.isUpperCase(word.charAt(0))) {
count++;
}
}
System.out.println("Number of words starting with a capital letter: " + count);
sc.close();
}
}