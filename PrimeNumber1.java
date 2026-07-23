class PrimeNumber1 {
public static void main(String[] args)
{
int count = 0;
int num = 2;
while (count < 10) {
int factors = 0;
for (int i = 1; i<= num; i++) {
if (num%i == 0) {
factors++;
}
}
if (factors == 2) {
System.out.println(num);
count++;
}
num++;
}
}
}