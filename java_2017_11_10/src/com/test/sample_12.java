package com.test;

public class sample_12 {
	 
	//cmd���� "java Ŭ���� �̸� ��1 ��2 ��3..." �Է� �ÿ� -> �ɼ� �� String �迭�� �Ű����� ����.
	public static void main(String[] args) {//�Ű����� ���� String �ڷ��� �迭, JVM�� ����
		//main �޼ҵ��� �Ű����� �м�
		//String[] args
		//JVM�� �����ϴ� ���ڿ��� �迭 ��ü�� ���޹��� �� �ִ� ����
		//�ڹ����α׷��� ����� �� �ܺ� �ڷḦ ������ �� �ִ�.
		//���� ���, ��� ������Ʈ���� �����ϴ� ��� "java Ŭ�����̸� �ڷ�1 �ڷ�2 ..."���·� ����
		//��Ŭ�������� �����ϴ� ��� > Run > Run configurations...>
		
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		if(args.length < 2 || args == null){
			System.out.println("The value is not enough");
			System.exit(0);
		}else{
			for(int i = 0; i < args.length; i++){
				sb.append(String.format("option : %s%n", args[i]));
				sum += Integer.parseInt(args[i]); 
			}
		}
		System.out.print(sb.toString());
		System.out.printf(String.format("%n sum : %d", sum));
		
	}
}
