package project;

public class GnomeSort<T extends Comparable<T>> {
    private T[] listToSort;
    
    public GnomeSort(T[] unsortedList) {
        listToSort = unsortedList;
    }
    
    public void AscendingSort() {
        int i = 1;
        int j = 2;
        
        while (i < listToSort.length) {
            if (listToSort[i - 1].compareTo(listToSort[i]) <= 0) {
                i = j;
                j++;
            } else {
                T temp = listToSort[i - 1];
                listToSort[i - 1] = listToSort[i];
                listToSort[i] = temp;
                
                i--;
                if (i == 0) {
                    i = j;
                    j++;
                }
            }
        }
    }
}
