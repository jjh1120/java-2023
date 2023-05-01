package s0501;

public class Car {

	String owner;
	String color;
	int speed;
	int km;
	int count;

	Car() {
		count++;
	}

	Car(String name) {
		owner = name;
		count++;
	}

	Car(String name, String col, int speed) {
		this.owner = name;
		this.color = col;
		this.speed = speed;
		count++;
	}

	void run() {
		km = km + 10;
	}

	void stop() {
		speed = 0;
		System.out.println(owner + "저의 차는" + km + "를 달렸습니다");
	}

	void speedUp() {
		speed += 10;
		System.out.println(owner + "의 차의 현재속도는" + speed + "입니다");
		km += 2;
		System.out.println(owner + "저의 차는" + km + "를 달렸습니다");

	}

	void speedDown() {
		speed -= 5;
		System.out.println(owner + "의 차의 현재속도는" + speed + "입니다");

	}

	void printCarInfo() {
		System.out.println("소유자:" + owner);
		System.out.println("색상:" + color);
		System.out.println("현재속도:" + speed);
		System.out.println("주행거리:" + km);

	}

}
