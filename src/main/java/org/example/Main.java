package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {

  public static void main(String[] args) {
    /*
    正規表現を使用して、ハイフン付きの国内携帯電話番号の有効性をチェックするプログラムを作成してください。
    有効な携帯電話番号の条件を自分で定義し、その条件に合致するかどうかを判定してください。

    入力例:
    携帯電話番号を入力してください: 080-1234-5678

期待される出力例:
    080-1234-5678 は有効な携帯電話番号です。

入力例:
    携帯電話番号を入力してください: 08012345678

期待される出力例:
    08012345678 は無効な携帯電話番号です。
     */

    Scanner scanner = new Scanner(System.in);

    //正規表現パターン
    String phoneNumberRegex = "^\\d{3}-\\d{4}-\\d{4}$";
    Pattern pattern = Pattern.compile(phoneNumberRegex);

    boolean judge = false;

    System.out.println("携帯電話番号を入力してください(例：xxx-xxxx-xxxx):");
    String phoneNumber = scanner.nextLine();

    //正規表現マッチャー
    Matcher matcher = pattern.matcher(phoneNumber);

    if (matcher.matches()) {
      System.out.println(phoneNumber + "は有効な携帯電話番号です。");
    } else {
      System.out.println(phoneNumber + "は無効な携帯電話番号です。");
    }
  }
}
