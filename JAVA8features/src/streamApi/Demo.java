package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4,5,3,7,8,6,1);
		//nums.forEach(n -> System.out.print(n+" ")); 
		//Stream<Integer> data =  nums.stream();
		nums.stream()
		.filter(n->n%2==0)
		.map(n->n*2)
		.sorted()
		.forEach(n -> System.out.print(n+" "));
		//Stream<Integer> sortedData =  data.sorted();
//		long count = data.count();
//		System.out.println(count);
//		data.forEach(n -> System.out.print(n+" "));
		
		//data.forEach(n -> System.out.print(n+" "));
	}

}
