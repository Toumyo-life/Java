public class AboveAverageCounter {
  public static void main(String[] args) {
    int[] grades = {72, 85, 91, 65, 78};
    int sum = 0;
      for (int i = 0; i < grades.length; i++){
        int value = grades[i];
        if (i < grades.length){
          sum += value;
        }
      }
      int average = sum / grades.length;
      System.out.println(average);
  }
}