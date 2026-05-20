/**
 * MyFirstJavaApp.java
 *
 * このプログラムは、Javaにおけるコンパイルと実行の基本的な流れを示すサンプルです。
 * コマンドライン引数があればそれを表示し、なければ標準の挨拶を表示します。
 */
public class MyFirstJavaApp {

    /**
     * Javaプログラムのエントリポイント（ここから実行が開始される）。
     *
     * @param args コマンドライン引数が格納されるString型の配列
     */
    public static void main(String[] args) {
        // メイン処理の開始をログに出力
        System.out.println("--- Javaプログラムを開始します ---");

        // コマンドライン引数があるかチェック
        if (args.length > 0) {
            // 引数がある場合、それらを結合して表示
            System.out.println("こんにちは、" + String.join(" と ", args) + "さん！");
            System.out.println("引数として以下の値が渡されました：");
            for (int i = 0; i < args.length; i++) {
                System.out.println("  args[" + i + "] = \"" + args[i] + "\"");
            }
        } else {
            // 引数がない場合、一般的なメッセージを表示
            System.out.println("こんにちは、Javaの世界へようこそ！");
            System.out.println("引数を指定して実行することもできます。例: java MyFirstJavaApp Alice Bob");
        }

        // プログラムの終了をログに出力
        System.out.println("--- Javaプログラムを終了します ---");
    }
}