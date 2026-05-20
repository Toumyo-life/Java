public class EvenOrOdd {
  public static void main(String[] args) {
    System.out.println("--- Javaにおける条件分岐の基本 ---");

    int number = 75;
    System.out.println("現在のスコア: " + number);

    // スコアが60点以上の場合に「合格です！」と表示
    if (number / 2 == 0) {
      System.out.println("偶数です");
    } else {
      System.out.println("奇数です");
    }
    System.out.println("if文の処理が終了しました。\n");
  }
}