package p1;

import java.util.Random;

public class Class1 {

	public static void main(String[] args) {

		// キャラクター名
		String m1 = "おばけ";
		String m2 = "スライム";
		String m3 = "箱太郎";

		// ヒットポイント
		int hp1 = 60;
		int hp2 = 120;
		int hp3 = 280;

		// ダメージ量（一旦乱数を使用）
		int da1 = new Random().nextInt(30);
		int da2 = new Random().nextInt(30);

		System.out.println("モンスターが現れた。");
		System.out.println("--------------------");
		System.out.println(m1 + "       HP: " + hp1);
		System.out.println(m2 + "     HP: " + hp2);
		System.out.println(m3 + "       HP: " + hp3);
		System.out.println("--------------------");

		System.out.println("勇者の攻撃!");
		System.out.println("おばけに" + da1 + "のダメージ");
		hp1 = hp1 - da1;

		System.out.println("勇者の連続攻撃!");
		System.out.println("おばけに" + da2 + "のダメージ");
		hp1 = hp1 - da2;

		System.out.println("合計" + (da1 + da2) + "のダメージ");

		System.out.println("--------------------");
		System.out.println(m1 + "       HP: " + hp1);
		System.out.println(m2 + "     HP: " + hp2);
		System.out.println(m3 + "       HP: " + hp3);
		System.out.println("--------------------");

		int heal = new Random().nextInt(30);

		System.out.println("おばけの回復魔法！");
		System.out.println("おばけはHPを" + heal + "回復した。");

		hp1 = hp1 + heal;

		System.out.println("--------------------");
		System.out.println(m1 + "       HP: " + hp1);
		// (hp1 + heal)でも可能 ただし順序に違和感を感じるので別で計算式を記述
		System.out.println(m2 + "     HP: " + hp2);
		System.out.println(m3 + "       HP: " + hp3);
		System.out.println("--------------------");

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
