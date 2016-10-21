
public final class MergeSort {
	public static int[] mergeSort(int[] arr){
		if (arr.length < 2){
			return arr;
		}
		int lengthToCopy = (arr.length % 2 != 0) ? ((arr.length / 2) + 1) : (arr.length / 2);
		int[] first = new int[arr.length/2];
		int[] second = new int[arr.length - first.length];
		System.arraycopy(arr, 0, first, 0, first.length);
		System.arraycopy(arr, first.length, second, 0, lengthToCopy);
		
		
		mergeSort(first);
		mergeSort(second);
		
		merge(first,second,arr);
		return arr;
	}
	
	public static void merge(int[] first, int[] second, int[] result){
		int indexFirst = 0;
		int indexSecond = 0;
		int indexMerged = 0;
		
		while(indexFirst < first.length && indexSecond < second.length){
			if( first[indexFirst] < second[indexSecond]){
				result[indexMerged] = first[indexFirst];
				indexFirst++;
			}else{
				result[indexMerged] = second[indexSecond];
				indexSecond++;
			}
			indexMerged++;
		}
		System.arraycopy(first, indexFirst, result, indexMerged, first.length - indexFirst);
		System.arraycopy(second, indexSecond, result, indexMerged, second.length - indexSecond);
	}
}
