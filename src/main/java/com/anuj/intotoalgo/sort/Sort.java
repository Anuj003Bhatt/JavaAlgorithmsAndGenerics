package com.anuj.intotoalgo.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.anuj.intotoalgo.maxmin.Find;

/**
 * 
 * A generic implementation of all types of sorting.
 * 
 * @author anujnarayanbhatt
 *
 * @param <T>
 */
abstract public class Sort<T> {

	public static final boolean ASCENDING = true;
	public static final boolean DESCENDING = false;

	/**
	 * 
	 * Wrapper for default order for sorting.
	 * 
	 * @param <T>
	 * @param A
	 * @param comparator
	 */
	public static <T> void selection(T[] A, Comparator<T> comparator) {
		selection(A, comparator, ASCENDING);
	}

	/**
	 * 
	 * Selection sort implementation.
	 * 
	 * @param <T>
	 * @param A
	 * @param comparator
	 * @param order      : Sort.ASCENDING / Sort.DESCENDING
	 */
	public static <T> void selection(T[] A, Comparator<T> comparator, Boolean ascending) {
		if (A == null || A.length <= 1) {
			// return if input has nothing
			return;
		}

		for (int i = 0; i < A.length; i++) {
			// find max/min depending on the order passed in and switch with 'i'
			int index = (ascending) ? Find.<T>min(A, i, A.length - 1, comparator)
					: Find.<T>max(A, i, A.length - 1, comparator);

			T temp = A[index];
			A[index] = A[i];
			A[i] = temp;
		}
	}

	/**
	 * 
	 * Wrapper for default order for sorting.
	 * 
	 * @param <T>
	 * @param A
	 * @param comparator
	 */
	public static <T> void bubble(T[] A, Comparator<T> comparator) {
		bubble(A, comparator, Sort.ASCENDING);

	}

	/**
	 * 
	 * Bubble sort implementation.
	 * 
	 * @param <T>
	 * @param A
	 * @param comparator
	 * @param ascending
	 */
	public static <T> void bubble(T[] A, Comparator<T> comparator, Boolean ascending) {
		if (A == null || A.length <= 1) {
			// return if input has nothing
			return;
		}

		for (int j = 0; j < A.length - 1; j++) {
			for (int i = 0; i < A.length - 1 - j; i++) {
				if ((ascending && comparator.compare(A[i + 1], A[i]) < 0)
						|| (!ascending && comparator.compare(A[i], A[i + 1]) < 0)) {
					T temp = A[i];
					A[i] = A[i + 1];
					A[i + 1] = temp;
				}
			}
		}

	}

	/**
	 * 
	 * Wrapper for default order for sorting.
	 * 
	 * @param <T>
	 * @param A
	 * @param comparator
	 */
	public static <T> void merge(T[] A, Comparator<T> comparator) {
		merge(A, 0, A.length - 1, comparator, Sort.ASCENDING);
	}

	/**
	 * 
	 * Wrapper for outside use.
	 * 
	 * @param <T>
	 * @param A
	 * @param comparator
	 */

	public static <T> void merge(T[] A, Comparator<T> comparator, Boolean ascending) {
		merge(A, 0, A.length - 1, comparator, ascending);
	}

	/**
	 * 
	 * Merge sort implementation.
	 * 
	 * @param <T>
	 * @param A
	 * @param low
	 * @param high
	 * @param comparator
	 * @param ascending
	 */
	public static <T> void merge(T[] A, int low, int high, Comparator<T> comparator, Boolean ascending) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		merge(A, low, mid, comparator, ascending);
		merge(A, mid + 1, high, comparator, ascending);
		combine(A, low, mid, high, comparator, ascending);
	}

	/**
	 * 
	 * Merging 2 sorted arrays.
	 * 
	 * @param <T>
	 * @param A
	 * @param low
	 * @param mid
	 * @param high
	 * @param comparator
	 * @param ascending
	 */
	private static <T> void combine(T[] A, int low, int mid, int high, Comparator<T> comparator, Boolean ascending) {
		List<T> list = new ArrayList<T>(high - low + 1);

		int iterator1 = low, iterator2 = mid + 1;

		while (iterator1 <= mid && iterator2 <= high) {
			if ((ascending && comparator.compare(A[iterator1], A[iterator2]) > 0)
					|| (!ascending && comparator.compare(A[iterator2], A[iterator1]) > 0)) {
				list.add(A[iterator2++]);
			} else {
				list.add(A[iterator1++]);
			}
		}

		while (iterator1 <= mid) {
			list.add(A[iterator1++]);
		}

		while (iterator2 <= high) {
			list.add(A[iterator2++]);
		}

		for (int i = low; i <= high; i++) {
			A[i] = list.get(i - low);
		}

	}
	
	/**
	 * 
	 * Wrapper with minimal parameters.
	 * 
	 * @param <T>
	 * @param A
	 * @param comparator
	 */
	public static <T> void quick(T[] A, Comparator<T> comparator) {
		quick(A, comparator, Sort.ASCENDING);

	}

	/**
	 *  
	 *  Wrapper for outside use.
	 *  
	 * @param <T>
	 * @param A
	 * @param comparator
	 * @param ascending
	 */
	public static <T> void quick(T[] A, Comparator<T> comparator, Boolean ascending) {
		quick(A,comparator, ascending, 0, A.length-1);

	}
	
	/**
	 * 
	 * Quick sort implementation. 
	 * 
	 * @param <T>
	 * @param A
	 * @param comparator
	 * @param ascending
	 * @param low
	 * @param high
	 */
	private static <T> void quick(T[] A, Comparator<T> comparator, Boolean ascending, int low, int high) {
		if(low >= high) {
			return;
		}
		int mid = partition(A,comparator, ascending,low,high);
		quick(A, comparator,ascending,low,mid-1);
		quick(A, comparator,ascending,mid+1,high);
		
	}
	
	/**
	 * 
	 * Quick sort partitioning logic
	 * 
	 * @param <T>
	 * @param A
	 * @param comparator
	 * @param ascending
	 * @param low
	 * @param high
	 * @return
	 */
	private static <T> int partition(T[] A, Comparator<T> comparator, Boolean ascending, int low, int high) {
		int pivot = low;
		
		while(low<=high) {
			if( (ascending && comparator.compare(A[pivot], A[low]) < 0 )
			 || (!ascending && comparator.compare(A[low], A[pivot]) < 0)
					) {
				T temp = A[high];
				A[high] = A[low];
				A[low] = temp;
				high--;
			}else {
				low++;
			}
		}
		T temp = A[pivot];
		A[pivot] = A[high];
		A[high] = temp;
		
		return high;
		
	}


}
