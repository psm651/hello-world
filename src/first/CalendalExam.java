package first;

import java.util.Calendar;

public class CalendalExam {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		cal.add(Calendar.MONTH, 1);
		System.out.println(cal.get(Calendar.MONTH));
	}

}
