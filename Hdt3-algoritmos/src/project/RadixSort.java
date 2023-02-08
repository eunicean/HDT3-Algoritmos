package project;

public class RadixSort <T extends Comparable<T>>{

	public RadixSort() {
	}
	
	//getting the max number in list
	public int getMaximunNumber(comparableInt[] listToFindMaxNumber) {
		comparableInt max = listToFindMaxNumber[0];
		for(int i = 1 ; i < listToFindMaxNumber.length ; i++) {
			if(listToFindMaxNumber[i].compareTo(max)>=0)
				max = listToFindMaxNumber[i];
		}
		return max.getIntNumber();
	}
	
	//counting sort needed for radix sort
	public comparableInt[] CountingSort(comparableInt[] listToSort, int place) {
		comparableInt maximun = listToSort[0];
		int size = listToSort.length;
		comparableInt[] result = new comparableInt[listToSort.length + 1];
		
		for (int i = 1; i < size; i++) {
			if (listToSort[i].compareTo(maximun) >= 0)
		        maximun = listToSort[i];
	    }
		
		int[] count = new int[maximun.getIntNumber() + 1];
		
		for(int i = 0; i <= maximun.getIntNumber(); i++) 
			count[i] = 0;
		
		// calculate count of elements
		for(int i = 0; i < size; i++) 
			count[(listToSort[i].getIntNumber() / place) % 10]++;
		
		// calculate cumulative count
		for (int i = 1; i < 10; i++)
			count[i] += count[i - 1];
		
		// sorted order
		for (int i = size - 1; i >= 0; i--) {
			result[count[(listToSort[i].getIntNumber() / place) % 10] - 1] = listToSort[i];
			count[(listToSort[i].getIntNumber() / place) % 10]--;
		}
		
		for (int i = 0; i < size; i++)
			listToSort[i] = result[i];
		
		return listToSort;
	}
	
	//radix sort (finally)
	public void AscendigSort(comparableInt[] ListToSort, int size) {
		int max = (getMaximunNumber(ListToSort));
		
		// using counting sort to do radix sort
		for(int place = 1; max / place > 0; place *= 10) 
			CountingSort(ListToSort, place);
	}
}
