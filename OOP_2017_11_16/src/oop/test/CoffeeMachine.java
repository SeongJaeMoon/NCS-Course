package oop.test;

public class CoffeeMachine {

	// CoffeeMachine�� ���� ��ü �м�
	// state -> power
	// behavior -> fields, methods�� ǥ��
	private boolean power; // ����
	private int water; // ���� ��
	private String menu; // ����
	private int temper;// �µ�
	private int shot;// ��
	private boolean ice;

	public CoffeeMachine(int water, String menu, int temper, int shot) {
		this.water = water;
		this.menu = menu;
		this.temper = temper;
		this.shot = shot;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public boolean getPower() {
		return this.power;
	}

	// ���� �� ����
	public void setWater(int water) {
		this.water = water;
	}

	public int getWater() {
		return this.water;
	}

	// ���� ����
	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getMenu() {
		return this.menu;
	}

	// �µ� ����
	public void setTemper(int temper) {
		this.temper = temper;
	}

	public int getTemper() {
		return this.temper;
	}

	// �� ����
	public void setShot(int shot) {
		this.shot = shot;
	}

	public int getShot() {
		return this.shot;
	}

	public String Loasting() {
		String coffee = null;
		if (this.water == 0 || this.temper == 0 || this.menu.equals(null) || this.shot == 0) {
			coffee = "���� ������ �����մϴ�.";
		} else {
			coffee = String.format("[���� : %s] [�� : %dml] [�µ� : %d��] [�� : %d��]%n", this.menu, this.water, this.temper, this.shot);
		}
		return coffee;
	}
}
