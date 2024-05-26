package com.campusdual.classroom;

import java.util.Arrays;

public class Exercise17 {
	public static int[] createEmptyIntArray(int positions) {
        return new int[positions];
	}

	public static String[] createInitializedStringArray() {
		return new String [] {"1", "2", "3"};
		//System.out.println("Array de strings: " + Arrays.toString(stringArray));
		// return stringArray;
	}


	public static void populateArray(int[] array, int index, int value) {
		array[index] = value;
		System.out.println("Valor de array: " + array[index]);
	}

	public static int arrayLength(int[] array) {
		return array.length;
	}

	static public void showValue(int[] array, int index) {
		System.out.println(array[index]);
	}

	public static void main(String[] args) {
		int[] intArray = createEmptyIntArray(3);
        String[] stringArray = createInitializedStringArray();
		populateArray(intArray, 0, 10);
		populateArray(intArray, 1, 9);
		populateArray(intArray, 2, 8);
		showValue(intArray, 0);
		System.out.println(arrayLength(intArray));
	}
}

