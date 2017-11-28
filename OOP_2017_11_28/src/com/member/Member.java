package com.member;

//�ڷ��� Ŭ���� -> VO, DTO Ŭ����
public class Member {

	//�ʵ� ����
	private String name;
	private String phone;
	private String email;
	private String regDate;
	
	//�⺻ ������ �߰�
	//�Ű������� �ִ� ������ �߰�
	public Member() {}
	public Member(String name, String phone, String email, String regDate) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.regDate = regDate;
	}
	
	//getter,setter �߰�
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
	public String getMemberInfo() {
		return String.format("%2s %2s %2s %2s", this.name, this.phone, this.email, this.regDate);
	}
}
