package s03_20;

public class 변수2 {

	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		if(s1==s2) {
			System.out.println("같은주소");
		}else {
			System.out.println("다른주소");
		}
		String s3=new String("abc");		
		String s4=new String("abc");		
		if(s3==s4) {
			System.out.println(s3+"같은주소");
		}else {
			System.out.println(s3+"다른주소");
		}
		
		
		
		
		
		
		
		
		}
	}


