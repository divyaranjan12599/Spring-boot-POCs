package forEachMethod;

import java.util.Arrays;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5);
		for(int i:l)
			System.out.println(i);
		
		l.forEach(i->System.out.print(i+" "));//Lambda //Consumer
	}
}
