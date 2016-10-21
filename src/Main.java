import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		UnsortedArray unsortedArray = new UnsortedArray();
		int[] arr = unsortedArray.getUnsortedIntArray(10);
		int[] arr2 = unsortedArray.getUnsortedUniqueIntArray(10);
		int[] arr3 = unsortedArray.getUnsortedUniqueIntArray(100);
		long startTime, endTime;
		int notTheFastest;
		Map<Integer, String> timesMap = new HashMap<Integer, String>();
		
		
		System.out.println("BOGOsort: ");
		printArray(arr);
		startTime = System.nanoTime();
		BogoSort.bogo(arr);
		endTime = System.nanoTime();
		printArray(arr);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "BOGO");
		notTheFastest = (int)(endTime - startTime);
		
		System.out.println("Mergesort: ");
		arr = unsortedArray.getUnsortedIntArray(10);
		printArray(arr);
		startTime = System.nanoTime();
		MergeSort.mergeSort(arr);
		endTime = System.nanoTime();
		printArray(arr);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "Mergesort");
		
		System.out.println("Bubblesort: ");
		arr = unsortedArray.getUnsortedIntArray(10);
		printArray(arr);
		startTime = System.nanoTime();
		BubbleSort.bubbleSort(arr);
		endTime = System.nanoTime();
		printArray(arr);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "Bubblesort");
		
		System.out.println("Bubblesort(another way): ");
		arr = unsortedArray.getUnsortedIntArray(10);
		printArray(arr);
		startTime = System.nanoTime();
		BubbleSort.bubbleSortAnotherWay(arr);
		endTime = System.nanoTime();
		printArray(arr);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "Bubblesort(another way)");

		System.out.println("Quicksort:");
		arr = unsortedArray.getUnsortedIntArray(10);
		printArray(arr);
		startTime = System.nanoTime();
		QuickSort.quickSort(arr, 0, 9);
		endTime = System.nanoTime();
		printArray(arr);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "Quicksort");
		
		System.out.println("Heapsort: ");
		arr = unsortedArray.getUnsortedIntArray(10);
		printArray(arr);
		startTime = System.nanoTime();
		Heapsort.sort(arr);
		endTime = System.nanoTime();
		printArray(arr);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "Heapsort");
		
		System.out.println("Stoogesort: ");
		arr = unsortedArray.getUnsortedIntArray(10);
		printArray(arr);
		startTime = System.nanoTime();
		Stoogesort.sort(arr, 0, arr.length - 1);
		endTime = System.nanoTime();
		printArray(arr);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "Stoogesort");
		
		int minTime = getMinTime(timesMap.keySet(), notTheFastest);
		System.out.println("Fastest method for unsorted 10 element array with repeats: " + timesMap.get(minTime));
		timesMap.clear();
		
		System.out.println("\nNow with an array with distinct elements:");
		
		System.out.println("BOGOsort: ");
		printArray(arr2);
		startTime = System.nanoTime();
		BogoSort.bogo(arr2);
		endTime = System.nanoTime();
		printArray(arr2);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "BOGO");
		notTheFastest = (int)(endTime - startTime);
		
		
		System.out.println("Mergesort: ");
		arr2 = unsortedArray.getUnsortedUniqueIntArray(10);
		printArray(arr2);
		startTime = System.nanoTime();
		MergeSort.mergeSort(arr2);
		endTime = System.nanoTime();
		printArray(arr2);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "Mergesort");
		
		System.out.println("Bubblesort: ");
		arr2 = unsortedArray.getUnsortedUniqueIntArray(10);
		printArray(arr2);
		startTime = System.nanoTime();
		BubbleSort.bubbleSort(arr2);
		endTime = System.nanoTime();
		printArray(arr2);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "Bubblesort");
		
		System.out.println("Bubblesort(another way): ");
		arr2 = unsortedArray.getUnsortedUniqueIntArray(10);
		printArray(arr2);
		startTime = System.nanoTime();
		BubbleSort.bubbleSortAnotherWay(arr2);
		endTime = System.nanoTime();
		printArray(arr2);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "Bubblesort(another way)");

		System.out.println("Quicksort:");
		arr2 = unsortedArray.getUnsortedUniqueIntArray(10);
		printArray(arr2);
		startTime = System.nanoTime();
		QuickSort.quickSort(arr2, 0, 9);
		endTime = System.nanoTime();
		printArray(arr2);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "Quicksort");
		
		System.out.println("Heapsort: ");
		arr2 = unsortedArray.getUnsortedUniqueIntArray(10);
		printArray(arr2);
		startTime = System.nanoTime();
		Heapsort.sort(arr2);
		endTime = System.nanoTime();
		printArray(arr2);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "Heapsort");
		
		System.out.println("Stoogesort: ");
		arr2 = unsortedArray.getUnsortedUniqueIntArray(10);
		printArray(arr2);
		startTime = System.nanoTime();
		Stoogesort.sort(arr2, 0, arr.length - 1);
		endTime = System.nanoTime();
		printArray(arr2);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "Stoogesort");

		
		minTime = getMinTime(timesMap.keySet(), notTheFastest);
		System.out.println("Fastest method for unsorted 10 element array with distinct elements: " + timesMap.get(minTime));
		
		timesMap.clear();
		System.out.println("\nNow with an array with distinct elements with 100 elements!:");
		
		System.out.println("BOGOsort: ");
		System.out.println("\tJust kidding, this would take 5ever");
		/*
		printArray(arr3);
		startTime = System.nanoTime();
		BogoSort.bogo(arr3);
		endTime = System.nanoTime();
		printArray(arr3);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "BOGO");
		notTheFastest = (int)(endTime - startTime);
		*/
		
		System.out.println("Mergesort: ");
		arr3 = unsortedArray.getUnsortedUniqueIntArray(100);
		printArray(arr3);
		startTime = System.nanoTime();
		MergeSort.mergeSort(arr3);
		endTime = System.nanoTime();
		printArray(arr3);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "Mergesort");
		
		System.out.println("Bubblesort: ");
		arr3 = unsortedArray.getUnsortedUniqueIntArray(100);
		printArray(arr3);
		startTime = System.nanoTime();
		BubbleSort.bubbleSort(arr3);
		endTime = System.nanoTime();
		printArray(arr3);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "Bubblesort");
		
		System.out.println("Bubblesort(another way): ");
		arr3 = unsortedArray.getUnsortedUniqueIntArray(100);
		printArray(arr3);
		startTime = System.nanoTime();
		BubbleSort.bubbleSortAnotherWay(arr3);
		endTime = System.nanoTime();
		printArray(arr3);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "Bubblesort(another way)");

		System.out.println("Quicksort:");
		arr3 = unsortedArray.getUnsortedUniqueIntArray(100);
		printArray(arr3);
		startTime = System.nanoTime();
		QuickSort.quickSort(arr3, 0, 99);
		endTime = System.nanoTime();
		printArray(arr3);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "Quicksort");
		
		System.out.println("Heapsort: ");
		arr3 = unsortedArray.getUnsortedUniqueIntArray(100);
		printArray(arr3);
		startTime = System.nanoTime();
		Heapsort.sort(arr3);
		endTime = System.nanoTime();
		printArray(arr3);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "Heapsort");
		
		System.out.println("Stoogesort: ");
		arr3 = unsortedArray.getUnsortedUniqueIntArray(100);
		printArray(arr3);
		startTime = System.nanoTime();
		Stoogesort.sort(arr3, 0, arr3.length - 1);
		endTime = System.nanoTime();
		printArray(arr3);
		printSortMethodDuration(startTime, endTime);
		timesMap.put((int) (endTime - startTime), "Stoogesort");

		
		minTime = getMinTime(timesMap.keySet(), notTheFastest);
		System.out.println("Fastest method for unsorted 100 element array with distinct elements: " + timesMap.get(minTime));
		
		
	}
	
	private static void printArray(int[] arr){
		System.out.println("\t" + java.util.Arrays.toString(arr));	
	}
	private static void printSortMethodDuration(long startTime, long endTime){
		System.out.println("\tThat took " + (endTime - startTime) + " nanoseconds.\n");
	}
	private static Integer getMinTime(Set<Integer> arr, int notTheFastest){
		Integer min = notTheFastest;
		for(Integer i : arr){
			if(i < min)
				min = i;
		}
		return min;
	}

}
