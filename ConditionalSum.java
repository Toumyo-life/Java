public class ConditionalSum {
  public static void main(String[] args) {
    int[] numbers = {15, 20, 33, 40, 52};
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      int value = numbers[i];
      if (value % 3 == 0 && value % 5 != 0){
        sum = sum + value;
      }
    }
    System.out.println(sum);
  }
}