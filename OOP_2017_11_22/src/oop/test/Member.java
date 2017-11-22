package oop.test;

//������ �𵨸� �׽�Ʈ Ŭ����
public class Member {
	
	//������ �𵨸�
	//���� ������ �ڷḦ Ŭ������ ǥ��. ���� ���, ��������(�̸�, ��ȭ��ȣ, �̸���).
	//->�̸�, ��ȭ��ȣ, �̸��� �׸��� �������� Ŭ������ �׷�ȭ.
	//->����� ���� �ڷ����� Ŭ������ �̿��ϸ� ���ϴ´�� ���� ����.
	//->�׸� ������ �ʵ�� �Ѵ�. private ���������� ����.
	//->�ʵ� �� getter, setter ���� �߰�.
	
	private String name;
	private String id;
	private String password;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public String memberInfo() {
		return String.format("[%s %s %s %d]%n",this.name ,this.id ,this.password, this.age);
	}

}
