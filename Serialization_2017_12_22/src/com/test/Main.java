package com.test;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		
		 //����ȭ(Serialization)
	      /*
	      - �޸𸮿� ������ ��ü(Instance)�� ��ü�� ���·� ���������� ������ �� �ִ� ���.
	      - ���������� ����ȭ�� ������ ������ �޸𸮷� �о�� �� �ִ�. ������ȭ.
	      - ���Ͽ� �����ϰų�, ��Ʈ��ũ�� ���ؼ� ���� ����.
	      - ObjectOutputStream, FileOutputStream Ŭ���� �̿�.
	      - ���Ϸ� ����� �Ϲ������� Ȯ���ڴ� *.ser �� ����Ѵ�.
	      - ����ȭ�� ���� ��ü������ ������ �� �ִ� ���� ���� �ʿ�. serialVersionUID �ʵ�. �������.
	      - ����ȭ ���� Ŭ������ ����� ��츸 ����ȭ ����. Serializable �������̽�.
	      - ��ü ����ȭ ����� �ʵ� �� �ʵ��� �����̴�. �޼ҵ� ����. ��, static, transient Ű���尡 ���� �ʵ�� ����.
	      - �θ� Ŭ������ ����ȭ ���� Ŭ������ ���, �ڽ� Ŭ������ �ڵ����� ����ȭ ����� �ȴ�. Serializable �������̽� ���� ���ʿ�.
			
	      */
		//Serializable �������̽� ���� Ŭ������ ������� ����ȭ �׽�Ʈ
		//Wrapper Ŭ���� ��ü�� ����ȭ ����
		
		Integer a = new Integer(10);
		
		//���� ���� ����(�����)
		FileOutputStream fs = new FileOutputStream("D:\\temp.ser");
		
		//����ȭ�� ���� ������Ʈ�� �غ�
		ObjectOutputStream os = new ObjectOutputStream(fs);
		
		//�޸𸮿� �����ϴ� ��ü(Instance)�� ����ȭ ������� ���
		//->������ ���Ϸ� �����ȴ�.
		os.writeObject(a);
		
		//������
		os.close();
		fs.close();
		
		System.out.println("����ȭ �Ϸ�.");
	}

}
