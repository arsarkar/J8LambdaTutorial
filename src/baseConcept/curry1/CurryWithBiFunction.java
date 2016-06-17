package baseConcept.curry1;

import java.util.stream.Stream;

public class CurryWithBiFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> numbers = Stream.iterate(0, i->i+1).limit(10);
		
		numbers.map(x->(x+1))
			   .map(x->x*2)
			   .forEach(System.out::println);
		
		Stream<String> names = Stream.generate(()->"a").limit(10);
		
		names.map(s->(s+" b"))
			 .map(s->(s+" c"))
			 .forEach(System.out::println);
		
	}

}
