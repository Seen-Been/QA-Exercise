package reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceTest {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(2,3,4,5, 10, 24, 35, 52);
		int even = number.stream()
				.filter(x->x % 2 == 0) //number in collection must be even
				.reduce(0, (a, b) -> a + b); //applies method to each element of a collection. Initial value = 0, a is accumulator, b is next number
		
		System.out.println(even);

	}

}
