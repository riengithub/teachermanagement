package teachermanagement;

public class SetSalary extends Action<Teacher> {
	
	SetSalary() {
		prompt = "연봉을 수정할 선생님의 번호를 입력하세요.";
		message = "선생님의 연봉을 수정했습니다.\n";
	}
	
	SetSalary(Group<Teacher> group) {
		this();
		this.group = group;
	}
	
	public Teacher specific(Teacher teacher) {
		String input = Util.prompt("새로운 연봉을 입력하세요.");
		teacher.setSalary(input);
		System.out.println(message);
		return teacher;
	}
}
