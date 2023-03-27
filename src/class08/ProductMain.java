package class08;

public class ProductMain {

	public static void main(String[] args) {

		// 데이터를 생성해주는 객체 생성
		ProductData pd = new ProductData(); // product 객체 10개 담을 수 있는 배열
		Product[] products = pd.products;

		// [문제 1.] 전체 상품 목록 출력
		printProduct(products);
		
		// [문제 2.] 세탁기의 가격을 조회하시오
		String temStr = "세탁기";
		getWashPrice(temStr,products);
		System.out.println();
		
		// [문제 3.] 구매하 모든 제품의 총액과 평균 가격을 main메소드에서 출력하시오
		int sum = getTotalAmount(products);
		double avg = getavg(products);
		System.out.println("구매한 모든 제품의  총액 : " +sum+"원");
		System.out.println("구매한 모든 제품의 평균 가격 : " +avg+"원");
		
		// [문제4] 제품 중에서 100만원이 넘는 제품의 목록, 수량, 합계금액 출력
		getProductGrather100(products);
		
	

	} // main end

	
	//[문제1]
	private static void printProduct(Product[] products) {
		System.out.println("[문제1] 전체 상품 목록 출력");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getId()+"\t"+products[i].getName()+"\t"+products[i].getPrice());
		} System.out.println();	
	}
	
	
	//[문제2]
	private static void getWashPrice(String temStr, Product[] products) {
		System.out.println("[문제 2.] 세탁기의 가격을 조회");
		int price = 0;
		for (Product product : products) {
			if (product.getName().equals(temStr)) {
				price = product.getPrice();
				System.out.println(price+"원");
			}
		}
	}
	
	//[문제3] : 총액 구하기
	private static int getTotalAmount(Product[] products) {
		int sum = 0;
		for (int i = 0; i < products.length; i++) {
			sum += products[i].getPrice();	
			System.out.println(products[i].getPrice() + " ");
		}
		System.out.println("getTogalAmout "+sum);
		
		return sum;
	}
	
	//[문제3] : 평균금액 구하기
	private static double getavg(Product[] products) {
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < products.length; i++) {
			sum += products[i].getPrice();		
		}
		System.out.println("getavg sum : " + sum );
		System.out.println("getavg products.length : " + products.length );
		
		avg = (sum*1.0)/products.length;
		System.out.println("getavg "+avg);
		return avg;
	} // int를 int로 나누면 int
	
	
	// [문제4] 제품 중에서 100만원이 넘는 제품의 목록, 수량, 합계 금액 출력
		private static void getProductGrather100(Product[] products) {
			int count = 0;
			int sum = 0;
			System.out.println();
			System.out.println("가격이 100만원 이상인 제품은 다음과 같습니다");
			System.out.println("===============================");
			for (int i = 0; i < products.length; i++) {
				if (products[i].getPrice()>=1000000) {
					System.out.println(products[i].getId()+"\t"+products[i].getName()+"\t"+products[i].getPrice());
					sum += products[i].getPrice();
					 count++; 
				}
			}
			System.out.println();
			System.out.println("100원 이상인 제품의 총합은 "+sum+"원 이며 수량은 "+count+"개 입니다");
			
		}



	

}//class end
