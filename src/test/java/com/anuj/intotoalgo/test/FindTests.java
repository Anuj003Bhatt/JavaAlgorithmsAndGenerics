/**
 * 
 */
package com.anuj.intotoalgo.test;

import static org.junit.Assert.*; 

import java.util.Comparator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.anuj.intotoalgo.maxmin.Find;

public class FindTests {

	private Integer[] arrayI = null;

	private Double[] arrayD = null;

	private Character[] arrayC = null;
	private Character[] arrayC_Sorted = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.arrayI = new Integer[] { 1, 4, 3, 2 };

		this.arrayD = new Double[] { 1.1, 1.6, 1.2, 1.0 };

		this.arrayC = new Character[] { 'A', '1', 'g', '!', ' ', 'V', 's', 'B' };
		this.arrayC_Sorted = new Character[] { 'A', 'B', 'c', 'd' };
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.arrayI = null;
		this.arrayD = null;
		this.arrayC = this.arrayC_Sorted = null;

	}

	@Test
	public void integerMaxTest() {
		int maxIntIndex = Find.<Integer>max(arrayI, Comparator.naturalOrder());
		assertEquals(maxIntIndex, 1);
	}

	@Test
	public void integerMinTest() {
		int minIntIndex = Find.<Integer>min(arrayI, Comparator.naturalOrder());
		assertEquals(minIntIndex, 0);
	}

	@Test
	public void doubleMaxTest() {
		int maxDoubleIndex = Find.<Double>max(arrayD, Comparator.naturalOrder());
		assertEquals(maxDoubleIndex, 1);
	}

	@Test
	public void doubleMinTest() {
		int minDoubleIndex = Find.<Double>min(arrayD, Comparator.naturalOrder());
		assertEquals(minDoubleIndex, 3);
	}

	@Test
	public void charMinTest() {
		int minCharIndex = Find.<Character>min(arrayC, Comparator.naturalOrder());
		assertEquals(minCharIndex, 4);
	}

	@Test
	public void charMaxTest() {
		int maxCharIndex = Find.<Character>max(arrayC, Comparator.naturalOrder());
		assertEquals(maxCharIndex, 6);
	}

	@Test
	public void charMinTestOfSorted() {
		int minCharIndex = Find.<Character>min(arrayC_Sorted, Comparator.naturalOrder());
		assertEquals(minCharIndex, 0);
	}

	@Test
	public void charMaxTestOfSorted() {
		int maxCharIndex = Find.<Character>max(arrayC_Sorted, Comparator.naturalOrder());
		assertEquals(maxCharIndex, this.arrayC_Sorted.length - 1);
	}

}
