package oop.test002;

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
	
	public void binToDex(int bin) {
		int result = 0;
		int size = String.valueOf(bin).length(); 
		int temp = bin;
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
		System.out.printf("%d(2) -> %s(10)%n", temp, result);
	}
	
	public void dexToBin(int dex) {
		String result = "";
		int temp = dex;
		String result1 = "";
			while(dex != 1) {
				result += String.valueOf(dex%2);
				dex /= 2;
			}
			result += 1;
			for(int i = result.length()-1; i >= 0; --i) {
				result1 += result.charAt(i);
			}
		System.out.printf("%d(10) -> %s(2)%n", temp, result1);
	}
	
	public void dexToBin2(int dex) {
		int temp = dex;
		int size = String.valueOf(dex).length();
		int arr[] = new int[size];
		int i = 1;
		while(dex!=1) {
			arr[size - i] = dex%2;
			dex /= 2;
		}
		arr[0] = 1;
		String result = "";
		for(int j = 0; j < arr.length; ++j) {
			result += arr[i];
		}
		System.out.printf("%d(10) -> %s(2)%n", temp, result);
	}
}
