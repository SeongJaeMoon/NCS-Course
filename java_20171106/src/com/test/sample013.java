package com.test;

public class sample013 {
	
	public static void main(String[] args) {
		//��������� ���ǻ���
		//�ε� �Ҽ��� �� ����� ����Ȯ�� ���
		int a = 1;
		double b = 0.1;
		int c = 7;
		double zero = 0.0;
		
		//1-(0.1*7) => 1 - 0.7
		double result = a-(b*c);
		System.out.println(result);
		//(1*10)-7 = 10 = > 10-7 => 3/10.0 = > 0.3
		//�ε� �Ҽ��� ������ ������ ���� �����ϰ� �ְ�, ������ �ݺ� �����ϸ� ������ �����ϹǷ� �ǵ��� ������� �ʴ� ���� ����.
		double d = ((a*10)-c)/10.0;
		System.out.println(d);
		
		//� ���� 0.0���� ������ Runtime Exception �߻�!
		//java.lang.ArithmeticException
		//NaN: Not a Number, infinite: ���Ѵ�
		System.out.println(a%zero);
		System.out.println(a/zero);
		String ss = "100";
		System.out.println(ss+zero);
		System.out.println(Integer.parseInt(ss)+c);
		String nan = "NaN";
		System.out.println(Double.parseDouble(nan)+1);
		//String �ڷ���
		//���ڿ� ����(����) ������
		//���ڿ� + ���ڿ� => ���ڿ�
		//���ڿ� + �ٸ��ڷ� => ���ڿ�
		System.out.println(ss+d+result);
		System.out.println(ss+(d+result));
	}
}
