package class01;
/*
 * 실행클래스 
 */

public class EmployeeMain {

	public static void main(String[] args) {
		// Employee type Array 선언(10칸 짜리)
		Employee[] emps = new Employee[10];

		// Raw Date로 각 배열에 객체를 생성해서 저장
		emps[0] = new Employee("A", 28, 400, "KR", 10, "정규");
		emps[1] = new Employee("B", 27, 600, "KR", 15, "정규");
		emps[2] = new Employee("C", 26, 280, "JP", 1, "비정규");
		emps[3] = new Employee("D", 25, 360, "JP", 2, "비정규");
		emps[4] = new Employee("E", 23, 270, "RU", 1, "정규");
		emps[5] = new Employee("F", 27, 390, "AM", 4, "정규");
		emps[6] = new Employee("G", 31, 330, "SI", 3, "정규");
		emps[7] = new Employee("H", 35, 280, "CA", 2, "비정규");
		emps[8] = new Employee("I", 38, 450, "FR", 10, "정규");
		emps[9] = new Employee("J", 45, 600, "JP", 15, "정규");

		// 1. 배열을 받아서 전사원 목록을 출력해주는 메소드 생성
		System.out.println("1. 전 사원들의 목록");
		// 배열을 받아서 전사원 목록을 출력해주는 메소드
		printEmployee(emps);
		System.out.println();

		// 2. 정규직 평균급여를 구해주는 메소드 생성(결과 반환)
		double avg = getSalAvg(emps);
		System.out.println("2. 정규직 직원들의 평균 급여는 : " + Math.round(avg*100)/100.0);
		// 출력 결과 : 2. 정규직 직원들의 평균 급여는 : 434.29
		// Math.round -> math 객체 생성 안함. round가 static 영역으로 존재하기 때문에 사용
		// Math.round 소수점 뒷자리 반올림함 원하는 자리수까지 소수점을 구한다면 10(000)곱한 후 나눌 것
		
		// 3. 한국(KR) 사원들의 평균 급여
		double avg2 = getlocal(emps);
		System.out.println("3. 한국 직원들의 평균 급여는 : " + Math.round(avg2*100)/100.0);

	}// main end

	private static double getlocal(Employee[] emps) {
		int sum = 0;
		int count = 0;
		double salAvg = 0;
		for (Employee emp : emps) {
			if (emp.getLocal().equals("KR")) {
				sum += emp.getSalary();
				count++;
			}
		}
		salAvg = (double) sum/count;
		return salAvg;
	}

	private static double getSalAvg(Employee[] emps) {
		int sum = 0;
		int count = 0;
		double salAvg = 0;
		for (Employee emp : emps) {
			if (emp.getGubun().equals("정규")) {
				sum += emp.getSalary();
				count++;
			}
		}
		salAvg = (double) sum / count;
		return salAvg;
		
				
			
		
		
	}

	private static void printEmployee(Employee[] emps) {
		for (int i = 0; i < emps.length; i++) {
			System.out.println(emps[i].getName() + "\t" + emps[i].getAge() + "\t" + emps[i].getSalary() + "\t"
					+ emps[i].getLocal() + "\t" + emps[i].getTerms() + "\t" + emps[i].getGubun());
		}

	}

}
