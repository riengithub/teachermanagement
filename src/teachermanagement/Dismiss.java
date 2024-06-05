package teachermanagement;

public class Dismiss extends Action<Student> {

	Dismiss() {
		prompt = "퇴학 시킬 학생의 번호를 입력해 주세요.";
		message = "학생을 퇴학 시켰습니다.\n";
	}

	Dismiss(Group<Student> group) {
		this();
		this.group = group;
	}

	public Student specific(Student student) {
		group.remove(student.getIndex());
		System.out.println(message);
		return null;
	}

}
