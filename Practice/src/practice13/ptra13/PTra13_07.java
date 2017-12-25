/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Item;
import practice13.common.Slime;
import practice13.common.SuperHero;

public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください

		SuperHero superHero = new SuperHero();

		superHero.setName("勇者（装備あり）");

		Slime slime = new Slime();

		slime.setName("スライム");



		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください

		Item item = new Item("こんぼう", 4);



		// ★ 作成したItemインスタンスをSuperHeroに持たせてください

		superHero.setEquipment(item);


		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

		while(true) {


			int heroHit = superHero.attack();

			boolean slimeDead = slime.damage(heroHit);

			if(slimeDead) {
				System.out.println("勇者はスライムとの戦闘に勝利した");
				break;
			}

			int slimeHit = slime.attack();

			boolean heroDead = superHero.damage(slimeHit);

			if(heroDead) {
				System.out.println("スライムは勇者との戦闘に勝利した");
				break;

			}
		}



	}
}
