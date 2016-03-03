package baseConcept.lambda;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		Calculator addition = (x, y)->(x+y);
		Calculator subtraction = (x, y) -> (x-y);
		Calculator multiplication = (x, y) -> (x*y);
		
		printResult(5, 3, addition);
		printResult(5, 3, subtraction);
		printResult(5, 3, multiplication);
	}

	public static void printResult(double x, double y, Calculator calc){
		System.out.println("Calculation result "+ calc.calculate(x, y));
	}
	
}
