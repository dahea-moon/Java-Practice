package Polymorphism;

import java.util.ArrayList;

class Animal {
	
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다");
	}

	public void readBooks() {
		System.out.println("책 읽기");
	}
	
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다");
	}
	public void hunting() {
		System.out.println("사냥");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아간다");
	}
	public void flying() {
		System.out.println("날아가기");
	}
}
public class AnimalTest {
	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		Human human = (Human)hAnimal;
		human.readBooks();
		
		// human을 eagle로 캐스팅 할 수는 없음. 아래는 오류 남.
		// Eagle human = (Eagle)hAnimal; 
		
		// hAnimal이 eagle 타입일때만 캐스팅
		// instanceof는 t/f를 반환
		if (hAnimal instanceof Eagle) {
			Eagle human2 = (Eagle)hAnimal;
		}
		
//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(eAnimal);
		animalList.add(tAnimal);
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for (int i=0; i<list.size(); i++) {
			Animal animal = list.get(i);
			if (animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
		}
	}
	
	// 이런 polymorphism이 없다면 아래의 상위클래스 메서드 1개로 안되고  3개 타입의 각각 오버라이딩 메서드를 만들어야한다
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
}
