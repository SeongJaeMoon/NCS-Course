package com.member;

//�ڷ��� Ŭ���� -> VO, DTO Ŭ����
public class Member{

	//�ʵ� ����
	private String name; //�̸�
	private String phone; //��ȭ��ȣ
	private String email; //�̸���
	private String regDate; //�����
	private String deptId;
	
	//�⺻ ������ �߰�
	//�Ű������� �ִ� ������ �߰�
	public Member() {}
	
	public Member(String name, String phone, String email, String regDate, String deptId) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.regDate = regDate;
		this.deptId = deptId;
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
	//����)equals() �޼ҵ忡 ���� �������̵� ����
	//�̸�, ��ȭ��ȣ, �̸����� ���� ��ġ�ϸ� true, ��ġ���� �ʴ� �׸��� �ִٸ� false ��ȯ
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
