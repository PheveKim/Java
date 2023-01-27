package day0127.test02_set;

public class Person {

	private String name;
	private String id;
	
	public Person(String name, String id) {
		
		super();
		this.name = name;
		this.id = id;
		
	}
	
	
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person other = (Person) obj;
			return this.id.equals(other.id);
		}
		else return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
}
