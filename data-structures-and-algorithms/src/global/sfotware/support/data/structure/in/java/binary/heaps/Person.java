package global.sfotware.support.data.structure.in.java.binary.heaps;

/**
 *
 * brunolima on Jun 10, 2021
 * 
 */

public class Person implements Comparable<Person>{

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person person) {
		return Integer.compare(this.age, person.getAge());
	}

}
