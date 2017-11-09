package com.test;

public class sample_03 {

	public static void main(String[] args) {
		
		//String Ŭ������ charAt() �޼ҵ�
		String ssn = "940221-1229918";
		char temp = ssn.charAt(7);
		
		switch(temp) {
		case '1': 
		case '3':
			System.out.println("�����Դϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("�����Դϴ�.");
			break;
		}
		//indexOf->�ش� ���ڿ��� �����ϴ� �ε��� ��ȯ, �˻� ����� ������ -1 ��ȯ.
		String str = new String("Wellcome to Tutorialspoint.com");
		String subStr = new String("Tutorial");
		System.out.println(str.indexOf(subStr));
		
		//length()->���ڿ��� ����(������ ��)�� ��ȯ
		String str1 = new String("Wellcome to Tutorialspoint.com");
		System.out.println(str1.length()); 
		
		//substring(int beginIndex)-> ���ڿ��� �Ϻ� ��ȯ (beginIndex~)�� ��ȯ
		String str2 = new String("Wellcome to Tutorialspoint.com");
		System.out.println(str2.substring(12));
		
		//substring(int beginIndex, int endIndex)-> ���ڿ��� �Ϻ�(beginIndex~endIndex)�� ��ȯ
		String str3 = new String("Wellcome to Tutorialspoint.com");
		System.out.println(str3.substring(12, 20));
		
		//replace(���� ������, ġȯ�� ������ ) -> ���ڿ��� ġȯ
		String str4 = new String("Wellcome to Tutorialspoint.com");
		System.out.println(str4.replace("Wellcome to", "Hey~~"));
		
		//replaceAll(����ǥ����, ġȯ)
		String str5 = new String("Wellcome to Tutorialspoint.com");
		System.out.println(str5.replaceAll(".*Wellcome to.*", "Hey~~"));
		
		//toLowerCase(), toUpperCase() : ���ڿ��� �ҹ��ڷ� ��ȯ, �빮�ڷ� ��ȯ
		String str6 = new String("Wellcome to Tutorialspoint.com");
		System.out.println(str6.toLowerCase());
		System.out.println(str6.toUpperCase());
		
		//����)���ڿ� �񱳽� equals(), equalsIgnoreCase() -> �ҹ���, �빮�� ����
		String str7 = new String("Wellcome to Tutorialspoint.com");
		System.out.println(str7.equalsIgnoreCase(str7));
		
		//trim() -> ���ڿ��� �յ� ���� ������ �� ��ȯ
		//�߰��� �ִ� ������ ���� ���� �ʴ´�.
		String str8 = new String("Wellcome to Tutorialspoint.com");
		System.out.println(str8.trim());
		System.out.println(str8.replace(" ", ""));
		
		//valueOf()-> �⺻ �ڷ����� ���� String ������ ��ȯ �� ��ȯ
		
		int a = 10;
		double b = 10.0;
		System.out.println(String.valueOf(a) +" "+ String.valueOf(b));	
		
		//�������� ���ڿ�
		//System.out.printf("���� ���� ���ڿ�", ���, ...)
		//String.format("���� ���� ���ڿ�", ���, ...)
		//%[argument_index$][flags][width][.precision]
		//���� ���� ���� -> %d
		//�Ǽ� ���� ���� -> %f
		//����(���ڿ�) ���� ���� -> %s
		//�ٹٲ� ���� ���� ���� -> %n
		
		//���� ����
		int c = 10;
		System.out.printf("%d%n", c);
		System.out.printf("[%10d] [%-10d]\n", c, c);
		System.out.printf("%1$d %1$d", c);
		//�Ǽ� ����
		double d = 1234.5678;
		System.out.printf("[%.1f]%n", d);
		System.out.printf("[%1$f] [%1$f] %n", d);
		System.out.printf("[%.1f]%n", d);
		System.out.printf("[%.10f]%n", d);
		//���ڿ� ����
		String sTest1 = "TEST";
		System.out.printf("%s%n",sTest1);
		System.out.printf("%10s%n", d);
		System.out.printf("%-10s%n", d);
		//16���� ����
		System.out.printf("%1$d -> %1$H(16����)%n", c);
		System.out.printf("%1$s -> %1$H%n", sTest1);
		//Boolean ����
		System.out.printf("%1$s -> %1$B%n", 255);
		System.out.printf("%1$s -> %1$B%n", null);
		//���� ����
		System.out.printf("%1$s -> %1$c%n", 97);
		//16���� ����
		System.out.printf("%1$s -> %1$X%n", 100);
		//���� ǥ����
		System.out.printf("%1$f -> %1$e%n",123234512312313.44);
		//%% -> %�� ��Ÿ���� ���� ����
		System.out.printf("%1s%%", a);
		//grouping separators()
		System.out.printf("%1s$ -> %1$,d%n", 123131323);
		//zero-pad(0) ����
		System.out.printf("%1$d -> %1$05d%n", 4);
	}
}
