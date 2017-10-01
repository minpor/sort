package ru.minpor.algorithm.sort.compare;

public class Compare {

	protected void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}


	@SuppressWarnings("unchecked")
	protected boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public boolean isSorted(Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			if (less(a[i], a[i - 1])) {
				return false;
			}
		}
		return true;
	}
}
