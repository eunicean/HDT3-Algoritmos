package project;

import java.util.Iterator;

public class BubbleSort <T extends Comparable<T>>{
	
	private T[] ListToSort;
	public BubbleSort(T[] UnsortedList) {
		
		ListToSort = UnsortedList;
	}
	
	public void AscendingSort() {
		
		for (int i = 0; i < ListToSort.length; i++) {
			for (int j = 0; j < ListToSort.length; j++) {
				if(ListToSort[i].compareTo(ListToSort[j]) < 0) {
					var aux = ListToSort[i];
					ListToSort[i] = ListToSort[j];
					ListToSort[j] = aux;
				}
				
			}
		}
		
	}

}
