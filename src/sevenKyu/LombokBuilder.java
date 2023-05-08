package sevenKyu;

public class LombokBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p = new People.PeopleBuilder(23, "Dima", "Prokhorenko").setAge(123).build();
		System.out.println(p);
	}

}


class People {
	private int age;
	private String name;
	private String lastName;
	private final String GREET = "hello";
	
	public String getName() { return name; }
	
	public int getAge() { return age; }
	
	public String getLastName() { return lastName; }
	
	private People(PeopleBuilder builder) {
		this.age = builder.age;
		this.name = builder.name;
		this.lastName = builder.lastName;
	}
	
	public String greet() {
		return GREET + " my name is " + name;
	}
	
	public String toString() {
		return String.format("%s %s, age - %d", name, lastName, age);
	}
	
	public static class PeopleBuilder {
		private int age;
		private String name;
		private String lastName;
		private final String GREET = "hello";
		
		
		public PeopleBuilder(int age, String name, String lastName) {
			this.age = age;
			this.name = name;
			this.lastName = lastName;
		}
		
		public PeopleBuilder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public PeopleBuilder setName(String name) {
			this.name = name;
			return this;
		}
		
		public PeopleBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public People build() {
			return new People(this);
		}
	}
}
