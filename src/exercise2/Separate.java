package exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class Separate {
	 public static String getString(List<Integer> list) {
	        // Convert to String
	        return list.stream()
	                   // add e or o before each string
	                   .map(n -> (n % 2 == 0 ? "e" : "o") + n)
	                   //Collect all data transformed
	                   .collect(Collectors.joining(","));
	    }

}
