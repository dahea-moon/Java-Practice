package gameLevel;

public class BegginerLevel extends PlayerLevel{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("천천히 달립니다");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("못함");

	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("못함");

	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("초급자");

	}

}
