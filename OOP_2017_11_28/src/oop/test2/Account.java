package oop.test2;

public class Account {
	
	//�����͸𵨸�(ȭ�鼳��)->Ŭ���� ǥ��->�׸� �м�->�ʵ� ����->getter, setter ����
	
	//���¹�ȣ -> ano
	//������ -> owner
	//�ʱ��Աݾ�, ��ݾ�, ���ݾ� -> balance
	
	//�ʵ� ����
	private String ano;
	private String owner;
	private int balance;
	
	//�Ű����� ����� �ִ� ������ ����
	//->�ʱ��Աݾ� �׼� ó����
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//getter, setter ����
	//->��ݾ�, ���ݾ� �׼� ó����
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}