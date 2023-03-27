package class06;

public class TakesMain {

	public static void main(String[] args) {
		//Takes[] takes = new Takes[12];

		TakesData td = new TakesData();
		Takes[] takk = td.takes;
		
		// 기초 데이터 생성
		//iniData(takes);
		
		// 1. 전학생 성적 출력(toString 메소드 사용)
		printTakes(takk);
		
		// 2. 성적이 "A+"인 학생의 id를 반환받아서 출력하세요
	//	String[] names = getAplus(takes);
	//	for (String string : names) {
	//		System.out.println(string);
	//	}
		
		
	}//main end

	// 기초 데이터 생성	
	/*private static void iniData(Takes[] takes) {
		takes[0] = new Takes("1292001", "C101-01", "B+");
		takes[1] = new Takes("1292001", "C103-01", "A+");
		takes[2] = new Takes("1292001", "C301-01", "A");
		takes[3] = new Takes("1292002", "C102-01", "A");
		takes[4] = new Takes("1292002", "C103-01", "B+");
		takes[5] = new Takes("1292002", "C502-01", "C+");
		takes[6] = new Takes("1292003", "C103-02", "B");
		takes[7] = new Takes("1292003", "C501-02", "A+");
		takes[8] = new Takes("1292301", "C102-01", "C+");
		takes[9] = new Takes("1292303", "C102-01", "C");
		takes[10] = new Takes("1292303", "C103-02", "B+");
		takes[10] = new Takes("1292303", "C501-01", "A+");
		
	}
	*/

	// 1. 전학생 성적 출력(toString 메소드 사용)
	public static void printTakes(Takes[] takes) {
		
	}
	
	// 2. 성적이 "A+"인 학생의 id를 반환받아서 출력하세요
	//public static String[] getAplus(Takes[] takes) {
	//	System.out.println("2. 성적이 \"A+\"인 학생의 id를 출력");
	//	String names = "";
	//	for (Takes takes2 : takes) {
	//		if (takes2.getScore().equals("A+")) {
	//			names = names + takes2.getId()+"";
	//		}
	//	}
	//	String[] arrName = names.split(",");
		
		

	
	
}//class end
