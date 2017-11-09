package com.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class sample_01 {

	public static void main(String[] args) {
		
		//����Ÿ��
		/*
		 * ���� �ڷᰡ ����� ����(Heap)�� �ڷḦ ������ �� �ִ� ������ �ٸ� ����(Stack)�� ����� ����
		 * �迭, ����, Ŭ����(���ڿ�)
		 * Main Method ȣ��� ���� ������ ����
		 * �⺻ Ÿ���� Stack ������ ������ ����ǰ�, �ڷᰡ ����ȴ�.
		 * ������ �Ҹ��� ����.
		 * 
		 * ���� Ÿ���� Stack ������ ������ �����ּҸ� �����ϰ�, �ڷ�� ������ ����(Heap)�� ����ȴ�.
		 * ���� �ּҸ� ������ �ڷḦ ������ �;� �Ѵ�.
		 * ���� Ÿ�� �ڷ�� ũ�Ⱑ �������� �ʴ�. ��ü(Object) ������ ����. ��ü�� ������ �Ҹ��� ���� �̷������ �ʴ´�.
		 *
		 * ���� Ÿ���� ��ǥ���� �ڷ����� Ŭ�����̰�, Ŭ������ ��ǥ���� �ڷ����� String(���ڿ�)
		 * 
		 * ����) ���� Ÿ���� ������ ��ü�� �Ҵ����� �ʴ� ��� null ���� ���� �� �ִ�.
		 * ����) �������� ��ü�� �����ּҸ� ������ ���� ���� Ÿ���� ������ ȣ��� NullPointerException �߻�.
		 * ����) ���� ������ �ʴ� ��ü�� �޸𸮿� JVM(������ �÷���)�� ���� �ڵ� ���ŵȴ�.
		 * �������� �� �ϴ� ���� <-> �޸� ���¿��� ���� x 
		 */
		
		//String �ڷ����� ���� ���� �� �ʱ�ȭ
		//Heap ������ "Hello" ���ڿ� ����
		//Stack ������ ������ ���� a ����
		//"Hello"���ڿ��� �����ּҸ� a�� �Ҵ�
		
		//������ ���ڿ� ���ͳ��� ��� ������ String ��ü�� �����Ѵ�.
		String a = "Hello";
		String b = "Hello";
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode()+", "+b.hashCode());
		
		//"Hello"��� ���� ������ String Ŭ������ ��ü ����
		//Stack ������ ������ ���� b ����
		//��ü�� �����ּҸ� ���� b�� �Ҵ�
		//����) ��ü ���� �������� new ���� ���ο� ��ü ���� �� ���ο� �����ּҸ� ������.
		String c = new String("Hello");
		String d = new String("Hello");
		Object e = new Object();
		Object f = new Object();
		System.out.println(e.hashCode()+", "+f.hashCode());
		
		//== �����ڸ� ���� Ÿ�Կ��� ����ϸ� ���� �ּҸ� �� �����Ѵ�.
		System.out.println(e==f);
		System.out.println(e.equals(f));
		System.out.println(c==d);
		
		//null �� Ȯ��
		//String str = null; // NullPointerException
		//System.out.println(str.toString());
		String x = "���";
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(sdf.format(date));
		System.out.println(String.format("%s�Դϴ�.%s", x, String.valueOf(sdf.format(date)) ));
		//���ڿ��� ���ϱ� ������ �������� �ʴ� ����
		//���ڿ� �������� ���� ���� format�� ���� �̷���� �� �ֵ����ϱ�
	}
}
