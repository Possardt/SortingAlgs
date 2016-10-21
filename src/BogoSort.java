
public final class BogoSort {

	public static void bogo(int[] arr){
		int shuffle = 1;
		for(;!isSorted(arr);shuffle++){
			shuffle(arr);
		}
		System.out.println("\tThis took " + shuffle + " shuffles.");
	}
	
	public static void shuffle(int[] arr){
		int i = arr.length - 1;
		while(i>0){
			swap(arr, i--, (int)(Math.random() * i));
		}
	}
	
	public static boolean isSorted(int[] arr){
		for(int i = 1; i<arr.length;i++){
			if(arr[i] < arr[i - 1])
				return false;
		}
		return true;
	}
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
