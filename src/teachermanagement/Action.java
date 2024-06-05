package teachermanagement;

abstract class Action<E> {

	String prompt;
	String message;
	Group<E> group;

	Action() {
		prompt = "오류";
		message = "오류";
	}

	Action(Group<E> group) {
		this();
		this.group = group;
	}

	public E init() {
		int i = Integer.parseInt(Util.prompt(prompt)) - 1;
		E person = group.get(i);
		return person == null ? null : specific(person);
	}

	abstract E specific(E person);
}