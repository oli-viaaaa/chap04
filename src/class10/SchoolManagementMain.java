package class10;

import class02.Professor;
import class04.Student;
import class05.Department;
import class06.Takes;
import class10.vo.MakeData;

public class SchoolManagementMain {

	public static void main(String[] args) {

		// 데이터 생성
		MakeData md = new MakeData();
		Student[] students = md.students;
		Department[] departments = md.depArr;
		Takes[] takes = md.takes;
		Professor[] professors = md.professors;
		
		
		// [문제.1] 전체 학생 명단을 출력하되 학생의 소속 학과를 함께 출력하시오
		int code = 0;
		String name = "";
		for (int i = 0; i < students.length; i++) {
			code = students[i].getDepartment(); // code에 소속 학과 숫자 저장
			for (int j = 0; j < departments.length; j++) {
				if (departments[j].getId() == code) {
					name = departments[j].getName();
				}
			}
			System.out.println(students[i].getId() + "\t" + students[i].getJumin() + "\t" + students[i].getName() + "\t"
					+ students[i].getYear() + "\t" + students[i].getAddress() + "\t" + students[i].getDepartment()
					+ "\t" + name);
			System.out.println();
		}

		// [문제.2] 전체 학생 명단을 출력하되 학생의 점수를 함께 출력하시오
		// 학생 + 성적
		for (Student s : students) { // 학생테이블에서 가져옴
			for (Takes t : takes) { // 가져온 학생테이블 내용에 성적 테이블 가져옴
				if (s.getId().equals(t.getId())) { // 학생테이블의 학번과 성적테이블의 학번이 동일할때
					System.out.println(s.getId() + "\t" + s.getJumin() + "\t" + s.getName() + "\t" + s.getYear() + "\t"
							+ s.getAddress() + "\t" + s.getDepartment() + "\t" + t.getSubject() + "\t" + t.getScore());
				}
			}
		}

		// [문제.3] 컴퓨터 공학과 교수들을 모두 조회하시오
		// 컴퓨터 공학과 + 교수명단
		// 1. 학과 배열에서 컴퓨터공학과 코드 찾기
		// 2. 코드로 교수 배열에 해당하는 교수찾기
		int code2 = 0;
		String searchDept = "컴퓨터공학과";
		System.out.println();
		System.out.println("컴퓨터 공학과 교수들을 모두 조회하시오");
		for (int i = 0; i < departments.length; i++) {
			if (departments[i].getName().equals(searchDept)) {
				code2 = departments[i].getId();
			}
		}
		for (Professor professor : professors) {
			if (professor.getDepartment() == code2) {
				System.out.println(professor.getId() + "\t" + professor.getJumin() + "\t" + professor.getName() + "\t"
						+ professor.getDepartment() + "\t" + professor.getGrade() + "\t" + professor.getHiredate()+"\t"+searchDept);
			}

		}

	}// main end
} // class end
