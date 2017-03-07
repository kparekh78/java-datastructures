package home.datastructures;

import java.util.Arrays;

public class MyArrayList<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyArrayList<String> stringArrayList = new MyArrayList<>(3);

		stringArrayList.add("one");
		stringArrayList.add("two");
		stringArrayList.add("three");
		stringArrayList.add("four");
		stringArrayList.add("five");

		System.out.println(stringArrayList.getSize());
		System.out.println(stringArrayList.getLength());
		System.out.println(stringArrayList.get(1));
		

		stringArrayList.remove("two");

		System.out.println(stringArrayList.getSize());
		System.out.println(stringArrayList.getLength());
		System.out.println(stringArrayList.get(1));

	}

	private static final int defaultCap = 10;

	private int capacity = 0;

	private Object[] localArray;

	private int size;

	public int getSize() {
		return size;
	}

	public int getLength() {
		return localArray.length;
	}

	public MyArrayList(int initialCapacity) {

		if (initialCapacity >= 0) {
			localArray = new Object[initialCapacity];
		}
		capacity = initialCapacity;
		size = 0;

	}

	public MyArrayList() {
		this(defaultCap);
	}

	public Object get(int index) {

		if (localArray[index] != null) {
			return localArray[index];
		}
		return null;
	}

	public void add(T t) {

		// create a double size array
		// copy the context to the new array
		// add the element to new array
		if (size == capacity) {

			capacity = capacity * 2;
			localArray = Arrays.copyOf(localArray, capacity);

		}

		localArray[size] = t;
		size++;
	}

	public void remove(T t) {

		for (int i = 0; i < localArray.length; i++) {

			if (localArray[i].equals(t)) {
				System.out.println("Found the element to remove - at index - " + i);

				for (int j = i; j < localArray.length-1; j++){
						localArray[j] = localArray[j + 1];
				}
				size--;
				break;

			}

		}

	}

}
