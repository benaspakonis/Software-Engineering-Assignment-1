import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import university.Student;

public class JUnitTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {	
	}
	
	@Test
	public void generateUsernameTest() {
		Student student = new Student("John Bloggs", new DateTime(2000,1,1,0,0));
		String str1 = "JohnBloggs1/1/2000";
		assertEquals(student.getUsername(),str1);
	}
	
	@Test
	public void generateAgeTest() {
		Student student = new Student("John Bloggs", new DateTime(2000,1,1,0,0));
		int i = 20;
		assertEquals(student.getAge(),i);
	} 

}
