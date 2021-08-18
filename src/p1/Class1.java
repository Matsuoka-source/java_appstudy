package p1;

import java.util.Random;

public class Class1 {

	public static void main(String[] args) {

		// 主人公キャラ
		String p1 = "勇者";
		String p2 = "魔法使い";

		// 敵キャラクター名
		String m1 = "おばけ";
		String m2 = "スライム";
		String m3 = "箱太郎";

		// ヒットポイント
		int hp1 = 60;
		int hp2 = 120;
		int hp3 = 280;

		// ダメージ量（一旦乱数を使用）
		// 勇者の攻撃
		int da1 = new Random().nextInt(100);
		// 魔法使いの攻撃
		int da2 = new Random().nextInt(100);

		// バトルの開始
		// パラメーターの表示
		System.out.println("モンスターが現れた。");
		System.out.println("--------------------");
		System.out.println(m1 + "       HP: " + hp1);
		System.out.println(m2 + "     HP: " + hp2);
		System.out.println(m3 + "       HP: " + hp3);
		System.out.println("--------------------");

		// 勇者の攻撃は単体
		System.out.println(p1 + "の攻撃!");
		System.out.println("おばけに" + da1 + "のダメージ");
		hp1 = hp1 - da1;

		// 魔法使いの攻撃は全体(ダメージ量一律)
		System.out.println(p2 + "の攻撃!");
		System.out.println(m1 + "に" + da2 + "のダメージ");
		System.out.println(m2 + "に" + da2 + "のダメージ");
		System.out.println(m3 + "に" + da2 + "のダメージ");
		hp1 = hp1 - da2;
		hp2 = hp2 - da2;
		hp3 = hp3 - da2;

		// パラメーターの表示
		System.out.println("--------------------");
		System.out.println(m1 + "       HP: " + hp1);
		System.out.println(m2 + "     HP: " + hp2);
		System.out.println(m3 + "       HP: " + hp3);
		System.out.println("--------------------");

		// おばけのHPが0以下だった場合
		if (hp1 <= 0) {
			System.out.println(m1 + "は倒れた!!");
		}
		// スライムのHPが0以下だった場合
		if (hp2 <= 0) {
			System.out.println(m2 + "は倒れた!!");
		}
		// 箱太郎のHPが0以下だった場合
		if (hp3 <= 0) {
			System.out.println(m3 + "は倒れた!!");
		}

		// 余裕判定
		if (da1 + da2 <= 50) {
			System.out.println(m1 + "は余裕でほほ笑んだ!");
		}
		if (da2 <= 50) {
			System.out.println(m2 + "は余裕でほほ笑んだ!");
		}
		if (da2 <= 50) {
			System.out.println(m3 + "は余裕でほほ笑んだ!");
		}

		// 回復の乱数
		// int heal = new Random().nextInt(30);
		//
		// System.out.println("おばけの回復魔法！");
		// System.out.println("おばけはHPを" + heal + "回復した。");
		// hp1 = hp1 + heal;
		//
		// System.out.println("--------------------");
		// System.out.println(m1 + " HP: " + hp1);
		// (hp1 + heal)でも可能 ただし順序に違和感を感じるので別で計算式を記述
		// System.out.println(m2 + " HP: " + hp2);
		// System.out.println(m3 + " HP: " + hp3);
		// System.out.println("--------------------");
		//
		// String m = "スライム";
		// String p = "勇者";

		// System.out.println(m + "が現れた");
		// System.out.println(p + "は" + m + "に攻撃");
		// System.out.println(m + "は250のダメージ");
		// System.out.println(m + "を倒した");
		// パラメーターの表示
		// System.out.println("----------------------------");
		// System.out.println("なまえ HP MP");
		// System.out.println("ゆうと 350 30");
		// System.out.println("かぐら 200 140");
		// System.out.println("----------------------------");

	}

}
