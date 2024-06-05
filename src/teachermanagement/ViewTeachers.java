package teachermanagement;

import java.util.ArrayList;

public class ViewTeachers extends State {

	private String[] functions;
	private Group<Teacher> teachers;

	ViewTeachers(Group<Teacher> teachers) {
		functions = new String[] { "1. 학생 추가하기", "2. 학생 보기", "3. 연봉 수정하기", "4. 해고하기", "5. 나가기" };
		this.teachers = teachers;
	}

	public String init() {
		System.out.println("\t선생님 목록");
		ArrayList<Teacher> group = teachers.getGroup();
		group.forEach(teacher -> System.out.printf("\n\t%d. %s 선생님\n\t   평균성적: %.0f\n\t   연봉: %s\n",
				group.indexOf(teacher) + 1, teacher.getName(), teacher.getPerformance(), teacher.getSalary()));
		System.out.println();
		String response = Util.prompt(functions);
		return response;
	}

	private boolean isEmpty(ArrayList<Teacher> list) {

		if (list.isEmpty()) {
			System.out.println("선생님이 없습니다.\n");
			return true;
		}

		return false;

	}

	public Teacher take(Action<Teacher> action) {

		Teacher teacher = null;
		if (!isEmpty(teachers.getGroup())) {
			teacher = action.init();
			if (teacher != null) {
				teachers.set(teacher, teacher.getIndex());
			} else {
				System.out.println("존재하지 않는 선생님 입니다.\n");
			}
		}
		return teacher;
	}
}
