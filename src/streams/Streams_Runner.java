package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Streams_Runner {

	public static void main(String[] args) {
		
		List<String>names = Arrays.asList("Michael", "Dean", "James", "Chris");
		System.out.println(names);
		List<String> result = names.stream()
				.filter(str -> !str.contains("James"))
				.collect(Collectors.toList());
		int i = 0;
		for (i = 0; i  < result.size(); i++) {
			System.out.println("Hello " + result.get(i));
		}
		
		}
		
		

	}


