package template;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("���� ����");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("������ ����");
	}
	
	@Override
	public void washCar() {
		System.out.println("����");
	}
}
