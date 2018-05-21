package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prac08Book {

	public static void main(String args[]) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		// Print command arguments list
		List<String> arglist = Arrays.asList(args);
		System.out.println(arglist);
		
		// Initialize frequency table from command line
		for (int i = 0; i < args.length; i++) {
			Integer freq = m.get(args[i]);
			m.put(args[i], (freq == null ? 1 : freq + 1));
		}
		System.out.println(m.size() + " distinct words detected:");
		System.out.println(m);
	}
}
