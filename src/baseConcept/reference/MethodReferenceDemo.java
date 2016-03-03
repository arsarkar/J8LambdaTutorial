package baseConcept.reference;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		//exposed function way of using lambda
		Converter<String, Integer> converter = f->(Integer.valueOf(f));
		System.out.println(converter.convert("123"));
		
		//another way of programming the same using static method reference
		Converter<String, Integer> converter2 = Integer::valueOf;
		
		//method reference can be of some object method
		StringConvert sc = new StringConvert();
		Converter<String, String> converter3 = sc::convert;
		
		//or may be a constructor
		//I have no idea why should I use a contructor reference
		
	}

}

interface Converter<F, T>{
	T convert(F from);
}

class StringConvert{
	
	public String convert(String s){
		return s+1;
	}
	
}
