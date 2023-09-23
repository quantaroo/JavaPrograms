public class Harmonic {
  public static void main(String[] args) {
    System.out.println(harmonic1(5));
    System.out.println(harmonic2(5));
  }

  public static double harmonic1(int n){
    //base case
    if (n == 1){
      return n;
    }
    //recursive case
    else{
      return (1.0/n) + (harmonic1(n-1));
    }
  }
  private static double harmonic2(int n){
    double sum = 0.00;
    for (int i = 1; i <= n; i++){
      sum += (double) 1/i;
    }
    return sum;
  }
}
