package oop.test003;

public class Calculator {
	//�޼ҵ�
	//��ü�� �ൿ Ư���� ������ ��.
	//���� ���, ���帶ī���� ���� Ư���� �޼ҵ�� ǥ��.
	/*
	  modifier returnType nameOfMethod(Parameter List){
	  	//method body
	  	return ��ȯ��; 
	  }
	 */
	//���������ڴ� �ܺο��� ��� ������ �� ���. �޼ҵ�� public ���������� ����.
	//���������ڴ� ���� ����.
	//��ȯ�ڷ��� �κ��� ��ȯ���� ���� �ڷ��� ����. ��ȯ���� ���� ��� void Ű���� ���
	//�޼ҵ��̸��� �ĺ��� �ۼ� ��Ģ�� ������.
	//�Ű������� �ܺο��� ���޵Ǵ� �ڷḦ �����ϴ� ����. ���� ����
	//��ȯ���� �ִ� ��� return ���� ���. �޼ҵ� �׼��� ���� �������� ����.
	
	public int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	public int binToDex(int bin) {
		int result = 0;
		int size = String.valueOf(bin).length(); 
		
		int[]arr = new int[size];
		for(int i = 0 ; i < size; ++i) {					
			 arr[i] = bin%10;
			 bin /= 10;
		}
		System.out.println();
		
		for(int i = size-1; i >= 0; --i) {
			if(arr[i]==1) {
				result += Math.pow(2, i);
			}
		}
		return result;
	}
	
}
