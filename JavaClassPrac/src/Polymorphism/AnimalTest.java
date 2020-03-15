package Polymorphism;

import java.util.ArrayList;

class Animal {
	
	public void move() {
		System.out.println("������ �����Դϴ�");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�");
	}

	public void readBooks() {
		System.out.println("å �б�");
	}
	
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�");
	}
	public void hunting() {
		System.out.println("���");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ư���");
	}
	public void flying() {
		System.out.println("���ư���");
	}
}
public class AnimalTest {
	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		Human human = (Human)hAnimal;
		human.readBooks();
		
		// human�� eagle�� ĳ���� �� ���� ����. �Ʒ��� ���� ��.
		// Eagle human = (Eagle)hAnimal; 
		
		// hAnimal�� eagle Ÿ���϶��� ĳ����
		// instanceof�� t/f�� ��ȯ
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
	
	// �̷� polymorphism�� ���ٸ� �Ʒ��� ����Ŭ���� �޼��� 1���� �ȵǰ�  3�� Ÿ���� ���� �������̵� �޼��带 �������Ѵ�
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
}
