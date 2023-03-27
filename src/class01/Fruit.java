package class01;

/*
 * 과일 클래스(객체 생성, 설계)
 * 필드(멤버 변수, 인스턴스_객체 변수)
 * 	- String name
 * 	- int price
 * 	- int quantity
 * 
 * setter 값 저장
 * getter 값 가져오는 것
 */

public class Fruit {
	// 필드(멤버 변수, 인스턴스_객체 변수)
	private String name;
	private int price;
	private int quantity;
	
	
	// 기본 생성자(생성자=초기화)
	public Fruit() {
	}
	
	// 생성자 오버로딩 
	public Fruit(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this. price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	
}
