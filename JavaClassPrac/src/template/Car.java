package template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ� Ŵ");
	}
	
	public void turnOff() {
		System.out.println("�õ� ��");
	}
	
	public void washCar() {};
	
	// template method: ���� Ŭ�������� ������ �Ұ�
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
