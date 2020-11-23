package university;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

public class Course {

	
	private String name;
	private List<Module> modules = new ArrayList<Module>();
	private List<Student> students = new ArrayList<Student>();
	private DateTime startDate;
	private DateTime endDate;
	
	public Course(String name,List<Module> modules,List<Student> students,DateTime startDate, DateTime endDate) {
		this.name = name;
		this.modules = modules;
		this.students = students;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Module> getModules() {
		return modules;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public DateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	public DateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
	public void addModule(Module module) {
		modules.add(module);
		/*
		for(int i = 0; i < module.getStudents().size();i++) {
			students.add(module.getStudents().get(i));
		}
		*/
	}
	
	public void removeModule(Module module) {
		modules.remove(module);
		
	}
	
}
