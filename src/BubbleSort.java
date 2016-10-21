
public final class BubbleSort {

	public static void bubbleSort(int[] arr){
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 1; j < arr.length - i;j++){
				if(arr[j - 1] > arr[j]){
					swap(arr, j - 1, j);
				}
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void bubbleSortAnotherWay(int[] arr){
		int n = arr.length;
		boolean swapped = true;
		while(swapped){
			swapped = false;
			for(int i = 1; i <= n - 1; i++){
				if(arr[i-1] > arr[i]){
					swap(arr, i - 1, i);
					swapped = true;
				}
			}
		}
	}
}
