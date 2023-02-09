package project;

	import static org.junit.Assert.assertArrayEquals;
	import static org.junit.Assert.assertEquals;

	import org.junit.Test;

	public class testclass {


		@Test
		public void tryingBubbleSort() {
			comparableInt[] ListOfInts = new comparableInt[]{	new comparableInt(25),
																new comparableInt(798),
																new comparableInt(30),
																new comparableInt(2),
																new comparableInt(65),
																new comparableInt(1023),
																new comparableInt(96),
																new comparableInt(3),
																new comparableInt(1),
																new comparableInt(454)};
			
			BubbleSort BubbleSort = new BubbleSort(ListOfInts);
			BubbleSort.AscendingSort();
			
			comparableInt[] ExpectedResult = new comparableInt[]{	new comparableInt(1),
																	new comparableInt(2),
																	new comparableInt(3),
																	new comparableInt(25),
																	new comparableInt(30),
																	new comparableInt(65),
																	new comparableInt(96),
																	new comparableInt(454),
																	new comparableInt(798),
																	new comparableInt(1023)};
			
			for(int i = 0 ; i < 10 ; i++) {
				assertEquals(ExpectedResult[i].getIntNumber(), ListOfInts[i].getIntNumber());
			}
		}
		
		@Test
		public void tryingGnomeSort() {
			comparableInt[] ListOfInts = new comparableInt[]{	new comparableInt(25),
																new comparableInt(798),
																new comparableInt(30),
																new comparableInt(2),
																new comparableInt(65),
																new comparableInt(1023),
																new comparableInt(96),
																new comparableInt(3),
																new comparableInt(1),
																new comparableInt(454)};
			
			GnomeSort GnomeSort = new GnomeSort(ListOfInts);
			GnomeSort.AscendingSort();
			
			comparableInt[] ExpectedResult = new comparableInt[]{	new comparableInt(1),
																	new comparableInt(2),
																	new comparableInt(3),
																	new comparableInt(25),
																	new comparableInt(30),
																	new comparableInt(65),
																	new comparableInt(96),
																	new comparableInt(454),
																	new comparableInt(798),
																	new comparableInt(1023)};
			
			for(int i = 0 ; i < 10 ; i++) {
				assertEquals(ExpectedResult[i].getIntNumber(), ListOfInts[i].getIntNumber());
			}
		}
		@Test
		public void tryingMergeSort() {
			comparableInt[] ListOfInts = new comparableInt[]{	new comparableInt(25),
																new comparableInt(798),
																new comparableInt(30),
																new comparableInt(2),
																new comparableInt(65),
																new comparableInt(1023),
																new comparableInt(96),
																new comparableInt(3),
																new comparableInt(1),
																new comparableInt(454)};
			
			MergeSort MergeSort = new MergeSort(ListOfInts);
			MergeSort.AscendingSort();
			
			comparableInt[] ExpectedResult = new comparableInt[]{	new comparableInt(1),
																	new comparableInt(2),
																	new comparableInt(3),
																	new comparableInt(25),
																	new comparableInt(30),
																	new comparableInt(65),
																	new comparableInt(96),
																	new comparableInt(454),
																	new comparableInt(798),
																	new comparableInt(1023)};
			
			for(int i = 0 ; i < 10 ; i++) {
				assertEquals(ExpectedResult[i].getIntNumber(), ListOfInts[i].getIntNumber());
			}
		}
		
		@Test
		public void tryingQuickSort() {
			comparableInt[] ListOfInts = new comparableInt[]{	new comparableInt(25),
																new comparableInt(798),
																new comparableInt(30),
																new comparableInt(2),
																new comparableInt(65),
																new comparableInt(1023),
																new comparableInt(96),
																new comparableInt(3),
																new comparableInt(1),
																new comparableInt(454)};
			
			QuickSort myQuickSort = new QuickSort();
			
			comparableInt[] ExpectedResult = (comparableInt[]) myQuickSort.Ascending(ListOfInts, 0, ListOfInts.length-1);
			
			for(int i = 0 ; i < 10 ; i++) {
				assertEquals(ExpectedResult[i].getIntNumber(), ListOfInts[i].getIntNumber());
			}
		}
		
		@Test
		public void tryingRadizSort() {
			comparableInt[] ListOfInts = new comparableInt[]{	new comparableInt(25),
																new comparableInt(798),
																new comparableInt(30),
																new comparableInt(2),
																new comparableInt(65),
																new comparableInt(1023),
																new comparableInt(96),
																new comparableInt(3),
																new comparableInt(1),
																new comparableInt(454)};
			
			RadixSort RadixSort = new RadixSort();
			RadixSort.AscendigSort(ListOfInts, ListOfInts.length);
			
			comparableInt[] ExpectedResult = new comparableInt[]{	new comparableInt(1),
																	new comparableInt(2),
																	new comparableInt(3),
																	new comparableInt(25),
																	new comparableInt(30),
																	new comparableInt(65),
																	new comparableInt(96),
																	new comparableInt(454),
																	new comparableInt(798),
																	new comparableInt(1023)};
			
			for(int i = 0 ; i < 10 ; i++) {
				assertEquals(ExpectedResult[i].getIntNumber(), ListOfInts[i].getIntNumber());
			}
		}
	
}
