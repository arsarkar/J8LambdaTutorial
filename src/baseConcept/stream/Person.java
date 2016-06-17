package baseConcept.stream;

import java.time.LocalDate;

public class Person {
	
	public enum Sex{
		MALE, FEMALE
	}
	
	String name;
	LocalDate birthDay;
	Sex gender;
	String emailAddress;
	
	public Person(String name) {
		super();
		this.name = name;
	}
	
}
