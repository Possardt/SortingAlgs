
public final class Heapsort {
	private static int total;
	
	private static void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	private static void heapify(int[] arr, int i){
		int lft = i * 2;
		int rgt = lft + 1;
		int grt = i;
		
		if(lft <= total && (arr[lft] - arr[grt]) > 0)
			grt = lft;
		if(rgt <= total && (arr[rgt] - arr[grt]) > 0)
			grt = rgt;
		if(grt != i){
			swap(arr, i, grt);
			heapify(arr,grt);
		}
	}
	
	public static void sort(int[] arr){
		total = arr.length - 1;
		for(int i = total / 2; i >=0;i-- )
			heapify(arr, i);
		for(int i = total; i > 0; i--){
			swap(arr, 0, i);
			total--;
			heapify(arr,0);
		}
	}
	
}
