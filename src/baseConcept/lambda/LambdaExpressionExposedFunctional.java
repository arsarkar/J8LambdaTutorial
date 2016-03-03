package baseConcept.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaExpressionExposedFunctional {

	public static void main(String[] args) {
		
		BiFunction<Double, Double, Double> addition = (x, y) -> {
			return x+y;
		};
		BiFunction<Double, Double, Double> subtraction = (x, y) -> {
			return x-y;
		};
		BiFunction<Double, Double, Double> multiplication = (x, y) -> (x*y);
		
		printResult(5, 3, addition);
		printResult(5, 3, subtraction);
		printResult(5, 3, multiplication);
	}

	public static void printResult(double x, double y, BiFunction<Double, Double, Double> calc){
		System.out.println("Calculation result "+ calc.apply(x, y));
	}

}
