package com.inheritance004;

//클래스 앞에 접근제한자는 물리적으로 저장된 .java 파일과 같은 이름의 클래스만 붙일 수 있다.
class Calculation {
	   int z;
		
	   public void addition(int x, int y) {
	      z = x + y;
	      System.out.println("The sum of the given numbers:"+z);
	   }
		
	   public void Subtraction(int x, int y) {
	      z = x - y;
	      System.out.println("The difference between the given numbers:"+z);
	   }
	}

	public class My_Calculation extends Calculation {
	   public void multiplication(int x, int y) {
	      z = x * y;
	      System.out.println("The product of the given numbers:"+z);
	   }
		
	   public static void main(String args[]) {
	      int a = 20, b = 10;
	      My_Calculation demo = new My_Calculation();
	      demo.addition(a, b);
	      demo.Subtraction(a, b);
	      demo.multiplication(a, b);
	   }
	}
