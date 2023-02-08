package project;

public class QuickSort <T extends Comparable<T>>{
	
	public QuickSort() {
	}
	
	public T[] Ascending(T[] ListToSort, int start, int end) {
		if (start >= end) return ListToSort; 
		int pizq = start + 1, pder = ListToSort.length - 1;
		var pivot = ListToSort[start];
		
		while(pizq <= pder) {
			while(pizq<=end && ListToSort[pizq].compareTo(pivot)<0) {
				pizq = pizq + 1;
			}
			while(pder>start && ListToSort[pder].compareTo(pivot)>=0) {
				pder = pder - 1;
			}
			if(pizq < pder) {
				var aux = ListToSort[pizq];
				ListToSort[pizq] = ListToSort[pder];
				ListToSort[pder] = aux;
			}
		}

		if(pder > start) {
			var aux = ListToSort[start];
			ListToSort[start] = ListToSort[pder];
			ListToSort[pder] = aux;
		}
		
		Ascending(ListToSort, 0, pder-1);
		Ascending(ListToSort, pder+1, end);
		
		return ListToSort;
	}

}
