package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		int userAge = 30; // 年代
		int serviceCost; //サービスの使用料金

		//10代 1000円／20代 2000円／30代・40代 3000円／50代・60代・70代 4000円／80代 5000円／その他500円
        //git練習
		serviceCost = switch (userAge) {
		case 10 -> 1000;
		case 20 -> 2000;
		case 30, 40 -> 3000;
		case 50, 60, 70 -> 4000;
		case 80 -> 5000;
		default -> 500;
		};
		
		//料金の取得
		System.out.println(userAge + "代の料金は" + serviceCost + "円");
	}
}
