package oop.test;

public class CoffeeMachine {

	// CoffeeMachine에 대한 객체 분석
	// state -> power
	// behavior -> fields, methods로 표현
	private boolean power; // 전원
	private int water; // 물의 양
	private String menu; // 원두
	private int temper;// 온도
	private int shot;// 샷
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

	// 물의 양 조절
	public void setWater(int water) {
		this.water = water;
	}

	public int getWater() {
		return this.water;
	}

	// 원두 종류
	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getMenu() {
		return this.menu;
	}

	// 온도 조절
	public void setTemper(int temper) {
		this.temper = temper;
	}

	public int getTemper() {
		return this.temper;
	}

	// 샷 조절
	public void setShot(int shot) {
		this.shot = shot;
	}

	public int getShot() {
		return this.shot;
	}

	public String Loasting() {
		String coffee = null;
		if (this.water == 0 || this.temper == 0 || this.menu.equals(null) || this.shot == 0) {
			coffee = "선택 사항이 부족합니다.";
		} else {
			coffee = String.format("[원두 : %s] [물 : %dml] [온도 : %d도] [샷 : %d샷]%n", this.menu, this.water, this.temper, this.shot);
		}
		return coffee;
	}
}
