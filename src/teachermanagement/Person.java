package teachermanagement;

public abstract class Person {
	private String name;
	private int index;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public Person setIndex(int index) {
		this.index = index;
		return this;
	}
}
