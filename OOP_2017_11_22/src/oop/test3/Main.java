package oop.test3;

public class Main {

	 //성적 객체 저장용 저장소(배열) 준비. 기본 크기는 5.
	  
	  //계좌 객체 생성 -> 홍길동 성적 객체, 박길동 성적 객체
	  
	  //계좌 객체를 저장소에 저장
	  
	  //전체 성적 명단 출력
	  //->학생번호, 학생이름, 과목1, 과목2, 과목3, 총점, 평균(소수이하 자리수 1자리)
	  //->출력시 NullPointerException 주의
	  /*
	  -----------
	  성적 목록
	  -----------
	  111  홍길동  100  100 100 300 100.0
	  112  박길동   90   80 100 270  90.0
	  */
	public static void main(String[] args) {
			StudentService service = new StudentService();
			service.studentAdd();
			service.accountList();
	}
}
