package shapes;

public class Clinton implements Politician {
  public void saySlogan() {
    System.out.println("Stronger Together");
  }
  
  // only rough approximation of weird and complex topic
  public double changeTaxes(double income, double initialRate) {
    if (income > 300_000) {
      return initialRate + 0.1;
    } else {
      return initialRate;
    }  
  }
