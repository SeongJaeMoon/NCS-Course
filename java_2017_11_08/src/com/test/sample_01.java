package com.test;

public class sample_01 {

	public static void main(String[] args) {
		
		//��ø for��
		//for�� ���ο� �� �ٸ� for���� ��ø�� ����
		//����) �ٱ��� for�� �� �� ����� �� ���� for�� ������ ����Ǵ� ���°� �ȴ�.
		//����) �ٱ��� for���� ������ ���� for���� ������ ���� �޶�� �Ѵ�.
		/*
		 * for(initialize; Boolean_expression; increment){
		 * 		for(initialize; Boolean_expression; increment){
		 * 			//Statements
		 * 		}
		 * 	}
		 */
		
		for(int i = 0; i <11; i++) {
			for(int j = 0; j <11; j++) {
				//1���� 10������ ���� ���
				//���� j�� ���� ��ȭ�Ǵ� Ƚ���� 10��
				System.out.print("value of j: " + j);
			}
			System.out.print('\n');
		}
	}

}
