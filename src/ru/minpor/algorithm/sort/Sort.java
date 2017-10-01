package ru.minpor.algorithm.sort;

import ru.minpor.algorithm.sort.method.Choose;
import ru.minpor.algorithm.sort.method.Insert;
import ru.minpor.algorithm.sort.method.Shell;

public class Sort {
	// count of elements
	private final static Integer ELEMENT_COUNT = 1000;

	public static void main(String[] args) {
		Integer[] a = new Integer[ELEMENT_COUNT];
		System.out.println("without sorting");
		for (int i = 0; i < ELEMENT_COUNT; i++) {
			a[i] = (int) (Math.random() * ELEMENT_COUNT);
		}

		print(a);

		// алгоритмы сортировок
		System.out.println("Sort method: Choose");
		sort(new Choose(), a, false);

		System.out.println("Sort method: Insert");
		sort(new Insert(), a, false);

		System.out.println("Sort method: Shell");
		sort(new Shell(), a, false);
	}

	private static void sort(Compare c, Comparable[] a, boolean show) {
		// make clone for clean tests
		Comparable[] b = a.clone();
		long time = System.currentTimeMillis();
		c.executeSort(b);
		System.out.print(String.format(" time: %d", System.currentTimeMillis() - time));
		System.out.println();
		if (show) {
			print(b);
		}
	}

	private static void print(Comparable[] a) {
		for (Comparable element : a) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
