public calss VariableUnderstanding {
  public static void main(String[] args) {
    system.out.printin("---1. 変数の宣言と初期化 ---")
        //変数の宣言：「箱を用意する」
        //データ型　変数名; の形式で記述します
        int age; //int型のageという名前の変数を宣言

        //変数の初期化（代入）：「箱に値を最初に入れる」
        //変数名　＝値; の形式で記述します。
        age = 30; //age変数に30という値を代入（初期化）
        System.out.println("私の年齢:" + age + "歳");

        //変数の宣言と初期化を同時に行うことも可能です。
        //データ型　変数名= 値; の形式で記述します。
        string name = "田中";//string型のname変数を宣言し、「田中」で初期化
        System.out.println("私の名前:" + name);

    System.out.println("\n--- 3. 変数の値の変更（再代入） ---");
        // 変数に一度値を代入した後でも、別の値を再代入することができます。
        int score = 80;
        System.out.println("初期スコア: " + score);

        score = 95; // score変数に新しい値95を再代入
        System.out.println("更新後のスコア: " + score);

        // 変数同士の代入も可能です。
        int currentScore = score; // scoreの値をcurrentScoreに代入
        System.out.println("現在のスコア: " + currentScore);

    System.out.println("\n--- 4. 変数の命名規則と慣習 ---");
        // 変数名にはルールと、可読性を高めるための慣習があります。

        // 【ルール】
        // 1. 英数字、アンダースコア(_)、$のみが使える。
        // 2. 数字で始まることはできない。
        // 3. Javaの予約語（例: int, public, classなど）は使えない。
        // 4. 大文字と小文字は区別される (ageとAgeは別の変数)。

        // 良い例（慣習に則ったもの）
        int studentCount = 15; // 複数の単語は最初の単語は小文字、それ以降は大文字で始める (camelCase)
        String userFirstName = "太郎";
        boolean isActiveUser = true;

        System.out.println("学生数: " + studentCount + ", ユーザー名: " + userFirstName + ", アクティブユーザー: " + isActiveUser);

        // 悪い例（コメントアウトしてあります）
        // int 1stStudent = 5;      // 数字から始まるためNG
        // int public = 10;         // 予約語のためNG
        // int my-variable = 20;    // ハイフンは使えないためNG
        // int 学籍番号 = 100;      // 日本語は避けるべき (ルール上は可能だが非推奨)

    System.out.println("\n--- 5. 定数（finalキーワード） ---");
        // `final`キーワードを付けて変数を宣言すると、その値は一度初期化したら変更できなくなります。
        // これを「定数」と呼びます。定数名は慣習としてすべて大文字で記述し、単語間はアンダースコアで繋ぎます。
        final double PI = 3.14159;
        final String APP_VERSION = "1.0.0";

        System.out.println("円周率: " + PI);
        System.out.println("アプリケーションバージョン: " + APP_VERSION);

        // PI = 3.0; // ← これを実行しようとするとコンパイルエラーになります（コメントアウト解除して確認してみてください）
        // System.out.println("変更しようとしたPI: " + PI);
    System.out.println("\n--- 6. 変数のスコープ ---");
        // 変数には「スコープ」と呼ばれる有効範囲があります。
        // 変数は宣言されたブロック（{}で囲まれた範囲）内でしか利用できません。
        { // ここから新しいブロック
            int innerValue = 100; // このinnerValueは{}のブロック内でのみ有効
            System.out.println("ブロック内のinnerValue: " + innerValue);
        } // ここでブロックが終了し、innerValueは消滅します

        // System.out.println("ブロック外のinnerValue: " + innerValue); // ← innerValueはここで利用できないため、コンパイルエラーになります

        // mainメソッド内で宣言されたageやnameなどの変数は、mainメソッド全体で有効です。
        System.out.println("mainメソッド内のage (スコープOK): " + age);
}
}