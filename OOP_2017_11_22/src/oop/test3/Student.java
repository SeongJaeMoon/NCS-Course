package oop.test3;

public class Student {

	//->학생번호, 학생이름, 과목1, 과목2, 과목3, 총점, 평균(소수이하 자리수 1자리)
	//->출력시 NullPointerException 주의
	
	private String studentNumber;
	private String studentName;
	private int subject1;
	private int subject2;
	private int subject3;
	private int totalScore;
	private double averageScore;
	
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getStudentNumber() {
		return this.studentNumber;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentName() {
		return this.studentName;
	}
	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}
	public int getSubject1() {
		return this.subject1;
	}
	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}
	public int getSubject2() {
		return this.subject2;
	}
	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}
	public int getSubject3() {
		return this.subject3;
	}
	public void setTotalScore() {
		this.totalScore = (this.subject1+this.subject2+this.subject3);
	}
	public int getTotalScore() {
		return this.totalScore;
	}
	public void setAverage() {
		this.averageScore = (this.totalScore/(double)3);
	}
	public double getAverage() {
		return this.averageScore;
	}
	public String getInfo() {
		return String.format("%s %s %d %d %d %d %.1f", this.studentNumber, this.studentName, this.totalScore, this.subject1, this.subject2, this.subject3, this.averageScore);
	}
}
