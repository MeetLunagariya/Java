import java.util.*;

public class dec2roman {
  public static void main(String[] args) {
    int[] values_int = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] values_roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a decimal number: "); 
    int number = scanner.nextInt();
    int temp = number;
    String roman = "";

    if(number <= 0){
      System.out.println("Entered number must be > 0");
    }

    else {

      for (int i = 0; i < values_int.length; i++) {

        do {

          if(number >= values_int[i]){
            number -= values_int[i];
            roman += values_roman[i];
          }

        } while (values_int[i] <= number);

      }

    }

    System.out.println(temp + " = "+ roman);

  }
}
