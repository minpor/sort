package ru.minpor.algorithm.sort.utils;

import ru.minpor.algorithm.sort.method.InsertionSort;
import ru.minpor.algorithm.sort.method.SelectionSort;
import ru.minpor.algorithm.sort.method.ShellSort;
import ru.minpor.algorithm.sort.method.SortMethod;

public class SortUtils {

	public static void sorting(Comparable[] c, SortMethod s) {
		if (s == SortMethod.INSERTION) {
			new InsertionSort().sort(c);
		} else if (s == SortMethod.SELECTION) {
			new SelectionSort().sort(c);
		} else if(s == SortMethod.SHELL) {
			new ShellSort().sort(c);
		}
	}
}
