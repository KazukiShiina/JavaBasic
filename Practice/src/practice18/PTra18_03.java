/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		 ArrayList<Player> array = new ArrayList<>();
	        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {
	                String line = scanner.nextLine();
	                // ★ 1行ごとにArrayListに格納してください
	                Player p = new Player();
	                
	                String[] r = line.split(",",0);
	                
	               p.setPosition(r[0]);
	               p.setName(r[1]);
	               p.setCountry(r[2]);
	               p.setTeam(r[3]);
	               
	                
	                array.add(p);
	                array.remove(array.indexOf("レアル・マドリード"));

	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
	      
	       

		// ★ 削除後のArrayListの中身を全件出力してください
	        
	        for(Player play : array ) {
        		System.out.println(play.toString());
        }

	}
}
