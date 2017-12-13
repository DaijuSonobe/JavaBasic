package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地までn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		car1.color = "Blue";
		car2.color = "Green";
		car3.color = "White";

		car1.gasoline = 500;
		car2.gasoline = 400;
		car3.gasoline = 300;

		final int distance = 300;


		int total = 0;
		int count = 0;

		while(true) {
			int runrun1 = car1.run();

			count++;

			total += runrun1;

			if(distance < total) {
				System.out.println("目的地まで" + count + "時間かかりました。残りのガソリンは、" + car1.gasoline + "リットルです");
				break;
			}

		}

		while(true) {
			int runrun2 = car2.run();

			count++;

			total += runrun2;

			if(distance < total) {
				System.out.println("目的地まで" + count + "時間かかりました。残りのガソリンは、" + car2.gasoline + "リットルです");
				break;
			}

		}

		while(true) {
			int runrun3 = car3.run();

			count++;

			total += runrun3;

			if(distance < total) {
				System.out.println("目的地まで" + count + "時間かかりました。残りのガソリンは、" + car3.gasoline + "リットルです");
				break;
			}

		}

	}
}
