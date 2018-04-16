/*
 * PTra15_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import practice15.common.Java2Month;

public class PTra15_02 {
	public static void main(String[] args) {

		Java2Month room = new Java2Month();
		// Room型 を Java2Month型 に変更しました。

		// roomに格納されたJava2MonthインスタンスのgetCurriculumメソッドを呼び出してください


		// 取得したカリキュラム情報を全て出力してください
		
		String[] s = new String[7];
		
		
		
		for (int i = 0; i < s.length; i++) {
			s[i] = room.getCurriculum()[i];
			System.out.println(s[i]);
						
			
		}
	}
}
