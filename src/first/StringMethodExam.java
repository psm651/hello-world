package first;

public class StringMethodExam {

	public static void main(String[] args) {
		String str = "hello";
		int s1 = str.length();
		System.out.println(s1);
		System.out.println(str.concat("world"));
		System.out.println(str);
		str = str.concat("world");
		System.out.println(str);
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));
	}

}
