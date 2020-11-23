package university;

import java.util.ArrayList;
import java.util.List;

public class Module {

	private String name;
	private List<Student> students = new ArrayList<Student>();
	private List<Course> courses = new ArrayList<Course>();
	
	public Module(String name,List<Student> students) {
		this.name = name;
		this.students = students;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	public void addStudent(Student student) {
		students.add(student);
		student.addModule(new Module(name,students));
	}
	
	public void removeStudent(Student student) {
		for(int i = 0; i < students.size(); i++){
			if(students.get(i) == student) {
				students.remove(i);
				//student.removeModule(new Module(name,students));
				break;
			}
		}
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public void removeCourse(Course course) {
		courses.remove(course);
	}
}