package teachermanagement;

public class AddStudent extends Action<Teacher> {

	AddStudent() {
		prompt = "학생을 추가할 선생님의 번호를 입력하세요.";
		message = "학생을 추가했습니다.\n";
	}

	AddStudent(Group<Teacher> group) {
		this();
		this.group = group;
	}

	public Teacher specific(Teacher teacher) {
		String name = Util.prompt("학생의 이름을 입력해 주세요.");
		int grade = Integer.parseInt(Util.prompt("학생의 성적을 입력해주세요."));
		teacher.getStudents().add(new Student(name, grade));
		System.out.println(message);
		return teacher;
	}

}
