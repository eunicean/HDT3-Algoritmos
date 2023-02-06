package project;

public class comparableInt implements Comparable<comparableInt>{

	private int IntNumber;
	
	public comparableInt(int value) {
		setIntNumber(value);
	}
	
	@Override
	public int compareTo(comparableInt val) {
		
		if (getIntNumber() > val.getIntNumber()) {
			return 1;
		} 
		else if(getIntNumber() > val.getIntNumber()){
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
