package teachermanagement;

public class Fire extends Action<Teacher> {

	Fire() {
		prompt = "해고할 선생님의 번호를 입력해 주세요.";
		message = "선생님을 해고했습니다.\n";
	}

	Fire(Group<Teacher> group) {
		this();
		this.group = group;
	}

	public Teacher specific(Teacher teacher) {
		group.remove(teacher.getIndex());
		System.out.println(message);
		return null;
	}

}
