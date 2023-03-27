package class08;

public class Product {

	// 필드
	int  id;
	String name;
	int price;
	
	// 기본생성자 
	public Product() {
	}

	// 오버로딩 생성자
	public Product(int  id,String name,int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
