package com.test002;

//�ڷ��� Ŭ���� -> VO, DTO Ŭ����
public class Member {

	//���� ����� ���� ����ũ �ڷ� ����� �׸� �߰� -> ��ȣ
	//�ʵ� ����
	private static int count;
	private int mid;
	private String name;
	private String phone;
	
	
	//�⺻ ������ �߰�
	//�Ű������� �ִ� ������ �߰�
	public Member() {}
	
	public Member(String name, String phone) {
		this.mid = ++count;
		this.name = name;
		this.phone = phone;
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
	
	public int getMid() {
		return mid;
	}
	
	public void setMid(int mid) {
		this.mid = mid;
	}
	
	@Override
	public String toString() {
		return String.format("%2d %2s %2s", this.mid ,this.name, this.phone);
	}

	//�÷��� ����ҿ��� ���� ������ �����ϱ� ���� �������̵� ����
	//Object Ŭ�������� equals() �޼ҵ� ���� �ּ� ��
	//Member Ŭ���������� equals() �޼ҵ尡 �̸� �׸� ��
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Member) {
			Member member = (Member)obj;
			result = this.mid == member.getMid();
		}
		return result;
	}
}
