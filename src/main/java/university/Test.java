package university;

import org.joda.time.DateTime;

public class Test {

	public static void main(String args[]) {
		Student student = new Student("Johnny Smith", new DateTime(1999,5,26,0,0));
		student.generateUsername();
		System.out.println(student.getUsername());
	}
	
}
