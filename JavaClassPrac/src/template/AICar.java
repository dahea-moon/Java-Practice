package template;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("스스로 멈춤");
	}
	
	@Override
	public void washCar() {
		System.out.println("세차");
	}
}
