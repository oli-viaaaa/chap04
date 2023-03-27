package class05;
/*
 * 학과 클래스
 * 920, "컴퓨터공학과", "201호"
 * 923, "산업공학과", "207호"
 * 925, "전자공학과", "308호"
 */

public class DepartmentMain {
	public static void main(String[] args) {
		//Department[] depArr = new Department[3];
		
		// DepartmentData 객체생성
		DepartmentData department = new DepartmentData(); //DepartmentData 객체의 주소가 department로 저장된다
		Department[] dep = department.depArr; //DepartmentData 객체의 필드를 가져옴
		
		// 기초데이터 생성
		//iniData(depArr);

		// [문제1] 학과 목록을 출력하시오
		printDepartment(dep);

		// [문제2] 학과 코드(id)가 "923"인 학과의 코드(ID), name, office를 출력하시오
		getDepartment(dep);

		// [문제3] 컴퓨터공학과의 교실을 조회해서 main메소드에서 출력하세요
		String office = getOffice(dep);
		System.out.println();
		System.out.println("[문제3] 컴퓨터공학과의 교실을 출력하세요");
		System.out.println(office);

		//

	}// main end

	// 기초데이터 생성
	//private static void iniData(Department[] depArr) {
		//depArr[0] = new Department(920, "컴퓨터공학과", "201호");
		//depArr[1] = new Department(923, "산업공학과   ", "207호");
		//depArr[2] = new Department(925, "전자공학과   ", "308호");

	//}

	// [문제1] 학과 목록을 출력하시오
	private static void printDepartment(Department[] depArr) {
		System.out.println("[문제1] 학과 목록을 출력하시오");
		for (int i = 0; i < depArr.length; i++) {
			System.out.println(depArr[i].getName());
		}
		System.out.println();
	}

	// [문제2] 학과 코드(id)가 "923"인 학과의 코드(ID), name, office를 출력하시오
	private static void getDepartment(Department[] depArr) {
		System.out.println("[문제2] 학과 코드(id)가 \"923\"인 학과의 코드(ID), name, office를 출력하시오");
		for (int i = 0; i < depArr.length; i++) {
			if (depArr[i].getId() == 923) {
				System.out.println(depArr[i].getId() + "\t" + depArr[i].getName() + "\t" + depArr[i].getOffice());
			}
		}
	}

	// [문제3] 컴퓨터공학과의 교실을 조회해서 main메소드에서 출력하세요
	private static String getOffice(Department[] depArr) {
		String comName = "";
		// 항목이 1개뿐으로 배열을 선언하면 [] 미스매칭으로 오류 생성됨
		for (Department department : depArr) {
			if (department.getName().equals("컴퓨터공학과")) {
				comName = department.getOffice();
			}
		}
		return comName;

	}

}
