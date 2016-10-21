
public final class Stoogesort {
	public static void sort(int[] arr, int i, int j){
		if(arr[j] < arr[i])
			swap(arr,i,j);
		if((j - i + 1) > 2){
			int t = (j - i + 1) / 3;
			sort(arr, i, j - t);
			sort(arr, i + t, j);
			sort(arr, i , j - t);
		}
	}
	private static void swap(int[] arr, int i, int j){
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
