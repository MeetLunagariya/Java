import java.util.Scanner;
public class calc {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    int reverseNum = 0;
    while (num > 0) {
    reverseNum = reverseNum * 10 + num % 10;
    num /= 10;
    }
    System.out.println("Reverse of the number is: " + reverseNum);
    scanner.close();
    }
}