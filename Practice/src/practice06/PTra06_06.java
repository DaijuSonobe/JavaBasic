package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 */


		for(int i = 1; i < 6; i++) {
			for(int ii = 1; ii < 6; ii++) {
				if(i-1 < ii) {
					System.out.print("□");
				}else {
					System.out.print("■");
				}
			}
			System.out.println();
		}
	}
}
