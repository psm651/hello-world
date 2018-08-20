package first;

public class SringBufferExam {

	public static void main(String[] args) {
		StringBuffer st =new StringBuffer();
		st.append("hello");
		st.append(" ");
		st.append("world");
		
		
		System.out.println(st);
		String str = st.toString();
		System.out.println(str);

		
		
		StringBuffer st2 = new StringBuffer();
		StringBuffer st3 = st2.append("hello");
		if(st2==st3) {
			System.out.println("st2==st3");
			String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
			System.out.println(str2);
			
		}
		}

}
