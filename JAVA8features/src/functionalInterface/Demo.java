package functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Functional Interface ->
//Predicate -- boolean result
//Consumer -- no result
//Function -- input and output
//Supplier -- no input only supply

class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Demo {
	public static void main(String[] args) {
		//Predicate -- boolean result only
		Predicate<String> checkLength=str->str.length()>5;
		System.out.println(checkLength.test("something"));
		
		//Consumer -- modifies data and give no output
		Person p = new Person();
		Consumer<Person> setName = person -> person.setName("something");
		setName.accept(p);
		System.out.println(p.getName());
		
		//Function -- has both input and output
		Function<Integer, String> getInt = t->t+"'s square is "+t*t;
		System.out.println(getInt.apply(7));
		
		//Supplier -- only output
		Supplier<Double> getRandomInt = ()->Math.random();
		System.out.println(getRandomInt.get());
	}
}
