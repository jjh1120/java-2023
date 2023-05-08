package s0508;

public class GetSetExam {

	public static void main(String[] args) {

		Student kim = new Student();
		System.out.println(kim.getName());
		kim.setName("김경화");
		System.out.println(kim.getName());
		kim.setGrade(3);
		System.out.println(kim.getName() + "는" + kim.getGrade() + "학년입니다");

	}

}
