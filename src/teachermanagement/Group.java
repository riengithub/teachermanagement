package teachermanagement;

import java.util.ArrayList;

public class Group<E> {
	private ArrayList<E> group = new ArrayList<E>();

	public ArrayList<E> getGroup() {
		return group;
	}

	public boolean isEmpty() {
		return group.isEmpty();
	}

	public void setGroup(ArrayList<E> list) {
		group = list;
	}

	@SuppressWarnings("unchecked")
	public E get(int i) {

		if (i + 1 > group.size()) {
			return null;
		}

		return (E) ((Person) group.get(i)).setIndex(i);
	}

	public void add(E member) {
		group.add(member);
	}

	public boolean remove(int i) {
		if (i + 1 > group.size()) {
			return false;
		} else {
			group.remove(i);
			return true;
		}

	}

	public void set(E t, int i) {
		group.set(i, t);
	}
}
