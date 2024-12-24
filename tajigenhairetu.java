
public class tajigenhairetu {

	public static void main(String[] args) {
		// 多次元配列とは配列の要素の中にさらに小さな箱を入れて管理する
		String[][] country = {
				{"日本","タイ"},
				{"アメリカ","ブラジル"},
				{"フランス","ロシア"}
		};
		System.out.println(country[0][0]);
		System.out.println(country[0][1]);
		System.out.println(country[1][0]);
		System.out.println(country[1][1]);
		System.out.println(country[2][1]);
		System.out.println(country[2][1]);
		
		//別パターンの書き方
		String[][] country2 = new String[3][2];
		
		country2[0][0] = "日本";
		country2[0][1] = "タイ";
		country2[1][0] = "アメリカ";
		country2[1][1] = "ブラジル";
		country2[2][0] = "フランス";
		country2[2][1] = "ロシア";
		
		System.out.println(country2[0][0]);

	}

}
