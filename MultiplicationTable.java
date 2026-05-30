public class MultiplicationTable {
  public static void main(String[] args) {
    int number = 9;
    int multiplication = 0;
    for (int i = 1; i <= number; i++) {
      System.out.print(i + "の段:");
      for (int j = 1; j <= 9; j++) {
        multiplication = i * j;
        System.out.print(multiplication + " ");
      }
      System.out.println();
    }
  }
}