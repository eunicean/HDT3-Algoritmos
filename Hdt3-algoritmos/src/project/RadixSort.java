package project;

public class RadixSort <T extends Comparable<T>>{

	public RadixSort() {
	}
	
	//getting the max number in list
	public T getMaximunNumber(T[] listToFindMaxNumber) {
		T max = listToFindMaxNumber[0];
		for(int i = 1 ; i < listToFindMaxNumber.length ; i++) {
			if(listToFindMaxNumber[i].compareTo(max)>=0)
				max = listToFindMaxNumber[i];
		}
		return max;
	}
	
	//counting sort needed for radix sort
	public T[] CountingSort(T[] ListToSort, int place) {
		T maximun = ListToSort[0];
		int size = ListToSort.length;
		T[] result = (T[]) new Object[ListToSort.length + 1];
		int[] count = new int[Integer.parseInt((String) maximun) + 1];
		
		for (int i = 1; i < size; i++) {
			if (ListToSort[i].compareTo(maximun) >= 0)
		        maximun = ListToSort[i];
	    }
		for(int i = 0; i < (int)maximun; i++) 
			count[i] = 0;
		
		// calculate count of elements
		for(int i = 0; i < size; i++) 
			count[((int)ListToSort[i] / place) % 10]++;
		
		// calculate cumulative count
		for (int i = 1; i < 10; i++)
			count[i] += count[i - 1];
		
		// sorted order
		for (int i = size - 1; i >= 0; i--) {
			result[count[((int)ListToSort[i] / place) % 10] - 1] = ListToSort[i];
			count[((int)ListToSort[i] / place) % 10]--;
		}
		
		for (int i = 0; i < size; i++)
			ListToSort[i] = result[i];
		
		return ListToSort;
	}
	
	//radix sort (finally)
	public void AscendigSort(T[] ListToSort, int size) {
		T max = (getMaximunNumber(ListToSort));
		
		// using counting sort to do radix sort
		for(int place = 1; ((int)max) / place > 0; place *= 10) 
			CountingSort(ListToSort, place);
	}
}
