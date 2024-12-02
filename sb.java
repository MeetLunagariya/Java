import java.util.*;
public class sb {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String : ");
    String str = sc.nextLine();
    StringBuilder sB = new StringBuilder(str);

    for(int i = 0 ; i < sB.length() / 2 ; i++){
      int front = i ;
      int back = sB.length() - 1 - i ;

      char start = sB.charAt(front);
      char end = sB.charAt(back);

      sB.setCharAt(front, end);
      sB.setCharAt(back, start);

    }

    System.out.println("Reversed String : "+sB);
  }
}
