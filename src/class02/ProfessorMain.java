package class02;

public class ProfessorMain {

	public static void main(String[] args) {

		// ﻿6명의 교수 객체를 각각의 Professor type변수에 만드세요.
		Professor professor1 = new Professor("92001", "590327-1839240", "이태규", 920, "교수", "1997");
		Professor professor2 = new Professor("92002", "690702-1350026", "고희석", 910, "부교수", "2003");
		Professor professor3 = new Professor("92301", "741011-2765501", "최성희", 910, "부교수", "2005");
		Professor professor4 = new Professor("92302", "750728-1102458", "김태석", 920, "교수", "1999");
		Professor professor5 = new Professor("92501", "620505-1200546", "박철재", 900, "조교수", "2007");
		Professor professor6 = new Professor("92502", "740101-1830264", "장민석", 910, "부교수", "2005");

		System.out.println("교수ID \t       주민번호 \t 성명 \t학과         Grade   입사일자 \n");
		System.out.println("=====================================================");
		System.out.println();

		// 교수 객체 저장용 객체 배열 생성
		Professor[] proArray = new Professor[6];
		proArray[0] = professor1;
		proArray[1] = professor2;
		proArray[2] = professor3;
		proArray[3] = professor4;
		proArray[4] = professor5;
		proArray[5] = professor6;

		// 교수들의 목록을 출력해주는 메소드를 만드세요.
		printProfessor(proArray);
		System.out.println("======================================================");

		// 910 학과 교수중 입사년도가 2005년인 교수는?(2조건)
		getHireDate2005(proArray);
		System.out.println();

		// 주민번호가 590327-1839240인 이태규 교수가 퇴직했다.
		// 새로 입사한 선명규 교수를 그 자리에 저장하세요.
		// (빈객체 생성 후 setter 메소드로 값 저장)
		// "96031", "790208-1884203", "선명규", 920, "부교수", "2021"

		Professor proArray2 = new Professor();
		proArray2.setId("96031");
		proArray2.setJumin("790208-1884203");
		proArray2.setName("선명규");
		proArray2.setDepartment(920);
		proArray2.setGrade("부교수");
		proArray2.setHiredate("2021");

		proArray[0] = professor2;

		System.out.println("교수ID \t       주민번호 \t 성명 \t학과         Grade   입사일자 \n");
		System.out.println("=====================================================");

		// 교수들의 목록을 출력해주는 메소드 호출
		newProfessor(proArray);

	} // main end

	// [과제]주민번호가 590327-1839240인 이태규 교수가 퇴직했다.
	// 새로 입사한 선명규 교수를 그 자리에 저장하세요.
	// (빈객체 생성 후 setter 메소드로 값 저장)
	// "96031", "790208-1884203", "선명규", 920, "부교수", "2021"
	private static void newProfessor(Professor[] proArray) {
		// 전체배열에서 이태규 교수 찾기
		for (int i = 0; i < proArray.length; i++) {
			// 이태규 교수 객체이면
			if (proArray[i].getJumin().equals("590327-1839240") && (proArray[i].getName().equals("이태규"))) {
				// 새로운 교수 객체 생성
				Professor proArray2 = new Professor();
				proArray2.setId("96031");
				proArray2.setJumin("790208-1884203");
				proArray2.setName("선명규");
				proArray2.setDepartment(920);
				proArray2.setGrade("부교수");
				proArray2.setHiredate("2021");

				proArray[0] = proArray2;
			}
		}
		for (Professor professor : proArray) {
			System.out.println(professor.getId() + "\t" + professor.getJumin() + "\t" + professor.getName()
					+ "\t" + professor.getDepartment() + "\t" + professor.getGrade() + "\t" + professor.getHiredate());
		}

	}

	// 910 학과 교수중 입사년도가 2005년인 교수
	private static void getHireDate2005(Professor[] proArray) {
		for (Professor professor : proArray) {
			if (professor.getDepartment() == 910 && professor.getHiredate().equals("2005")) {
				System.out.printf("%s %s %s %d %s %s \n", professor.getId(), professor.getJumin(), professor.getName(),
						professor.getDepartment(), professor.getGrade(), professor.getHiredate());
			}
		}
		// 교수명단 출력
		printProfessor(proArray);

	}

	// 교수 목록 출력 메소드
	private static void printProfessor(Professor[] proArray) {
		for (int i = 0; i < proArray.length; i++) {
			System.out.println(proArray[i].getId() + "\t" + proArray[i].getJumin() + "\t" + proArray[i].getName() + "\t"
					+ proArray[i].getDepartment() + "\t" + proArray[i].getGrade() + "\t" + proArray[i].getHiredate());
		}
	}

}
