import java.util.function.*;
import java.util.*;

public class Applicant{
	
	private int id;
	private String name;
	private Gender gender;
	private int age;
	private String status = "Registred";
	
	public Applicant(String name, Gender gender, int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public Applicant(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Applicant(String name){
		this.id = new Random().nextInt();
		this.name = name;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;		
	}
	
	public Gender getGender(){
		return gender;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getStatus(){
		return status;
	}
	
	public void setStatus(String status){
		this.status = status;
	}
	
	public enum Gender{
		MALE, FEMALE
	}
	
	public static void verify(Applicant applicant, Predicate<Applicant> predicate){
		if(predicate.test(applicant))
			System.out.println(applicant.getName() + "is accepted.");
		else
			System.out.println(applicant.getName() + "is rejected.");
	}
	
	public static void handleApplicant(Applicant applicant, Consumer<Applicant> consumer){
		consumer.accept(applicant);
	}
	
	public static void handleApplicantFunc(Applicant applicant, Function<Applicant, String> function){
			String result = function.apply(applicant);
			System.out.println(applicant.getName() + " is " + result);
	}
	
	public static Supplier<Applicant> provider(){
		return () -> new Applicant("John Doe");
	}
	
	public static void main(String[] args){
		Predicate<Applicant> isMale = a -> a.getGender() == Applicant.Gender.MALE;
		Predicate<Applicant> isWorkingAge = a -> a.getAge() >=18 && a.getAge() < 60;
		Predicate<Applicant> isValid = isMale.and(isWorkingAge);
		
		Applicant applicant1 = new Applicant("Albert", Applicant.Gender.MALE, 30);
		Applicant applicant2 = new Applicant("Emily", Applicant.Gender.FEMALE, 20);
		Applicant applicant3 = new Applicant("Daniel", Applicant.Gender.MALE, 16);
		
		verify(applicant1, isValid);
		verify(applicant2, isValid);
		verify(applicant3, isValid);
		
		Consumer<Applicant> setStatus = a -> {
			if(a.getAge() >= 18 && a.getAge() < 60)
				a.setStatus("Accepted!");
		};
		
		Consumer<Applicant> notify = a -> {
			if(a.getStatus().equals("Accepted!"))
				System.out.println(a.getName() + " is accepted");
		};
		
		handleApplicant(applicant1, setStatus.andThen(notify));
		handleApplicant(applicant2, setStatus.andThen(notify));
		handleApplicant(applicant3, setStatus.andThen(notify));
		
		Applicant applicant4 = new Applicant("Eniliy", 20);
		handleApplicant(applicant4, setStatus.andThen(notify));
		
		Function<Applicant, Applicant> setStatusF = a -> {
			if(a.getAge() >= 18 && a.getAge() < 60)
				a.setStatus("Accepted!");
			return a;
		};
		
		Function<Applicant, String> returnResult = a -> {
			if(a.getStatus().equals("Accepted!"))
				return "Accepted";
			else
				return "Rejected";
		};
		
		handleApplicantFunc(applicant1, returnResult.compose(setStatusF));
		handleApplicantFunc(applicant2, returnResult.compose(setStatusF));
		handleApplicantFunc(applicant3, returnResult.compose(setStatusF));
		
		handleApplicantFunc(applicant1, setStatusF.andThen(returnResult));
		handleApplicantFunc(applicant2, setStatusF.andThen(returnResult));
		handleApplicantFunc(applicant3, setStatusF.andThen(returnResult));
		
		Supplier<Applicant> supplier = provider();
		Applicant appl1 = supplier.get();
		Applicant appl2 = supplier.get();
		System.out.println("First dummy applicant's id is " + appl1.getId());
		System.out.println("Second dummy applicant's id is " + appl2.getId());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}