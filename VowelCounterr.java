import java.util.Scanner;
 public class VowelCounter{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int acount = 0;
int ecount = 0;
int icount = 0;
int ocount = 0;
int ucount = 0;
while(True){
System.out.print("Enter the Sentence : ");
String sentence = sc.nextLine();
if(sentence.equalIgnoreCase("quit")){
break;
}
sentence = sentence.toLowercase();
for(int i=0 ; i<sentence.length(); i++){
char ch = sentence.charAt(i);
if(ch == 'a'){
acount++;
} else if(ch == 'e'){
ecount++;
} else if(ch == 'i'){
icount++;
} else if(ch == 'o'){
ocount++;
}
else(ch == 'u'){
ucount++;
}
}
}
System.out.println("Total count of each vowel:");
System.out.println("a = " + aCount)
System.out.println("e = " + eCount);
System.out.println("i = " + iCount);
System.out.println("o = " + oCount);
System.out.println("u = " + uCount);
sc.close();
}
}





