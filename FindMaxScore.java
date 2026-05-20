//public class FindMaxScore {
  //public static void main(String[] args) {
    //int[] scores = {88, 75, 95, 60, 100};
    //int maxvalue = scores[0];
      //for (int score : scores) {
        //if (maxvalue < score ) {
          //maxvalue = score;
      //}
    //}
    //System.out.println(maxvalue);
  //}
//}

public class FindMaxScore {
  public static void main(String[] args) {
    int[] scores = {88, 75, 95, 60, 100};
    int maxScore = scores[0];
    for (int i = 0; i < scores.length; i++){
      maxScore = Math.max(maxScore, scores[i]);
    }
    System.out.println(maxScore);
  }
}

