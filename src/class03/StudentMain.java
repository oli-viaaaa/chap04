package class03;
/*
 *  [학생명단]
  학번 	주민번호	이름 학년	 주소	학과
"1292001", "900424-1825409", "김광식", 3, "서울", 92
"1292002", "900305-1730021", "김정현", 3, "서울", 20
"1292003", "891021-2308302", "김현정", 4, "대전", 55
"1292301", "890902-2704012", "김현정", 2, "대구", 78
"1292303", "910715-1524390", "박광수", 3, "광주", 54
"1292305", "921011-1809003", "김우주", 4, "부산", 88
"1292501", "900825-1506390", "박철수", 3, "대전", 73
"1292502", "911011-1809003", "백태성", 3, "서울", 95
 */

public class StudentMain {
	public static void main(String[] args) {
		// 학생 객체 저장용 객체 배열 생성
		Student[] students = new Student[8];

		// 학생 데이터를 생성해주는 메소드를 만드시오
		initData(students);

		// [문제1] 학생 목록을 출력해주는 메소드를 만드시오
		printStudent(students);
		System.out.println();

		// [문제2] 여학생들의 명단을 출력하시오
		printWomanStudent(students);
		System.out.println();

		// [문제3] 서울에 사는 3학년 학생들의 이름을 구해주는 메소드를 만들고
		// 반환받은 이름을 main 메소드에서 출력하세요
		String[] name = getSeoulStudent(students);
		System.out.println("서울 거주하는 3학년 학생");
		System.out.println("=================");
		for (String str : name) {
			System.out.println(str);
		}
	} // main end

	// [문제3] 서울에 사는 3학년 학생들의 이름을 구해주는 메소드를 만들고
	// 반환받은 이름을 main 메소드에서 출력하세요

	private static String[] getSeoulStudent(Student[] students) {
		String arrName = ""; // 서울 3학년생들의 이름을 이어붙일 String type 변수
		for (Student student : students) {
			if (student.getAddress().equals("서울") && student.getYear() == 3) { // String 경우 .equals로 비교 int는 == 으로 비교
				arrName = arrName + student.getName() + ",";
			}
		}
		String[] resultName = arrName.split(",");
		return resultName;

	}

	// [문제2] 여학생들의 명단을 출력하시오
	private static void printWomanStudent(Student[] students) {
		// String ssn = students[i].getAddress();
		// String woman = ssn.substring(7,8);
		System.out.println("===================== 여학생 명단 =======================");
		for (int i = 0; i < students.length; i++) {
			if (students[i].getJumin().substring(7, 8).equals("2")) {
				System.out.println(students[i].getId() + "\t" + students[i].getJumin() + "\t" + students[i].getName()
						+ "\t" + students[i].getYear() + "\t" + students[i].getAddress() + "\t"
						+ students[i].getDepartment());
			}
		}
	}

	// [문제1]학생 목록을 출력해주는 메소드를 만드시오
	private static void printStudent(Student[] students) {
		System.out.println("   학번 \t       주민번호 \t 이름        학년 \t주소 \t학과");
		System.out.println("====================================================");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].getId() + "\t" + students[i].getJumin() + "\t" + students[i].getName() + "\t"
					+ students[i].getYear() + "\t" + students[i].getAddress() + "\t" + students[i].getDepartment());
		}
	}

	// 학생 데이터를 생성해주는 메소드를 만드시오
	private static void initData(Student[] students) {
		Student student1 = new Student("1292001", "900424-1825409", "김광식", 3, "서울", 92);
		Student student2 = new Student("1292002", "900305-1730021", "김정현", 3, "서울", 20);
		Student student3 = new Student("1292003", "891021-2308302", "김현정", 4, "대전", 55);
		Student student4 = new Student("1292301", "890902-2704012", "김현정", 2, "대구", 78);
		Student student5 = new Student("1292303", "910715-1524390", "박광수", 3, "광주", 54);
		Student student6 = new Student("1292305", "921011-1809003", "김우주", 4, "부산", 88);
		Student student7 = new Student("1292501", "900825-1506390", "박철수", 3, "대전", 73);
		Student student8 = new Student("1292502", "911011-1809003", "백태성", 3, "서울", 95);

		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		students[3] = student4;
		students[4] = student5;
		students[5] = student6;
		students[6] = student7;
		students[7] = student8;
	}

} // class end
