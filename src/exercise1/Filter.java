package exercise1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public List<String> search(List<String> list) {
        // Convert the list to String
        return list.stream()
        		//Filter Strings by width (3)
                .filter(s -> s.length() == 3)
              //Filter Strings by the first letter (a)
                .filter(s -> s.startsWith("a"))
              //put all string respecting the condition to list 
                .collect(Collectors.toList());
    }
	
	public static void main(String[] args) {
		Filter filter = new Filter();
		List<String> content = Arrays.asList("aup1", "add", "app");
		
		
		System.out.println(filter.search(content));
	}
}
