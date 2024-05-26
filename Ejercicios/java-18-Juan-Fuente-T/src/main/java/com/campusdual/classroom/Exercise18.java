package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {
	public static void main(String[] args) {
		int customNumber = Utils.integer("Introduce un numero" + "\n");
		int [] integerArray = createAndInitializeArray(customNumber);
		showInlineArray(integerArray);
	}

	public static int[] createAndInitializeArray(int numeroElementos) {
		int[] intArray = new int[numeroElementos];
		for (int i = 0; i < numeroElementos; i++) {
			intArray[i] = i + 1;
		}

		return intArray;
	}
	public static void showInlineArray(int [] intArray) {
		StringBuilder sb = new StringBuilder();
		for (int i : intArray) {
		   sb.append(i);
		   sb.append(" ");
		}
		sb.delete(sb.length()-1, sb.length());
		System.out.println(sb);
	}
}

