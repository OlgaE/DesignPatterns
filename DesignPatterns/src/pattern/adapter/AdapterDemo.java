package pattern.adapter;

public class AdapterDemo {

	public static void main(String[] args) {
		
		int[] numbers = new int[]{34, 2, 4, 12, 1};
		Sorter sorter = new SortListAdapter();
		numbers = sorter.sort(numbers);

		for(int i : numbers){
			System.out.println(i);
		}
	}

}
