package oop.test2;

public class Sample {
	/*
	  instance ��� -> instance ��� (����) �� ��츸 this Ű���� ��� ����
	  static ��� -> static ��� (����)
	  instance��� -> static��� (������ ����)
	  
	  static��� -> instance ��� (�Ұ���)
	*/
	
	//instance �ʵ�
	private int ins;
	//static �ʵ�
	private static int staticIns;
	//instance �޼ҵ�
	
	public void methodInstance() {
		//instance ��� -> instance ��� (����) �� ��츸 this Ű���� ��� ����
		System.out.println(this.ins);
		System.out.println(Sample.staticIns);
	}
	
	//static �޼ҵ�
	public static void methodStatic() {
		 //static ��� -> static ��� (����). this Ű���� ��� �Ұ�. Ŭ������ ���.
		System.out.println(Sample.staticIns);
		 //->�޸� ���� ������ �ٸ��� �����̴�.
		 //static��� -> instance ��� (�Ұ���)
	}

}
