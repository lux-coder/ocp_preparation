import java.util.*;

public class Person{
	
	public enum Sex{
		MALE, FEMALE
	}
	
	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;
	
	public int getAge(){
		birthday = Period(LocalDate.now() - birthday);
		return birthday;
	}
	
	public void printPerson(){}
	
	//to restrictive and brittle
	public static void printPersonsOlderThan(List<Person> roster, int age){
		for(Person p: roster){
			if(p.getAge() >= age){
				p.printPerson();
			}
		}
	}
	
	//more generalized search methods
	public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high){
		for(Person p: roster){
			if(low <= p.getAge() && p.getAge() < high){
				p.printPerson();
			}
		}		
	}
	
	//specify search criteria code in local class
	//this code is less brittle, no need to change methods if Person class changes
	interface CheckPerson{
		boolean test(Person p);
	}
	class CheckPersonEligibleForSelectiveService implements CheckPerson{
		public boolean test(Person p){
			return p.getGender == Person.Sex.MALE &&
					p.getAge() >= 18 &&
					p.getAge() <= 25;
		}
	}
	public static void printPerson(List<Person> roster, CheckPerson tester){
		for(Person p: roster){
			if(tester.test(p)){
				p.printPerson();
			}
		}
	}
	//for useing this class need new instance of it
	printPerson(roster, new CheckPersonEligibleForSelectiveService());
	
	//because that class implements interface can use anonymus class to bypass
	//need to declare new class for each search
	//but code is bulky considering interface contains only one method
	printPerson(
		roster,
		new CheckPerson(){
			public boolean test(Person p){
				return p.getGender() == Person.Sex.MALE
						&& p.getAge() >= 18
						&& p.getAge() <= 25;
			}
		}
	);
	
	//as CheckPerson interface is functional interface (has only one abstract method)
	//can omit the name to get lambda expression
	printPerson(
		roster
		(Person p) -> p.getGender() == Person.Sex.MALE
				&& p.getAge() >= 18
				&& p.getAge() <= 25
		);
	
	public static void printPersonWithPredicate(List<Person> roster, Predicate<Person> tester){
		for(Person p: roster){
			if(tester.test(p)){
				p.printPerson();
			}
		}
	}
	
	//method invocation stays the same when interface CheckPerson switched with Predicate interface
	printPersonWithPredicate(
		roster
		(Person p) -> p.getGender() == Person.Sex.MALE
				&& p.getAge() >= 18
				&& p.getAge() <= 25
		);
		
	public static void processPersons(List<Person> roster, Predicate<Person> tester, Consumer<Person> block){
		for(Person p: roster){
			if(tester.test(p)){
				block.accept(p);
			}
		}
	}
	
	processPersons(
		roster,
		p -> p.getGender() == Person.Sex.MALE
			&& p.getAge() >= 18
			&& p.getAge() <= 25,
		p -> p.printPerson()
	);
	
	public static void processPersonsWithFunction(List<Person> roster, Predicate<Person> tester,
													Function<Person, String> mapper, Consumer<String> block){
		for(Person p: roster){
			if(tester.test(p)){
				String data = mapper.apply(p);
				block.accept(data);
			}
		}
	}
	
	processPersonsWithFunction(
		roster,
		p -> p.getGender() == Person.Sex.MALE
			&& p.getAge() >= 18
			&& p.getAge() <= 25,
		p -> p.getEmailAddreess(),
		email -> System.out.println(email)
	);
	
	public static <X, Y> void processElements(
		Iterable<X> source,
		Predicate<X> tester,
		Function <X, Y> mapper,
		Consumer<Y> block) {
			for(X p: source){
				if(tester.test(p)){
					Y data = mapper.apply(p);
					block.accept(data);
				}
			}
		}
	)
	
	roster
		.stream()
		.filter(p -> p.getGender() == Person.Sex.MALE
					&& p.getAge() >= 18
					&& p.getAge() <= 25)
		.map(p -> p.getEmailAddreess())
		.forEach(email -> System.out.println(email));



}