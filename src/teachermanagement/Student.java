package teachermanagement;

public class Student extends Person {

	int grade;

	Student() {
		this("평균적인 학생", 75);
	}

	Student(String name, int grade) {
		this.setName(name);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
