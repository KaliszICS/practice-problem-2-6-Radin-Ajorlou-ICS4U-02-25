public class PracticeProblem {

	public static void main(String args[]) {


	}








	public static int[] bubbleSort(double[] nums){
		boolean swapped = true;
		int swap = 0;
		int step = 0;
		for (int i = 0; i < nums.length - 1 && swapped; i++){
			swapped = false; 
			for (int j = 0; j < nums.length - i - 1; j++){
				step++;
				if (nums[j] > nums[j + 1]){
					double temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					swapped = true;
					swap += 3;
				}
			}
		}
		return new int[]{swap, step};
		
	}




	public static int[] selectionSort(double[] nums){
		int swap = 0;
		int step = 0;
		for (int i = 0; i < nums.length - 1; i++){
			int smallest = i;
			for (int j = i + 1; j < nums.length; j++){
				step++;
				if (nums[j] < nums[smallest]){
					smallest = j;
					swap++;
				}
			}
				double temp = nums[i];
				nums[i] = nums[smallest];
				nums[smallest] = temp;
				swap+=3;
		}
		return new int[]{swap, step};
	}







	public static int[] insertionSort(double[] nums){
		int swap = 0; 
		int step = 0;
		for (int i = 0; i < nums.length - 1; i++){
			double key = nums[i + 1];
			int index = i;
			while(index >= 0 && key < nums[index]){
				nums[index + 1] = nums[index];
				swap++;
				index--;
				step++;
			}
			nums[index + 1] = key;
			swap+=2;
		}
		return new int[]{swap, step};
	}




	public static String leastSwaps(double[] nums){
		int bubbleSwaps = bubbleSort(nums.clone())[0];
		int selectionSwaps = selectionSort(nums.clone())[0];
		int insertionSwaps = insertionSort(nums.clone())[0];
		if (bubbleSwaps < selectionSwaps && bubbleSwaps < insertionSwaps){
			return "Bubble";
		}
		else if (selectionSwaps < bubbleSwaps && selectionSwaps < insertionSwaps){
			return "Selection";
		}
		else if (insertionSwaps < bubbleSwaps && insertionSwaps < selectionSwaps){
			return "Insertion";
		}
		else {
			return "Bubble";
		}
	}






		public static String leastIterations(double[] nums){
			int bubbleSwaps = bubbleSort(nums.clone())[1];
			int selectionSwaps = selectionSort(nums.clone())[1];
			int insertionSwaps = insertionSort(nums.clone())[1];
			if (bubbleSwaps < selectionSwaps && bubbleSwaps < insertionSwaps){
				return "Bubble";
			}
			else if (selectionSwaps < bubbleSwaps && selectionSwaps < insertionSwaps){
				return "Selection";
			}
			else if (insertionSwaps < bubbleSwaps && insertionSwaps < selectionSwaps){
				return "Insertion";
			}
			else {
				if (bubbleSwaps == insertionSwaps || bubbleSwaps == selectionSwaps){
					return "Bubble";
				}
				else if (selectionSwaps == insertionSwaps){
					return "Insertion";
				}
				else{
					return "Selection";
				}
			}
	}
}




