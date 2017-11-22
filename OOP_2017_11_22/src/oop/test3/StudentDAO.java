package oop.test3;

import java.util.Arrays;

public class StudentDAO {
	
	private Student[]studentArray = new Student[5];
	private int count = 0;
	
	public void studentSave(Student s) {
		if(studentArray.length == count)
			this.studentArray = Arrays.copyOf(this.studentArray, this.studentArray.length+5);
		studentArray[count] = s;
		++this.count;
	}
	public Student[] studentList(){
		return this.studentArray;
	}
}
