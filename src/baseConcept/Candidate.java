package baseConcept;

/**
 * POJO candidate class
 * @author sarkara1
 *
 */
public class Candidate {
	
	private double attribute1 = 0;
	private String attribute2 = "";
	private boolean attribute3 = true;
	
	public Candidate(double attribute1, String attribute2, boolean attribute3) {
		super();
		this.attribute1 = attribute1;
		this.attribute2 = attribute2;
		this.attribute3 = attribute3;
	}

	public double getAttribute1() {
		return attribute1;
	}

	public String getAttribute2() {
		return attribute2;
	}

	public boolean isAttribute3() {
		return attribute3;
	}

	@Override
	public String toString() {
		return "Candidate [attribute1=" + attribute1 + ", attribute2=" + attribute2 + ", attribute3=" + attribute3
				+ "]";
	}
	
	
}
