package teachermanagement;

public class ViewHome extends State {
	private String[] functions;
	private Group<Teacher> teachers;

	ViewHome(Group<Teacher> teachers) {
		functions = new String[] { "1. 선생님 채용하기", "2. 선생님 보기", "3. 종료하기" };
		this.teachers = teachers;
	}

	public String init() {
		return Util.prompt(functions);
	}

	public void hire() {
		String name = Util.prompt("선생님의 이름을 입력해 주세요.");
		String salary = Util.prompt("선생님의 연봉을 입력해 주세요.");
		teachers.add(new Teacher(name, salary));
	}
}
