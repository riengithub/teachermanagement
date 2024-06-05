package teachermanagement;

import java.util.ArrayList;

public class Teacher extends Person {

	private String salary;
	private double performance;
	private Group<Student> students;
	private double total;

	public Teacher() {
	}

	public Teacher(String name, String salary) {
		this.setName(name);
		this.salary = salary;
		this.students = new Group<Student>();
		this.performance = 0;
		total = 0;
	}

	public String getSalary() {
		return salary;
	}

	public double getPerformance() {
		this.setPerformance();
		return performance;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}


	public void setStudents(Group<Student> students) {
		this.students = students;
	}

	public void setPerformance() {
		
		total = 0;

		ArrayList<Student> list = students.getGroup();

		if (list.size() > 0) {
			list.forEach(student -> total += student.getGrade());

			this.performance = total / list.size();
		} else {
			this.performance = 0;
		}

	}

	public Group<Student> getStudents() {
		return students;
	}
}
