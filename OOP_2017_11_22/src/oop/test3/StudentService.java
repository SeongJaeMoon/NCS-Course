package oop.test3;


public class StudentService {
	
	StudentDAO studentDAO = new StudentDAO();
	
	public void studentAdd() {
		
		Student hong = new Student();
		Student park = new Student();
		
		hong.setStudentNumber("1111");
		hong.setStudentName("ȫ�浿");
		hong.setSubject1(10);
		hong.setSubject2(20);
		hong.setSubject3(30);
		hong.setTotalScore();
		hong.setAverage();
		
		park.setStudentNumber("1111");
		park.setStudentName("�ڱ浿");
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
		System.out.println("�л�����");
		System.out.println("------");
		
		for(Student s : this.studentDAO.studentList()) {
			if(s==null)continue;
			System.out.println(s.getInfo());
		}
	}
}
