import java.util.Scanner;
class DivisibleBy27 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int num = sc.nextInt();
if (num % 27 == 0) {
System.out.println("The number is divisible by 27.");
}
else {
System.out.println("The number is not divisible by 27.");
}
sc.close(); 
}
}
