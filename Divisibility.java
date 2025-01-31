import java.util.Scanner;
class Divisibility {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int num = sc.nextInt();
if (num % 100 == 0) {
System.out.println("The number is divisible by 100.");
}
else {
System.out.println("The number is not divisible by 100.");
}
sc.close();
}
}
