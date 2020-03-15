package template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동 킴");
	}
	
	public void turnOff() {
		System.out.println("시동 끔");
	}
	
	public void washCar() {};
	
	// template method: 하위 클래스에서 재정의 불가
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
