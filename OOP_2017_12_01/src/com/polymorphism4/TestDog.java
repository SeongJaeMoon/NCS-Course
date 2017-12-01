package com.polymorphism4;

class Animal {
	
	public void move() {
		System.out.println("Animals can move");
	}
}

class Dog extends Animal {
	@Override
	public void move() {
		System.out.println("Dogs can walk and run");
	}
	public void bark() {
		System.out.println("Dog can bark");
	}
}
class Cat extends Animal{
	@Override
	public void move() {
		System.out.println("Cat can walk and run");
	}
}

public class TestDog {
	public static void main(String[]args) {
		Animal[]ani = new Animal[5];
		ani[0] = new Dog();
		ani[1] = new Dog();
		ani[2] = new Dog();
		ani[3] = new Dog();
		ani[4] = new Cat();
		for(Animal a : ani) {
			//move() 메소드는 오버라이딩 (Overriding)상태이므로 Dog, Cat 전용 move()가 호출
			a.move();
			if(a instanceof Dog) {
				Dog d= (Dog)a;
				d.bark();
			}
		}
	}
}
