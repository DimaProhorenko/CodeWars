package sevenKyu;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Office1Outed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] meet = {new Person("Dima", 4), new Person("Archy", 6)};
		
		System.out.println(outed(meet, "Dima"));
	}
	
	public static String outed(Person[] meet, String boss) {
//		List<Person> m = new ArrayList(Arrays.asList(meet));
		List<Person> m = Arrays.stream(meet).filter(p -> p.name == boss).toList();
		
		if (m.get(0).rating < 6) {
			return "Get Out Now!";
		}
		return "Nice Work Champ!";
	}

}


class Person {
	final String name;
	final int rating;
	
	public Person(String name, int rating) {
		this.name = name;
		this.rating = rating;
	}
	
	@Override
	public boolean equals(Object o) {
		Person other = (Person) o;
		return other.name == this.name;
	}
}
