package com.test;

public class sample_4 {

	public static void main(String[] args) {

		// String Ŭ������ indexOf() �޼ҵ�
		// å ����� �߿��� Ư�� �ܾ ���Ե� å �˻�
		// å ����� -> �迭�� �̿��ؼ� �غ�
		String[] books = { "�ڽ���", "���", "�����ϱ�", "����", "����", "�߿�" };
		String keyword = "����";
		//�迭 Ž�� ���� for��
		for(String book : books) {
			if(book.indexOf(keyword)!=-1) {
				System.out.println(book);
			}
		}
	}
}
