package baseConcept;

/**
 * Predicate interface with a test mehtod
 * @author sarkara1
 *
 */
public interface Predicate<T> {
	
	public boolean test(T candidate);

}
