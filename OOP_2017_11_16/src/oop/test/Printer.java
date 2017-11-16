package oop.test;

//프린터에 대한 객체 분석 및 클래스 표현
public class Printer {
	// 프린터에 대한 객체 분석
	// state - power(전원), paper(종이), toner(토너)
	// behavior - print(인쇄), copy(복사), scan(스캔)
	// ->fields, methods로 표현

	// field 선언
	// 객체의 상태 정보 저장
	// 자동 초기화 -> 0(off)/1(on)
	private int power; // 전원
	private String paper; // 내용
	private String toner; // 토너 색상
	private int paperNum; // 남은 종이 수
	// getter, setter 메소드
	// field에 대한 상태값 확인, 변경하는 역할
	// 프린터 생성자

	public Printer(int power, String paper, String toner, int paperNum) {
		this.power = power;
		this.paper = paper;
		this.toner = toner;
		this.paperNum = paperNum;
	}

	// 전원 설정
	public void setPower(int power) {
		this.power = power;
	}

	public int getPower() {
		return this.power;
	}

	// 토너 색상 설정
	public void setToner(String toner) {
		this.toner = toner;
	}

	public String getToner() {
		return this.toner;
	}

	// 남은 종이 수량
	public void setPaper(int paperNum) {
			this.paperNum += paperNum;
			System.out.printf("종이가 5장 추가되었습니다. 남은 종이 수 %d%n", this.paperNum);
	}

	public int getPaper() {
		return this.paperNum;
	}

	// scan에 대한 메소드 특성
	public String scan(String target) {
		String result = null;
		// 스캔 특성을 실행할 수 있는 조건 추가
		// ->전원 on 상태 확인
		if (this.paperNum != 0) {
			System.out.println("타겟에 대한 스캔 작업.");
			result = String.format("target:(\'%s\')에 사본 이미지 자료", target);
		} else {
			result = "종이가 없습니다. 종이를 추가하세요!";
		}
		return result;
	}

	// 복사
	public String copy(String paper, int count) {
		String result = null;
		if (this.paperNum != 0) {
			result = "";
			for(int i = 1; i<=count; ++i) {
				result += this.paper;
				--this.paperNum;
				if(this.paperNum<=0) {
					result += "종이가 부족합니다.";
					break;
				}
			}
			
		}
		return result;
	}

	// 프린트
	public void print(String print, String toner, int count) {
		String result = null;
		if (this.paperNum != 0) {
			result = "";
			for (int i = 1; i <= count; ++i) {
				result += String.format("%s 색상으로 %s를 출력합니다. %n", toner, print);
				--this.paperNum;
				if(this.paperNum <=0) {
					result += "종이가 부족합니다.";
					break;
				}
			}
			System.out.println(result);
		} else {
			System.out.println("종이가 없습니다. 종이를 추가하세요!");
		}
	}
}
