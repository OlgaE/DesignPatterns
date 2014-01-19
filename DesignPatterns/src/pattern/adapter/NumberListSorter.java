package pattern.adapter;

import java.util.Collections;
import java.util.List;

public class NumberListSorter {
	
	public List<Integer> sort(List<Integer> numbers){

		Collections.sort(numbers);
		return numbers;
	}

}
