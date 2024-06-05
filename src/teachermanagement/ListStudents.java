package teachermanagement;

public class ListStudents extends Action<Teacher> {
	
	ListStudents() {
		prompt = "학생을 볼 선생님의 번호를 입력하세요.";
		message = "선생님의 학생 목록을 조회 합니다.\n";
	}
	
	ListStudents(Group<Teacher> group) {
		this();
		this.group = group;
	}
	
	public Teacher specific(Teacher teacher) {
		return teacher;
	}
}
