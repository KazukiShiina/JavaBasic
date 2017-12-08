package practice02;
/*
 * PTra02_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra02_06 {
	public static void main(String[] args) {
		int x = 10;
		int y = 50;

		int l=5;

		System.out.println("x:" + x*l);
		System.out.println("y:" + y/5);

		int z = x;
		x = y;
		y = z;

		// ★ 変数 x, y の値をリテラルの数字を使わずに入れ替えてください
		// ※プログラムは何行書いても良いです


		// ここから下は修正しないでください
		System.out.println("x:" + x);	// 「x:50」が出力される
		System.out.println("y:" + y);	// 「y:10」が出力される
	}
}
