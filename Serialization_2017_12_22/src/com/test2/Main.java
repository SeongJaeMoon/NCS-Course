package com.test2;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
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
		//������ȭ
		//-���������� ����ȭ�� ������ ������ �޸𸮷� �о�� �� �ִ�.
		//-ObjectInputStream, FileInputStream Ŭ���� �̿�.
		FileInputStream fs = new FileInputStream("D:\\temp.ser");
		ObjectInputStream os = new ObjectInputStream(fs);
		
		Object temp = os.readObject();
		
		//��ü�� ���� ���->toString()�޼ҵ� ȣ�� -> �������̵� �޼ҵ� ȣ�� ����
		System.out.println(temp); //��ü�� ���� ���
		
		fs.close();
		os.close();
		
		System.out.println("������ȭ �Ϸ�.");
	}

}
