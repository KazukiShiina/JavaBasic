/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		byte by = 100;
		short s = 300;
		char c = '日';
		int i = 1000;
		long l = 2000L;
		float f = 3.14F;
		double d = 453.592;

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください
		
		java.lang.Boolean bb = b;
		java.lang.Byte byby = by;
		java.lang.Short ss = s;
		java.lang.Character cc = c;
		java.lang.Integer  ii = i;
		java.lang.Long ll = l;
		java.lang.Float ff = f;
		java.lang.Double dd = d;
		
		
		System.out.println(bb);
		System.out.println(byby);
		System.out.println(ss);
		System.out.println(cc);
		System.out.println(ii);
		System.out.println(ll);
		System.out.println(ff);
		System.out.println(dd);
		
	}
}
