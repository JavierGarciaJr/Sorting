/**
 * this class does all of the sorting and organization
 * @author Javier Garcia
 *
 */
public class SortingHelper {

	private boolean sort;
	private String[] inputs;
	private int index;
/**
 * this method initializes the SmartStringList
 * @param capacity
 */
	public SortingHelper(int capacity) {
		inputs = new String[capacity];
		sort = true;
		index = 0;
	}
/**
 * this method add new Strings to the list
 * @param s
 */
	public void add(String s) {
		if (index < inputs.length) {
			inputs[index] = s;
			if (index >= 1 && inputs[index].compareToIgnoreCase(inputs[index - 1]) < 0) {
				sort = false;
			}
			index++;
		} 
	}
/**
 * returns the String at index i
 * @param i
 * @return
 */
	public String get(int i) {
		if (index < i) {
			return "";
		} else {
			return inputs[i];
		}
	}
/**
 * returns the index of the given value
 * @param s
 * @return
 */
	public int indexOf(String s) {

		int ret = -1;
		if (sort == true) {
			System.out.println("Binary search");
			int big = index;
			int small = 0;
			while (big >= small) {
				int med = (small + big) / 2;
				int res = s.compareToIgnoreCase(inputs[med]);
				if (res == 0) {
					return med;
				} else if (0 > res) {

					big = med;
				} else {

					small = med;
				}
			}
			return ret;
		} else {
			System.out.println("Linear search");
			for (int i = 0; i <= index - 1; i++) {
				if (s.equalsIgnoreCase(inputs[i]) == true) {
					ret = i;
				}
			}

			sort();
			sort = true;
			return ret;
		}
	}
 /**
  * it puts the list in a sorted order if it isn't already sorted
  */
	public void sort() {

		if (sort == true) {
			System.out.println("list is already sorted");
			return;
		}

		System.out.println("sort function is executed");
		for (int i = 0; i < index - 1; i++) {
			int min = i;

			for (int j = i + 1; j < index; j++) {
				if (inputs[j].compareToIgnoreCase(inputs[min]) < 0) {
					min = j;
				}
			}

			String change = inputs[min];
			inputs[min] = inputs[i];
			inputs[i] = change;
		}

		sort = true;
	}
}