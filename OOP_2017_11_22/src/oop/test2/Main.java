package oop.test2;

public class Main {

	public static void main(String[] args) {
		
		//Service Ŭ������ Ư�� instance �޼ҵ� ȣ���� �̿��ؼ� �׼� ����.
		//-> ��ü ����
		//-> new ������
		Service s = new Service();
		//���� ��ü ���� -> accountAdd() ȣ��
		s.accountAdd();
		//���� ���� ��� -> accountList() ȣ��
		s.accountList();
	}
}
