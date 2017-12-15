package com.test001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		//�÷��� �����ӿ�ũ
		/*
		 -�÷���(Collection)�� �ڹٿ��� ��ü�� �����ؼ� �����ϴ� ������ �ϴ� Ŭ�������� ����
		 -List, Set, Map �������̽��� ������ Ŭ�������� ����ü�̴�.
		 -List �������̽� Ư¡ : ���� ������ �����Ѵ�. �ߺ� ���� ����. ��ǥ���� ���� Ŭ������ ArrayList Ŭ�����̴�.
		 -Set �������̽� Ư¡ : ���� ������ �������� �ʴ´�. �ߺ� ���� �Ұ�. ��ǥ���� ���� Ŭ������ HashSet Ŭ�����̴�.
		 -Map �������̽� Ư¡ : Ű�� ���� ������ �ڷ� ����. Ű�� �ߺ� ���� �Ұ�. ���� �ߺ� ���. �ε����� �������� �ʴ´�. ��ǥ���� ���� Ŭ������ HashMap Ŭ�����̴�.
		 */
		
		//List �������̽�
		/*		
  		���� ����ȴ�.
		�ε��� ����.
		���� ������ �����Ѵ�
		�ߺ� ���� ����.
		���� ����� �����ȴ�.
		��ǥ���� ���� Ŭ������ ArrayList Ŭ�����̴�.
		*/
		//ArrayList Ŭ������ �̿��� �÷��� ����� �غ�
		//->�޸� ���� ũ��� �ڵ� �����ȴ�.
		//->�ʱ� ũ�⸦ ���� �ʿ䰡 ����.
		//->�÷��� ����� �غ��� �� ���׸� ǥ���� ���� ���� ������ ��ü�� ������ ���ѵȴ�.
		List<String> list = new ArrayList<String>();
		list.add("�ȳ�");
		list.add("����");
		list.add("�����");
		//�ڷ� ��ü�� ������ ��� ���� for�� ���
		//null �ڷ�� �ڵ� ���ܵȴ�.
		for(String s : list) {
			System.out.println(s);
		}
		
		//Ư�� ��ġ�� �ڷ� �߰� ����
		list.add(1, "kim");
		for(String s : list) {
			System.out.println(s);
		}
		
		//Ư�� ��ġ�� �ڷḦ ���ο� �ڷ�� �����. ���� �׼�
		list.set(1, "lee");
		for(String s : list) {
			System.out.println(s);
		}
		
		//�ڷ� �˻� ���.
		System.out.println();
		System.out.println(list.contains("�ȳ�"));
		System.out.println(list.contains("�����"));
		System.out.println(list.indexOf("�ȳ�"));
		System.out.println(list.indexOf("�����"));
		
		//Ư�� �ڷ� ����
		list.remove("�ȳ�");
		for(String s : list) {
			System.out.println(s);
		}
		
		//�ٷ��� �ڷ� �߰�. �迭 �ڷ����� List �ڷ������� ����ȯ.
		List<String>alist = Arrays.asList("�ȳ�", "����","�����");
		for(String s : alist) {
			System.out.println(s);
		}
		List<String>list3 = new ArrayList<String>();
		for (int i = 0; i < 3; i++) {
			list3.add(i, "����");
		}
		Object[] objList = list3.toArray();
		System.out.println(Arrays.toString(objList));
	}
}
