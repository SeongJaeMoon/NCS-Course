package oop.test3;

public class Main {

	 //���� ��ü ����� �����(�迭) �غ�. �⺻ ũ��� 5.
	  
	  //���� ��ü ���� -> ȫ�浿 ���� ��ü, �ڱ浿 ���� ��ü
	  
	  //���� ��ü�� ����ҿ� ����
	  
	  //��ü ���� ��� ���
	  //->�л���ȣ, �л��̸�, ����1, ����2, ����3, ����, ���(�Ҽ����� �ڸ��� 1�ڸ�)
	  //->��½� NullPointerException ����
	  /*
	  -----------
	  ���� ���
	  -----------
	  111  ȫ�浿  100  100 100 300 100.0
	  112  �ڱ浿   90   80 100 270  90.0
	  */
	public static void main(String[] args) {
			StudentService service = new StudentService();
			service.studentAdd();
			service.accountList();
	}
}
