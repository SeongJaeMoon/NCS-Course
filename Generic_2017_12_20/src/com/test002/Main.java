package com.test002;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//���׸� ǥ���� ������� �ʴ� �÷��� �׽�Ʈ
		//List is a raw type. References to generic type List<E> should be parameterized
		List list2 = new ArrayList();
		
		//�Ϲ� �÷��� Ŭ���������� ��� �ڷ��� ������ �ڷ� ���� ����
		//->�پ��� �ڷ����� �ڷ� ���� ����
		list2.add("123"); //O
		list2.add(123); //O
		
		//�Ϲ� �÷��� Ŭ������ ����� �ڷ�� Ÿ�� �˻� �� ����ȯ �ʿ�
		//->��� �ڷᰡ Object �ڷ������� ��޵ȴ�.
		Object o1 = list2.get(0);
		if (o1 instanceof String) {
			String temp0 = (String)o1;
			System.out.println(temp0);
		}
		
		Object o2 = list2.get(1);
		if (o2 instanceof String) {
			String temp1 = (String)o2;
			System.out.println(temp1);
		}

	}

}
