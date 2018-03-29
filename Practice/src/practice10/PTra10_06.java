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
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[]cars = new Car[3];
		
		Car car1 = new Car();
		car1.serialNo = 10000;
		car1.color = "Red";
		car1.gasoline = 50;
		
		Car car2 = new Car();
		car2.serialNo = 20000;
		car2.color = "blue";
		car2.gasoline = 40;
		
		Car car3 = new Car();
		car3.serialNo = 30000;
		car3.color = "black";
		car3.gasoline = 80;
		
		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;
		
		for (int i = 0; i < cars.length; i++) {
			int distance = 300;
			
			while(true) {
				
				distance -= cars[i].run();

				if(cars[i].gasoline < 0) {
					System.out.println("目的地に到達できませんでした");
					break;
				}	

				if(distance < 0 ){
					
					int x = cars[i].gasoline;
					
					if(cars[i] == car1) {
						int n1 = 50 - car1.gasoline;
						System.out.println("目的地までに"+n1+"時間かかりました。残りのガソリンは、"+x+"リットルです");
						break;
				}
				
					if(cars[i] == car2) {
						int n2 = 40 - car2.gasoline;
						System.out.println("目的地までに"+n2+"時間かかりました。残りのガソリンは、"+x+"リットルです");
						break;
				}
				
				if(cars[i] == car3){
						int n3 = 80 - car3.gasoline;
						System.out.println("目的地までに"+n3+"時間かかりました。残りのガソリンは、"+x+"リットルです");
						break;
					}
				}
			}
		}
	}
}
