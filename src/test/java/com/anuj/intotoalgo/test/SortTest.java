package com.anuj.intotoalgo.test;

import static org.junit.Assert.*;

import java.util.Comparator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.anuj.intotoalgo.sort.Sort;

public class SortTest {
	private Integer[] arraySingle = null;

	private Integer[] arrayI = null;
	private Integer[] arrayI_Sorted = null;
	private Integer[] arrayI_Expected_Sort_ASC = null;
	private Integer[] arrayI_Expected_Sort_DESC = null;

	private Double[] arrayD = null;
	private Double[] arrayD_Sorted = null;
	private Double[] arrayD_Expected_Sort_ASC = null;
	private Double[] arrayD_Expected_Sort_DESC = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		this.arraySingle = new Integer[] { 1 };

		this.arrayI = new Integer[] { 1, 4, 3, 2 };
		this.arrayI_Sorted = new Integer[] { 1, 2, 3, 4 };
		this.arrayI_Expected_Sort_ASC = new Integer[] { 1, 2, 3, 4 };
		this.arrayI_Expected_Sort_DESC = new Integer[] { 4, 3, 2, 1 };

		this.arrayD = new Double[] { 1.1, 1.6, 1.2, 1.0 };
		this.arrayD_Sorted = new Double[] { 1.0, 1.1, 1.6, 1.2 };
		this.arrayD_Expected_Sort_ASC = new Double[] { 1.0, 1.1, 1.2, 1.6 };
		this.arrayD_Expected_Sort_DESC = new Double[] { 1.6, 1.2, 1.1, 1.0 };

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.arraySingle = this.arrayI = this.arrayI_Sorted = arrayI_Expected_Sort_ASC = arrayI_Expected_Sort_DESC = null;
		this.arrayD = this.arrayD_Sorted = arrayD_Expected_Sort_ASC = arrayD_Expected_Sort_DESC = null;

	}

	@Test
	public void integerSelectionSortTestSingle() {
		Sort.<Integer>selection(arraySingle, Comparator.naturalOrder(), Sort.ASCENDING);
	}

	@Test
	public void integerSelectionSortTestAscending() {
		Sort.<Integer>selection(arrayI, Comparator.naturalOrder(), Sort.ASCENDING);
		for (int i = 0; i < this.arrayI.length; i++) {
			assertEquals(this.arrayI[i], this.arrayI_Expected_Sort_ASC[i]);
		}

	}

	@Test
	public void integerSelectionSortTestDescending() {
		Sort.<Integer>selection(arrayI, Comparator.naturalOrder(), Sort.DESCENDING);
		for (int i = 0; i < this.arrayI.length; i++) {
			assertEquals(this.arrayI[i], this.arrayI_Expected_Sort_DESC[i]);
		}
	}

	@Test
	public void integerSelectionSortTestAscendingOfSortedInput() {
		Sort.<Integer>selection(arrayI_Sorted, Comparator.naturalOrder(), Sort.ASCENDING);
		for (int i = 0; i < this.arrayI_Sorted.length; i++) {
			assertEquals(this.arrayI_Sorted[i], this.arrayI_Expected_Sort_ASC[i]);
		}

	}

	@Test
	public void integerSelectionSortTestDescendingOfSorted() {
		Sort.<Integer>selection(arrayI_Sorted, Comparator.naturalOrder(), Sort.DESCENDING);
		for (int i = 0; i < this.arrayI_Sorted.length; i++) {
			assertEquals(this.arrayI_Sorted[i], this.arrayI_Expected_Sort_DESC[i]);
		}
	}

	@Test
	public void doubleSelectionSortTestAscending() {
		Sort.<Double>selection(arrayD, Comparator.naturalOrder(), Sort.ASCENDING);
		for (int i = 0; i < this.arrayD.length; i++) {
			assertEquals(this.arrayD[i], this.arrayD_Expected_Sort_ASC[i]);
		}

	}

	@Test
	public void doubleSelectionSortTestDescending() {
		Sort.<Double>selection(arrayD, Comparator.naturalOrder(), Sort.DESCENDING);
		for (int i = 0; i < this.arrayD.length; i++) {
			assertEquals(this.arrayD[i], this.arrayD_Expected_Sort_DESC[i]);
		}
	}

	@Test
	public void doubleSelectionSortTestAscendingOfSortedInput() {
		Sort.<Double>selection(arrayD_Sorted, Comparator.naturalOrder(), Sort.ASCENDING);
		for (int i = 0; i < this.arrayD_Sorted.length; i++) {
			assertEquals(this.arrayD_Sorted[i], this.arrayD_Expected_Sort_ASC[i]);
		}

	}

	@Test
	public void doubleSelectionSortTestDescendingOfSorted() {
		Sort.<Double>selection(arrayD_Sorted, Comparator.naturalOrder(), Sort.DESCENDING);
		for (int i = 0; i < this.arrayD_Sorted.length; i++) {
			assertEquals(this.arrayD_Sorted[i], this.arrayD_Expected_Sort_DESC[i]);
		}
	}

	@Test
	public void integerBubbleSortTestSingle() {
		Sort.<Integer>bubble(arraySingle, Comparator.naturalOrder(), Sort.ASCENDING);
	}

	@Test
	public void integerBubbleSortTestAscending() {
		Sort.<Integer>bubble(arrayI, Comparator.naturalOrder(), Sort.ASCENDING);
		for (int i = 0; i < this.arrayI.length; i++) {
			assertEquals(this.arrayI[i], this.arrayI_Expected_Sort_ASC[i]);
		}

	}

	@Test
	public void integerBubbleSortTestDescending() {
		Sort.<Integer>bubble(arrayI, Comparator.naturalOrder(), Sort.DESCENDING);
		for (int i = 0; i < this.arrayI.length; i++) {
			assertEquals(this.arrayI[i], this.arrayI_Expected_Sort_DESC[i]);
		}
	}

	@Test
	public void integerBubbleSortTestAscendingOfSortedInput() {
		Sort.<Integer>bubble(arrayI_Sorted, Comparator.naturalOrder(), Sort.ASCENDING);
		for (int i = 0; i < this.arrayI_Sorted.length; i++) {
			assertEquals(this.arrayI_Sorted[i], this.arrayI_Expected_Sort_ASC[i]);
		}

	}

	@Test
	public void integerBubbleSortTestDescendingOfSorted() {
		Sort.<Integer>bubble(arrayI_Sorted, Comparator.naturalOrder(), Sort.DESCENDING);
		for (int i = 0; i < this.arrayI_Sorted.length; i++) {
			assertEquals(this.arrayI_Sorted[i], this.arrayI_Expected_Sort_DESC[i]);
		}
	}

	@Test
	public void doubleBubbleSortTestAscending() {
		Sort.<Double>bubble(arrayD, Comparator.naturalOrder(), Sort.ASCENDING);
		for (int i = 0; i < this.arrayD.length; i++) {
			assertEquals(this.arrayD[i], this.arrayD_Expected_Sort_ASC[i]);
		}

	}

	@Test
	public void doubleBubbleSortTestDescending() {
		Sort.<Double>bubble(arrayD, Comparator.naturalOrder(), Sort.DESCENDING);
		for (int i = 0; i < this.arrayD.length; i++) {
			assertEquals(this.arrayD[i], this.arrayD_Expected_Sort_DESC[i]);
		}
	}

	@Test
	public void doubleBubbleSortTestAscendingOfSortedInput() {
		Sort.<Double>bubble(arrayD_Sorted, Comparator.naturalOrder(), Sort.ASCENDING);
		for (int i = 0; i < this.arrayD_Sorted.length; i++) {
			assertEquals(this.arrayD_Sorted[i], this.arrayD_Expected_Sort_ASC[i]);
		}

	}

	@Test
	public void doubleBubbleSortTestDescendingOfSorted() {
		Sort.<Double>bubble(arrayD_Sorted, Comparator.naturalOrder(), Sort.DESCENDING);
		for (int i = 0; i < this.arrayD_Sorted.length; i++) {
			assertEquals(this.arrayD_Sorted[i], this.arrayD_Expected_Sort_DESC[i]);
		}
	}

	// -------
	@Test
	public void integerMergeSortTestSingle() {
		Sort.<Integer>merge(arraySingle, Comparator.naturalOrder(), Sort.ASCENDING);
	}

	@Test
	public void integerMergeSortTestAscending() {
		Sort.<Integer>merge(arrayI, Comparator.naturalOrder(), Sort.ASCENDING);
		for (int i = 0; i < this.arrayI.length; i++) {
			assertEquals(this.arrayI[i], this.arrayI_Expected_Sort_ASC[i]);
		}

	}

	@Test
	public void integerMergeSortTestDescending() {
		Sort.<Integer>merge(arrayI, Comparator.naturalOrder(), Sort.DESCENDING);
		for (int i = 0; i < this.arrayI.length; i++) {
			assertEquals(this.arrayI[i], this.arrayI_Expected_Sort_DESC[i]);
		}
	}

	@Test
	public void integerMergeSortTestAscendingOfSortedInput() {
		Sort.<Integer>merge(arrayI_Sorted, Comparator.naturalOrder(), Sort.ASCENDING);
		for (int i = 0; i < this.arrayI_Sorted.length; i++) {
			assertEquals(this.arrayI_Sorted[i], this.arrayI_Expected_Sort_ASC[i]);
		}

	}

	@Test
	public void integerMergeSortTestDescendingOfSorted() {
		Sort.<Integer>merge(arrayI_Sorted, Comparator.naturalOrder(), Sort.DESCENDING);
		for (int i = 0; i < this.arrayI_Sorted.length; i++) {
			assertEquals(this.arrayI_Sorted[i], this.arrayI_Expected_Sort_DESC[i]);
		}
	}

	@Test
	public void doubleMergeSortTestAscending() {
		Sort.<Double>merge(arrayD, Comparator.naturalOrder(), Sort.ASCENDING);
		for (int i = 0; i < this.arrayD.length; i++) {
			assertEquals(this.arrayD[i], this.arrayD_Expected_Sort_ASC[i]);
		}

	}

	@Test
	public void doubleMergeSortTestDescending() {
		Sort.<Double>merge(arrayD, Comparator.naturalOrder(), Sort.DESCENDING);
		for (int i = 0; i < this.arrayD.length; i++) {
			assertEquals(this.arrayD[i], this.arrayD_Expected_Sort_DESC[i]);
		}
	}

	@Test
	public void doubleMergeSortTestAscendingOfSortedInput() {
		Sort.<Double>merge(arrayD_Sorted, Comparator.naturalOrder(), Sort.ASCENDING);
		for (int i = 0; i < this.arrayD_Sorted.length; i++) {
			assertEquals(this.arrayD_Sorted[i], this.arrayD_Expected_Sort_ASC[i]);
		}

	}

	@Test
	public void doubleMergeSortTestDescendingOfSorted() {
		Sort.<Double>merge(arrayD_Sorted, Comparator.naturalOrder(), Sort.DESCENDING);
		for (int i = 0; i < this.arrayD_Sorted.length; i++) {
			assertEquals(this.arrayD_Sorted[i], this.arrayD_Expected_Sort_DESC[i]);
		}
	}

	@Test
	public void integarQuickSortTest() {
		Integer[] forQuick = new Integer[] { 24, 9, 29, 14, 19, 27 };
		Integer[] forQuickSorted = new Integer[] { 9, 14, 19, 24, 27, 29 };
		
		Sort.quick(forQuick, Comparator.naturalOrder(), Sort.DESCENDING);
		for(int i=0;i<forQuick.length;i++) {
			assertEquals(forQuick[i],forQuickSorted[forQuickSorted.length-i-1]);
		}
		
		Sort.quick(forQuick, Comparator.naturalOrder(), Sort.ASCENDING);
		for(int i=0;i<forQuick.length;i++) {
			assertEquals(forQuick[i],forQuickSorted[i]);
		}
		
		Sort.quick(forQuick, Comparator.naturalOrder(), Sort.ASCENDING);
		for(int i=0;i<forQuick.length;i++) {
			assertEquals(forQuick[i],forQuickSorted[i]);
		}
		
	}

}
