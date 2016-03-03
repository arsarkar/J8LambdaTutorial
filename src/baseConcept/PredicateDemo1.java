package baseConcept;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PredicateDemo1 {

	public static void main(String[] args) {
		
		//Unfiltered list of candidates is created
		List<Candidate> candidates = new ArrayList<Candidate>();
		candidates.add(new Candidate(20.3, "Good", true));
		candidates.add(new Candidate(12.3, "Bad", false));
		candidates.add(new Candidate(78.2, "Ugly", true));

		//The predicate interface is implemented through an anon
		//class and a object is passed to the filter method. 
		//In the anon implementation test inserts some conditions
		List<Candidate> filteredCandidates = filterCandidate(candidates, new Predicate<Candidate>() {

			@Override
			public boolean test(Candidate candidate) {
				if (candidate.getAttribute1() > 20 &&
					candidate.getAttribute2().equals("Ugly")){
					return true;
				}
				return false;
			}
		});	
		
		//Print the filtered candidates
		for(Candidate c:filteredCandidates){
			System.out.println(c.toString());
		}
		
		//another implementation of predicate is in sorting the list
		candidates.sort(new Comparator<Candidate>() {

			@Override
			public int compare(Candidate c1, Candidate c2) {
				if(c1.getAttribute1()>c2.getAttribute1())
					return 1;
				else if(c1.getAttribute1()>c2.getAttribute1())
					return -1;
				else
					return 0;
			}
		});
				
	}
	
	/**
	 * This method receives an implementation of predicate interface
	 * It executes the test method on each candidate in the list and 
	 * returns filtered candidates
	 * @param candidates
	 * @param p
	 * @return
	 */
	public static List<Candidate> filterCandidate(List<Candidate> candidates, Predicate p){
		List<Candidate> fileteredCandidates = new ArrayList<Candidate>();
		for(Candidate c:candidates){
			if (p.test(c)){
				fileteredCandidates.add(c);
			}
		}
		return fileteredCandidates;
	}
	
}
