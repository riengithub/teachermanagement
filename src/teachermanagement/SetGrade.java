package teachermanagement;

public class SetGrade extends Action<Student> {
	
	SetGrade() {
		prompt = "성적을 수정할 학생의 번호를 입력하세요.";
		message = "학생의 성적을 수정했습니다.\n";
	}
	
	SetGrade(Group<Student> group) {
		this();
		this.group = group;
	}
	
	public Student specific(Student student) {
		int input = Integer.parseInt(Util.prompt("새로운 성적을 입력하세요.")) ;
		student.setGrade(input);
		System.out.println(message);
		return student;
	}
}
