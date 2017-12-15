package com.member;

//자료형 클래스 -> VO, DTO 클래스
public class Member{

	//필드 구성
	private String name; //이름
	private String phone; //전화번호
	private String email; //이메일
	private String regDate; //등록일
	private String deptId;
	
	//기본 생성자 추가
	//매개변수가 있는 생성자 추가
	public Member() {}
	
	public Member(String name, String phone, String email, String regDate, String deptId) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.regDate = regDate;
		this.deptId = deptId;
	}
	
	//getter,setter 추가
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	
	@Override
	public String toString() {
		return String.format("%2s %2s %2s %2s %2s", this.name, this.phone, this.email, this.regDate, Dept.getValue(this.deptId));
	}
	//문제)equals() 메소드에 대한 오버라이딩 구현
	//이름, 전화번호, 이메일이 전부 일치하면 true, 일치하지 않는 항목이 있다면 false 반환
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(member.getName().equals(this.getName())
					&&member.getPhone().equals(this.getPhone())
					&&member.getEmail().equals(this.getEmail())){
				result = true;
			}
		}
		return result;
	}
	
}
