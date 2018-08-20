package first;

public class EnumExam {
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";
	public static void main(String[] args) {
		String gender1 ;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy";
		
		System.out.println(gender1);
		
		Gender gender2;
		gender2 = Gender.FEMALE;
		gender2 = Gender.MALE;
		
		System.out.println(gender2);
	}

	enum Gender{
		MALE,FEMALE;
	}
}
