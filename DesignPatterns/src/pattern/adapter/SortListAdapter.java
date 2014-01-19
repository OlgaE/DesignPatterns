package pattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class SortListAdapter implements Sorter {

	@Override
	public int[] sort(int[] numbers){
		
		List<Integer> numberList = new ArrayList<Integer>();
		for(int i : numbers){
			numberList.add(i);
		}
		
		NumberListSorter sorter = new NumberListSorter();
		numberList = sorter.sort(numberList);
		
		int[] sortedNumbers = new int[numberList.size()];
		for (int i = 0; i < numberList.size(); i++){
			sortedNumbers[i] = numberList.get(i);
		}
		
		return sortedNumbers;
	}
}