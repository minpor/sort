package ru.minpor.algorithm.sort;

public abstract class Compare implements CompareImpl, SortImpl {

	@Override
	public void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	@Override
	public Comparable[] executeSort(Comparable[] a) {
		Comparable[] comparable = sort(a);
		assert isSorted(a);
		return comparable;
	}

	@Override
	@SuppressWarnings("unchecked")
	public boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	private boolean isSorted(Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			if (less(a[i], a[i - 1])) {
				return false;
			}
		}
		return true;
	}

}
