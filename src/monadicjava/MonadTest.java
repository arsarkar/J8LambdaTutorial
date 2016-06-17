package monadicjava;

import java.util.Optional;

public class MonadTest {

	public static void main(String[] args) {
		System.out.println(getCarInsurance_monad1(Optional.ofNullable(null)));

	}
	
	/**This is probably the most concise version of getCarInsurance 
	 * without using lambda
	 * this needs tree unnecessary variables
	 * It also lost the unified null reporting
	 * It seems that even with ternary operator null check is inevitable 
	 */
//	public static String getCarInsurance_nonlambda(Person person){
//		Car car =  (person == null) ? null : person.getCar();
//		Insurance insurance = (car == null) ? null : car.getInsurance();
//		String name = (insurance == null) ? null : insurance.getName();
//		return name = (name != null)? "UNKNOWN" : name;
//	}
	
	public static String getCarInsurance_monad1(Optional<Person> person){
		return person.flatMap(t -> t.getCar())
			  .flatMap(t -> t.getInsurance())
			  .map(t -> t.getName())
			  .orElse("Unknown");
	}

}
