package com.polymorphism5;

public class VirtualDemo {

	   public static void main(String [] args) {
		   
	      Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
	      Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
	      System.out.println();
	      System.out.println("Call mailCheck using Salary reference --");   
	      s.mailCheck();
	      System.out.println("\nCall mailCheck using Employee reference--");
	      e.mailCheck();
	      
	      System.out.println(appendTest());
	      
	   }
	   public static String appendTest() {
		   StringBuilder sb = new StringBuilder();
		   sb.append("나는").append("성재당").append("1조지용");
		   return sb.toString();
	   }
	}
