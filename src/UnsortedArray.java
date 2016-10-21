
public class UnsortedArray {

	public int[] getUnsortedIntArray(int length){
		int[] arr = new int[length];
		for(int i = 0; i < arr.length - 1; i++){
			arr[i] = (int)(Math.random()*100) % arr.length;
		}
		return arr;
	}
	
	public int[] getUnsortedUniqueIntArray(int length){
		int[] arr = new int[length];
		for(int i = 0; i < length; i++)
			arr[i] = i + 1;
		for(int i = 0; i < length; i++)
			swap(arr, i, (int)((Math.random() * 100) % (arr.length - 1)));
		if(isSorted(arr))
			return getUnsortedUniqueIntArray(length);
		return arr;
	}
	
	private boolean isSorted(int[] arr){
		for(int i = 1; i < arr.length; i++)
			if(arr[i] > arr[i - 1]){ return false;}
		return true;
	}
	
	private void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
