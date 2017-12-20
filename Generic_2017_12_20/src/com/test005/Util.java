package com.test005;

public class Util {

	//���ѵ� Ÿ�� �Ķ���� <T extends �ֻ���Ÿ��>
	//-Ÿ�� �Ķ���� ������ ���� ���� ����. ��, ������ IS-A ������ ��츸 ����.
	//-<T extends �ֻ���Ÿ��> ǥ���� �ֻ���Ÿ�� ���� �ڷ����� �����ϴٴ� �ǹ̰� �ȴ�. ���� ���, <T extends Number>�� ��� Number �ڷ����� ���� �ڷ����� �����ϴٴ� �ǹ��̴�.
	
	
	//T�� Number�� ���� �ڷ����� ����
	public static <T extends Number> int compare(T t1, T t2) {
		
		//��� ���� �ڷ����� doubleValue() �޼ҵ带 �����Ѵ�.
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		//���� �ڷ� �� ���� ���� �� �׼�
		return Double.compare(v1, v2);
		
	}
	
}
