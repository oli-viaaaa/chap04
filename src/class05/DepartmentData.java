package class05;

public class DepartmentData {
	
	// 필드(공간확보)
	public Department[] depArr = new Department[3];
	
	// 기본생성자
	public DepartmentData() {
		depArr[0] = new Department(920, "컴퓨터공학과", "201호");
		depArr[1] = new Department(923, "산업공학과   ", "207호");
		depArr[2] = new Department(925, "전자공학과   ", "308호");
	}
}
