package oop.test;

//�����Ϳ� ���� ��ü �м� �� Ŭ���� ǥ��
public class Printer {
	// �����Ϳ� ���� ��ü �м�
	// state - power(����), paper(����), toner(���)
	// behavior - print(�μ�), copy(����), scan(��ĵ)
	// ->fields, methods�� ǥ��

	// field ����
	// ��ü�� ���� ���� ����
	// �ڵ� �ʱ�ȭ -> 0(off)/1(on)
	private int power; // ����
	private String paper; // ����
	private String toner; // ��� ����
	private int paperNum; // ���� ���� ��
	// getter, setter �޼ҵ�
	// field�� ���� ���°� Ȯ��, �����ϴ� ����
	// ������ ������

	public Printer(int power, String paper, String toner, int paperNum) {
		this.power = power;
		this.paper = paper;
		this.toner = toner;
		this.paperNum = paperNum;
	}

	// ���� ����
	public void setPower(int power) {
		this.power = power;
	}

	public int getPower() {
		return this.power;
	}

	// ��� ���� ����
	public void setToner(String toner) {
		this.toner = toner;
	}

	public String getToner() {
		return this.toner;
	}

	// ���� ���� ����
	public void setPaper(int paperNum) {
			this.paperNum += paperNum;
			System.out.printf("���̰� 5�� �߰��Ǿ����ϴ�. ���� ���� �� %d%n", this.paperNum);
	}

	public int getPaper() {
		return this.paperNum;
	}

	// scan�� ���� �޼ҵ� Ư��
	public String scan(String target) {
		String result = null;
		// ��ĵ Ư���� ������ �� �ִ� ���� �߰�
		// ->���� on ���� Ȯ��
		if (this.paperNum != 0) {
			System.out.println("Ÿ�ٿ� ���� ��ĵ �۾�.");
			result = String.format("target:(\'%s\')�� �纻 �̹��� �ڷ�", target);
		} else {
			result = "���̰� �����ϴ�. ���̸� �߰��ϼ���!";
		}
		return result;
	}

	// ����
	public String copy(String paper, int count) {
		String result = null;
		if (this.paperNum != 0) {
			result = "";
			for(int i = 1; i<=count; ++i) {
				result += this.paper;
				--this.paperNum;
				if(this.paperNum<=0) {
					result += "���̰� �����մϴ�.";
					break;
				}
			}
			
		}
		return result;
	}

	// ����Ʈ
	public void print(String print, String toner, int count) {
		String result = null;
		if (this.paperNum != 0) {
			result = "";
			for (int i = 1; i <= count; ++i) {
				result += String.format("%s �������� %s�� ����մϴ�. %n", toner, print);
				--this.paperNum;
				if(this.paperNum <=0) {
					result += "���̰� �����մϴ�.";
					break;
				}
			}
			System.out.println(result);
		} else {
			System.out.println("���̰� �����ϴ�. ���̸� �߰��ϼ���!");
		}
	}
}
