package baseConcept.stream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String[] args) {

		//generic example of stream operation on a collection
		Stream.of("a1", "a2", "b1", "c2", "c1")
			  .filter(s-> s.startsWith("c"))
			  .map(String::toUpperCase)
			  .sorted()
			  .forEach(s -> {
					System.out.println(s);
				});
		
		//how to create a stream from other collections
		List<String> list = new LinkedList<String>();
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.stream().anyMatch(s->(true));
		
		//different types of primitive streams
		IntStream.range(1, 100);
		DoubleStream.generate(()->3.14d);
		Stream.of(new Person("Arko"), new Person("Dusan"), new Person("Sanjeewa"));
		Arrays.stream(new int[]{1, 2, 3, 4});
		
		//primitives strings supports average and sum
		Arrays.stream(new int[]{1, 2, 3, 4}).average();
		
		
		
	}

}
