package p1;

public class Class1 {

	public static void main(String[] args) {

		String m1 = "おばけ";
		String m2 = "スライム";
		String m3 = "箱太郎";

		int hp1 = 60;
		int hp2 = 120;
		int hp3 = 280;

		System.out.println("モンスターが現れた。");
		System.out.println("--------------------");
		System.out.println(m1 + "       HP: " + hp1);
		System.out.println(m2 + "     HP: " + hp2);
		System.out.println(m3 + "       HP: " + hp3);
		System.out.println("--------------------");
		System.out.println("勇者の攻撃");
		System.out.println("おばけに20のダメージ");
		
		hp1 = hp1-20;
		
		System.out.println("--------------------");
		System.out.println(m1 + "       HP: " + hp1);
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
