public class ArrayTraining {

    public static void main(String[] args) {

        System.out.println("--- 1. 配列（単一次元配列） ---");

        // 1.1. 宣言と初期化
        System.out.println("\n--- 1.1. 宣言と初期化 ---");

        // (1) サイズを指定して宣言・初期化（要素はデフォルト値）
        int[] numbers = new int[5]; // int型の配列を5つの要素で作成
        System.out.println("int配列 'numbers' の初期状態 (サイズ5):");
        // 配列の内容を簡単に表示するために Arrays.toString() を利用
        // (import java.util.Arrays; が必要)
        System.out.println(java.util.Arrays.toString(numbers)); // => [0, 0, 0, 0, 0]

        String[] names = new String[3]; // String型の配列を3つの要素で作成
        System.out.println("String配列 'names' の初期状態 (サイズ3):");
        System.out.println(java.util.Arrays.toString(names)); // => [null, null, null]

        // (2) 要素の値を指定して宣言・初期化
        String[] fruits = {"Apple", "Banana", "Cherry"};
        System.out.println("String配列 'fruits' (初期値指定):");
        System.out.println(java.util.Arrays.toString(fruits)); // => [Apple, Banana, Cherry]

        double[] prices = {100.5, 200.0, 50.75};
        System.out.println("double配列 'prices' (初期値指定):");
        System.out.println(java.util.Arrays.toString(prices)); // => [100.5, 200.0, 50.75]

        // (3) 宣言と初期化を別々に行う
        char[] letters; // 宣言
        letters = new char[4]; // 初期化
        letters[0] = 'J';
        letters[1] = 'A';
        letters[2] = 'V';
        letters[3] = 'A';
        System.out.println("char配列 'letters' (別々に宣言・初期化):");
        System.out.println(java.util.Arrays.toString(letters)); // => [J, A, V, A]

        System.out.println("\n\n--- 2. 多次元配列 ---");

        // 2.1. 宣言と初期化
        System.out.println("\n--- 2.1. 宣言と初期化 ---");

        // (1) サイズを指定して宣言・初期化（全要素をデフォルト値）
        // 3行4列のint型2次元配列
        int[][] matrix = new int[3][4];
        System.out.println("int型2次元配列 'matrix' (3行4列) の初期状態:");
        // 2次元配列の表示には Arrays.deepToString() を利用
        System.out.println(java.util.Arrays.deepToString(matrix));
        // => [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

        // (2) 要素の値を指定して宣言・初期化
        int[][] coordinates = {
            {1, 2}, // 1行目
            {3, 4}, // 2行目
            {5, 6}  // 3行目
        };
        System.out.println("int型2次元配列 'coordinates' (初期値指定):");
        System.out.println(java.util.Arrays.deepToString(coordinates));
        // => [[1, 2], [3, 4], [5, 6]]

        String[][] board = {
            {"X", "O", "X"},
            {"O", "X", "O"},
            {"X", "O", "X"}
        };
        System.out.println("String型2次元配列 'board' (初期値指定):");
        System.out.println(java.util.Arrays.deepToString(board));
        // => [[X, O, X], [O, X, O], [X, O, X]]

        // ArrayTrainingクラスのmainメソッド内に記述

        System.out.println("\n--- 2.2. 要素へのアクセス ---");

        int[][] gameBoard = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        System.out.println("配列 gameBoard:\n" + java.util.Arrays.deepToString(gameBoard));

        // 1行1列目 (インデックス[0][0]) の要素にアクセス
        System.out.println("1行1列目の要素: " + gameBoard[0][0]); // 1

        // 2行3列目 (インデックス[1][2]) の要素にアクセス
        System.out.println("2行3列目の要素: " + gameBoard[1][2]); // 0

        // 要素の値を変更
        gameBoard[0][1] = 9; // 1行2列目の値を9に変更
        System.out.println("変更後の gameBoard:\n" + java.util.Arrays.deepToString(gameBoard));
        // => [[1, 9, 0], [0, 1, 0], [0, 0, 1]]

        System.out.println("\n--- 2.4. ジャグ配列（不規則配列） ---");

        // ジャグ配列の宣言 (行数は指定するが、列数は指定しない)
        int[][] jaggedArray = new int[3][]; // この時点では、jaggedArray[0], [1], [2]はすべてnull

        // 各行（内側の配列）を異なるサイズで初期化
        jaggedArray[0] = new int[5]; // 1行目は5つの要素を持つ配列を割り当て
        jaggedArray[1] = new int[2]; // 2行目は2つの要素を持つ配列を割り当て
        jaggedArray[2] = new int[3]; // 3行目は3つの要素を持つ配列を割り当て

        // 要素に値を代入 (例として簡単な値を代入)
        // 各行の配列の長さに合わせてループを回す
        for (int i = 0; i < jaggedArray[0].length; i++) jaggedArray[0][i] = i + 1;
        for (int i = 0; i < jaggedArray[1].length; i++) jaggedArray[1][i] = (i + 1) * 10;
        for (int i = 0; i < jaggedArray[2].length; i++) jaggedArray[2][i] = (i + 1) * 100;

        System.out.println("ジャグ配列 jaggedArray:\n" + java.util.Arrays.deepToString(jaggedArray));
        // 出力例: [[1, 2, 3, 4, 5], [10, 20], [100, 200, 300]]
    }
}