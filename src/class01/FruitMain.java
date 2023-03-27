package class01;

/*
 * 실행 클래스
 */

public class FruitMain {

	public static void main(String[] args) {

		// 객체 한개 생성
		Fruit peach = new Fruit(); // 객체생성 연산자(new), 필드 초기화(Fruit)
		peach.setName("복숭아");
		peach.setPrice(6500);
		peach.setQuantity(5);

		printFruit(peach);

		Fruit apple = new Fruit("사과", 2000, 5);
		Fruit mango = new Fruit("망고", 1000, 2);
		Fruit banana = new Fruit("바나나", 2500, 3);
		Fruit pineapple = new Fruit("파인애플", 5000, 1);
		Fruit orange = new Fruit("오렌지", 6000, 4);
		// "사과", 2000, 5 (apple)
		// "망고", 1000, 2 (mango)
		// "바나나", 2500, 3 (banana)
		// "파인애플", 5000, 1 (pineapple)
		// "오렌지", 6000, 4 (orange)

		printFruit(apple, mango, banana, pineapple, orange); // 주소

		// 과일 객체 5개 담을 수 있는 Array 선언
		Fruit[] fruits = new Fruit[5];
		// 선언한 배열에 위에서 만든 과일객체 담으세요.
		fruits[0] = apple;
		fruits[1] = mango;
		fruits[2] = banana;
		fruits[3] = pineapple;
		fruits[4] = orange;

		printFruit(fruits);

	} // main end

	private static void printFruit(Fruit[] fruits) {
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i].getName() + "\t" + fruits[i].getPrice() + "\t" + fruits[i].getQuantity());
		}
	} 

	private static void printFruit(Fruit apple, Fruit mango, Fruit banana, Fruit pineapple, Fruit orange) {
		System.out.println(apple.getName() + "\t" + apple.getPrice() + "\t" + apple.getQuantity());
		System.out.println(mango.getName() + "\t" + mango.getPrice() + "\t" + mango.getQuantity());
		System.out.println(banana.getName() + "\t" + banana.getPrice() + "\t" + banana.getQuantity());
		System.out.println(pineapple.getName() + "\t" + pineapple.getPrice() + "\t" + pineapple.getQuantity());
		System.out.println(orange.getName() + "\t" + orange.getPrice() + "\t" + orange.getQuantity());
		System.out.println();
	}

	private static void printFruit(Fruit peach) {
		System.out.println(peach.getName() + "\t" + peach.getPrice() + "\t" + peach.getQuantity());
		System.out.println();
	}

}
