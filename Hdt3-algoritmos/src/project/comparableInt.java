package project;

public class comparableInt implements Comparable<comparableInt>{

	private int IntNumber;
	
	public comparableInt(int value) {
		IntNumber = value;
	}
	
	@Override
	public int compareTo(comparableInt val) {
		
		if (IntNumber > val.IntNumber) {
			return 1;
		} 
		else if(IntNumber < val.IntNumber){
			return -1;
		}
		else {
			return 0;
		}
				
	}

	public int getIntNumber() {
		return IntNumber;
	}

	public void setIntNumber(int intNumber) {
		IntNumber = intNumber;
	}
	
	

}
