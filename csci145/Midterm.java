
public class Midterm {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,6,7,7,7,7,7,7};
		longestSequence(arr);

	}
	
	public static void longestSequence(int arr[]) {
		int num = arr[0];
		int tmp = arr [0];
		int numC = 1;
		int tmpC = 1;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == tmp) {
				tmpC++;
			}
			else {
				if(tmpC > numC) {
					num = tmp;
					numC = tmpC;
				}
				tmp = arr[i];
				tmpC = 1;
			}
		}
		if(tmpC > numC) {
			num = tmp;
			numC = tmpC;
		}
		
		System.out.print(num);
	}

}