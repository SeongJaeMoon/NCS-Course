package oop.test2;

public class Service {

	
	// ->�Է�, ���, ó�� ���� �������� �޼ҵ�
	// ->���� �ڷ� -> �ʵ�� ����

	private DAO dao = new DAO();
	
	// ���� ���� ����
	// instance method
	public void accountAdd() {
		Account hong = new Account();
		
		hong.setAccountName("ȫ�浿");
		hong.setAccountNumber("111-1111");
		hong.setBalance(10000);
		
		Account park = new Account();
		
		park.setAccountName("�ڱ浿");
		park.setAccountNumber("222-2222");
		park.setBalance(20000);
		
		//���� ��ü�� ����ҿ� �����ϴ� instance �޼ҵ� ȣ��
		this.dao.accountAdd(hong);
		this.dao.accountAdd(park);
	}

	// ���� ���� ���
	// instance method
	public void accountList() {
		
		System.out.println("------");
		System.out.println("��������");
		System.out.println("------");
		
		for(Account a : this.dao.accountList()) {
			if(a==null)continue;
			System.out.println(a.getAccountInfo());
		}
	}
}
