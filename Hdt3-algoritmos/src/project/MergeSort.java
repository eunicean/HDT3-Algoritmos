package project;

public class MergeSort<T extends Comparable<T>> {
    private T[] listToSort;
    
    public MergeSort(T[] unsortedList) {
        listToSort = unsortedList;
    }
    
    public void AscendingSort() {
        mergeSort(listToSort, 0, listToSort.length - 1);
    }
    
    private void mergeSort(T[] list, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(list, left, mid);
            mergeSort(list, mid + 1, right);
            merge(list, left, mid, right);
        }
    }
    
    private void merge(T[] list, int left, int mid, int right) {
    	
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        T[] leftArray = (T[]) new Comparable[n1];
        T[] rightArray = (T[]) new Comparable[n2];
        
        for (int i = 0; i < n1; i++) {
            leftArray[i] = list[left + i];
        }
        
        for (int j = 0; j < n2; j++) {
            rightArray[j] = list[mid + j + 1];
        }
        
        int i = 0;
        int j = 0;
        int k = left;
        
        while (i < n1 && j < n2) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                list[k] = leftArray[i];
                i++;
            } else {
                list[k] = rightArray[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            list[k] = leftArray[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            list[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
