package s0417;

public class Student {
	String name;
	int age;
	int grade;
	int number;
	double weight;

	Student() {
		weight = 0;
	}

	Student(String name, int age, int grade, int number, double weight) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.number = number;
		this.weight = weight;

	}

	void eat() {
		weight++;

	}

	void run() {
		weight--;
	}

	void printName() {
		System.out.println("제 이름은" + name + "입니다");
	}

	void printAll() {
		System.out.println("이름" + getName());
		System.out.println("학년" + getGrade());
		System.out.println("번호" + getNumber());
		System.out.println("나이" + getAge());

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
