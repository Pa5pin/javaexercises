package streams.exercise.two;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import java.util.Arrays;
import java.util.List;

public class Streams_Ex_2_Runner {
	
	public static void main (String[] args) {
		
		List<Integer> number = Arrays.asList(3, 4, 7, 8, 12);
		int even = 
		        number.stream()
		            .reduce((a,b) -> a * b)
		            .get();
		System.out.println(even);
		
	}

}
