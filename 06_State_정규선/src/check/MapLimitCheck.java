package check;

public class MapLimitCheck {
	final int MAX_VALUE = 100;
	final int MIN_VALUE = -100;
	
	public int check(int value){
		if ((value > MIN_VALUE) && (value < MAX_VALUE))
			return value;
		else{
			if(value > 0) 	value = MAX_VALUE;
			else 			value = MIN_VALUE;
		}
			
		return value;
	}
	public int[] checkArray(int[] intArray){
		int[] tempIntArray = {0,0,0,0};
		tempIntArray=intArray;
		for(int i=0; i<4; i++){
			tempIntArray[i]=check(tempIntArray[i]);
		}
		return tempIntArray;
	}
}
