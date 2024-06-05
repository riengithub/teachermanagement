package teachermanagement;

import java.util.ArrayList;

public class ViewStudents extends State {

	private String[] functions;
	private Group<Student> students;

	ViewStudents(Group<Student> students) {
		functions = new String[] { "1. 성적 수정하기", "2. 퇴학 시키기", "3. 나가기" };
		this.students = students;
	}

	public String init() {

		ArrayList<Student> group = students.getGroup();

		System.out.println("\t학생 목록");
		group.forEach(student -> System.out.printf("\n\t%d. %s 학생\n\t   성적: %d\n", group.indexOf(student) + 1,
				student.getName(), student.getGrade()));
		System.out.println();
		String response = Util.prompt(functions);
		return response;
	}

	private boolean isEmpty(ArrayList<Student> list) {

		if (list.isEmpty()) {
			System.out.println("학생이 없습니다.\n");
			return true;
		}

		return false;

	}

	public void take(Action<Student> action) {
		if (!isEmpty(students.getGroup())) {
			Student student = action.init();
			if (student != null) {
				students.set(student, student.getIndex());
			} else {
				System.out.println("존재하지 않는 학생 입니다.\n");
			}
		}
	}
	
	public Group<Student> getStudents () {
		return students;
	}
}
