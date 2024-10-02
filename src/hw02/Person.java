package hw02;
/**
 * Author:        Adam Dixon
 * Description: This class give attributes and methods to a person
 */
public class Person implements Comparable<Person>{
	private String name;
	private int age;
	private long id;
	
	public Person(String name, int age, long id) {
		this.name = name;
		this.age = age;
		this.id = id;
		
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
		if (age < 0) {
			throw new RuntimeException("Age cannot be negative.");
		}
		else {
			this.age = age;
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		if (id < 0) {
			throw new RuntimeException("ID cannot be negative.");
		}
		else {
			this.id = id;
		}
	}
	
	//Person p1;
	//Person p2;
	//p1.compareTo(p2);
	//return 0 p1.name == p2.name
	//return < 0  p1.name < p2.name
	//return > 0 p1.name > p2.name
	
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}
	
	public String toString() {
		return "name: " + this.name + ", age: " + this.age + ", id: " + this.id;
	}
	
	
	
	
}
