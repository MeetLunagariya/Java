public class recPower {
  public static double power(double x , double n){
    if(x==0)
      return 0;
    if(n==0)
      return 1;

    return x * power(x, n-1);
  }
  public static void main(String[] args) {
    double x = 2 ; 
    double n = 14 ; 

    System.out.println(power(x, n));
  }
}
