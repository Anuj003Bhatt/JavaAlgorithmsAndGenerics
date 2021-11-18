package com.anuj.intotoalgo.maxmin;

import java.util.Comparator;

/**
 * 
 * A generic class implementation to find max/min from a given array
 * 
 * @author anujnarayanbhatt
 *
 * @param <T>
 */
abstract public class Find<T> {

	
	/**
	 *   Function to find maximum.
	 * @param <T>
	 * @param input
	 * @param comparator
	 * @return
	 */
	public static <T> Integer max(T[] input,Comparator<T> comparator) {
		return max(input,0,input.length-1,comparator);

	}
	
	/**
	 *   Function to find maximum.
	 * @param <T>
	 * @param input
	 * @param comparator
	 * @return
	 */
	public static <T> Integer max(T[] input, int low, int high,Comparator<T> comparator) {

		if (input == null || input.length < 1 || high < 1) {
			return null;
		}

		int max = low;
		for (int i = low+1; i <= high; i++) {
			if (comparator.compare(input[max], input[i]) < 0) {
				max = i;
			}
		}
		return max;
	}
	
	/**
	 *   Function to find maximum.
	 * @param <T>
	 * @param input
	 * @param comparator
	 * @return
	 */
	public static <T> Integer min(T[] input,Comparator<T> comparator) {
		return min(input,0,input.length-1,comparator);

	}
	
	/**
	 *   Function to find maximum.
	 * @param <T>
	 * @param input
	 * @param comparator
	 * @return
	 */
	public static <T> Integer min(T[] input, int low, int high, Comparator<T> comparator) {

		if (input == null || input.length < 1 || high < 1) {
			return null;
		}

		Integer min = low;
		for (int i = low+1; i <= high; i++) {
			if (comparator.compare(input[i], input[min]) < 0) {
				min = i;
			}
		}
		return min;
	}

}
