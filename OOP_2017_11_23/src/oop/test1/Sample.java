package oop.test1;

//������ �׽�Ʈ Ŭ����
public class Sample {

	//
	//�Ű����� ��� �ִ� �������� ����� ����
	//�Ű������� �ܺο��� ���޵Ǵ� ��(�ڷ�)�� ���� ����. local �����̴�.
	
	/*
	 public Ŭ�����̸�(�Ű����� ����Ʈ){
	 
	 }
	 */
	//instance ����
	private int a;
	
	public Sample(int a) {
		//local ���� - this Ű���� ��� �Ұ�
		
		//instance ��� ���ٽ� this Ű���� ���
		//�ܺο��� ���޵� ���� ���� local ���� a�� �ڷḦ instance ���� a�� ����.
		this.a = a;
	}
	//�ʵ��� ����� ���� �ܺο��� Ȯ���� �� �ֵ��� �޼ҵ� �߰�
	//->getter
	//instance �޼ҵ�
	public int getA() {
		return this.a;
	}
}
