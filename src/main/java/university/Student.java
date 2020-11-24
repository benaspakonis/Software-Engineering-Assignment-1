package university;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Years;

public class Student {

	private String SLASH = "/";
	
	private String name;
	private int age;
	private DateTime DOB;
	private String id;
	private String username;
	private List<Course> courses = new ArrayList<Course>();
	private List<Module> modules = new ArrayList<Module>();
	
	public Student(String name,DateTime DOB) {
		this.name = name;
		this.DOB = DOB;
		generateUsername();
		generateAge();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public DateTime getDOB() {
		return DOB;
	}

	public void setDOB(DateTime dOB) {
		DOB = dOB;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void generateUsername() {
		this.username = name.replace(" ","") + DOB.getDayOfMonth() + SLASH + DOB.getMonthOfYear() + SLASH + DOB.getYear();
	}

	public List<Course> getCourse() {
		return courses;
	}

	public void setCourse(List<Course> course) {
		this.courses = course;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	
	public void addModule(Module module) {
		modules.add(module);
	}
	
	public void removeModule(Module module) {
		modules.remove(module);
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public void removeCourse(Course course) {
		courses.remove(course);
	}
	
	public void generateAge() {
		DateTime localDate = new DateTime(System.currentTimeMillis());
		Years years = Years.yearsBetween(DOB, localDate);
		age = years.getYears();
	}
}
