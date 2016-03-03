package baseConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Unfiltered list of candidates is created
				List<Candidate> candidates = new ArrayList<Candidate>();
				candidates.add(new Candidate(20.3, "Good", true));
				candidates.add(new Candidate(12.3, "Bad", false));
				candidates.add(new Candidate(78.2, "Ugly", true));
				
		Collections.sort(candidates, (c1, c2)->{
			if(c1.getAttribute1()>c2.getAttribute1())
				return 1;
			else if(c1.getAttribute1()>c2.getAttribute1())
				return -1;
			else
				return 0;
		});		
				
	}

}
