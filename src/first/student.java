package first;

public class student {
	String name;
	String number;
	int birthYear;
	
	public static void main(String[] args) {
		student s1 = new student();
		s1.name = "ȫ�浿";
		s1.number = "1234";
		s1.birthYear = 1995;
		
		student s2 = new student();
		s2.name = "ȫ�浿";
		s2.number = "1234";
		s2.birthYear = 1995;
		
		if(s1.equals(s2))
			System.out.println("s1=s2");
		else
			System.out.println("s1!=s2");
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.toString());

	}

	@Override
	public String toString() {
		return "student [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	
	}
}
