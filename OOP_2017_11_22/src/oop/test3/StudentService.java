package oop.test3;


public class StudentService {
	
	StudentDAO studentDAO = new StudentDAO();
	
	public void studentAdd() {
		
		Student hong = new Student();
		Student park = new Student();
		
		hong.setStudentNumber("1111");
		hong.setStudentName("홍길동");
		hong.setSubject1(10);
		hong.setSubject2(20);
		hong.setSubject3(30);
		hong.setTotalScore();
		hong.setAverage();
		
		park.setStudentNumber("1111");
		park.setStudentName("박길동");
		park.setSubject1(10);
		park.setSubject2(20);
		park.setSubject3(30);
		park.setTotalScore();
		park.setAverage();
		
		studentDAO.studentSave(hong);
		studentDAO.studentSave(park);
	}
	
public void accountList() {
		
		System.out.println("------");
		System.out.println("학생정보");
		System.out.println("------");
		
		for(Student s : this.studentDAO.studentList()) {
			if(s==null)continue;
			System.out.println(s.getInfo());
		}
	}
}
