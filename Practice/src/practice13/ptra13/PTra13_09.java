/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;
import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください

		Employee[] employeers = new Employee[3];

		for (int i = 0; i < employeers.length; i++) {
			Employee a = new Employee();
			employeers[i] = a;
			
			a.setUserNm(NAMEDATA[i]);
			a.setMail(MAILDATA[i]);
			a.setPassword(PASSDATA[i]);
			a.setDepartmentNm(QUATERDATA[0][i]);
			a.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][i]));

		}

		for (int i = 0; i < employeers.length; i++) {
			System.out.println(employeers[i].getUserNm());
			System.out.println(employeers[i].getMail());
			System.out.println(employeers[i].getPassword());
			System.out.println(employeers[i].getDepartmentNm());
			System.out.println(employeers[i].getDepartmentCnt());
		}

	}
}
