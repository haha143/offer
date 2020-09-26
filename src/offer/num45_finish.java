package offer;

import java.util.Arrays;

public class num45_finish {
	public boolean isContinuous(int [] numbers) {
		Arrays.sort(numbers);
		if(numbers.length==0)
			return false;
		if(numbers[3]==0)
			return true;
		if(numbers[2]==0&&numbers[4]-numbers[3]<=4&&numbers[4]!=numbers[3])
			return true;
		if(numbers[1]==0&&numbers[4]-numbers[2]<=4&&numbers[4]>numbers[3]&&numbers[3]>numbers[2])
			return true;
		if(numbers[0]==0&&numbers[4]-numbers[1]<=4&&numbers[4]>numbers[3]&&numbers[3]>numbers[2]&&numbers[2]>numbers[1])
			return true;
		if(numbers[4]-numbers[0]==4)
			return true;
		return false;
    }
}
