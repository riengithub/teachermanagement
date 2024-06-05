package teachermanagement;

public class TeacherManagement {

	public static void main(String[] args) {
		State state;

		Group<Teacher> teachers = new Group<Teacher>();
		ViewTeachers viewTeachers = new ViewTeachers(teachers);
		ViewHome viewHome = new ViewHome(teachers);

		state = viewHome;

		end: while (true) {
			String select = state.init();
			switch (select) {
			case "1":

				if (state == viewHome) {
					viewHome.hire();
					break;
				} else if (state == viewTeachers) {
					viewTeachers.take(new AddStudent(teachers));
					break;
				} else if (state instanceof ViewStudents) {
					ViewStudents vs = (ViewStudents) state;
					vs.take(new SetGrade(vs.getStudents()));
					break;
				}

			case "2":

				if (state == viewHome) {

					state = viewTeachers;
					break;
				} else if (state == viewTeachers) {
					Teacher teacher = viewTeachers.take(new ListStudents(teachers));

					if (teacher != null) {
						state = new ViewStudents(teacher.getStudents());
						break;
					} else
						break;

				} else if (state instanceof ViewStudents) {
					ViewStudents vs = (ViewStudents) state;
					vs.take(new Dismiss(vs.getStudents()));
					break;
				}

			case "3":

				if (state == viewHome)
					break end;
				else if (state == viewTeachers) {
					viewTeachers.take(new SetSalary(teachers));
					break;
				} else if (state instanceof ViewStudents) {
					state = viewTeachers;
					break;
				}

			case "4":
				if (state == viewTeachers) {
					viewTeachers.take(new Fire(teachers));
					break;
				}
			case "5":
				if (state == viewTeachers) {
					state = viewHome;
					break;
				}

			default:

				System.out.println("올바른 값을 입력해 주세요.\n");

				break;
			}
		}
	}
}
