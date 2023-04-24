package s03_20;

public class 배열1 {

	public static void main(String[] args) {

		
		int a[]= {1,2,3,4,5};
		int []b= {1,2,3,4,5};
		int c[]=new int[5];
		
		boolean d[]=new boolean[5];
		System.out.println(d[0]);
		
		char e[]=new char[5];
		System.out.println(e[0]);
		System.out.println("----");
		
		System.out.println("a배열의 크기:"+a.length);
		
		for(int i=0; i<5; i++)
			System.out.println("a["+i+"]"+"="+a[i]);
		
		String str []=new String[3];
		str[0]="신경화";
		str[1]="자바는 더 재밌어";
		str[2]="파이썬은 참 쉽고 재밌는거 같아";
		
		for(int i=0; i<str.length; i++)
			System.out.println(str[1]);
		
		
		
		
		

	}

}
