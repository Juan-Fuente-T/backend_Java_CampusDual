package com.campusdual.classroom;

import java.util.Arrays;

public class Pruebas {
    public static void main(String[] args) {
        int[] uniArray = createAndPopulateUnidimensionalArray(6);
        int[][] biArray = createAndPopulateBidimensionalArray(3,3);
        int [][][] triArray = createAndPopulateTridimensionalArray(3,3,3);

        System.out.println(getUnidimensionalString(uniArray));
        System.out.println(getBidimensionalString(biArray));
        System.out.println(Arrays.deepToString(createAndPopulateBidimensionalArray(3, 3)));
        System.out.println(Arrays.deepToString(createAndPopulateTridimensionalArray(3, 3, 3)));
        System.out.println(Arrays.deepToString(flatTridimensionalArray(triArray)));
    }

    public static String getUnidimensionalString(int[] uniArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < uniArray.length; i++) {
            sb.append(uniArray[i]);
            sb.append(" ");
        }
        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }

    public static int[] createAndPopulateUnidimensionalArray(int columns) {
        int[] uniArray = new int[columns];
        for (int i = 0; i < uniArray.length; i++) {
            uniArray[i] = i + 1;
        }
        return uniArray;
    }

    public static int[][] createAndPopulateBidimensionalArray(int rows, int columns) {
        int [][] biArray = new int [rows][columns];
        int num = 1;
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++) {
                biArray[i][j] = num++;
            }
        }
        return biArray;
    }

    public static int[][][] createAndPopulateTridimensionalArray(int depth, int rows, int columns) {
        int [][][] triArray = new int [depth][rows][columns];
        int num = 1;
        for (int i = 0; i < depth; i++){
            for(int j = 0; j < rows; j++) {
                for(int k = 0; k < columns; k++) {
                    triArray[i][j][k] = num++;
                }
            }
        }
        return triArray;
    }
    private static String stringFlatMatrixRow(int[][] flatMatrix, int row) {
        return getUnidimensionalString(flatMatrix[row]);
    }

    public static String getBidimensionalString(int[][] intArrayBi) {
        int rows = intArrayBi[0].length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            sb.append(stringFlatMatrixRow(intArrayBi, i));
            sb.append(" ");
            sb.append("\n");
        }
        sb.delete(sb.length()-1, sb.length());
        return sb.toString();
    }
    public static int[][] flatTridimensionalArray(int[][][] intArrayTri) {
        int[][] flatArray = new int[intArrayTri.length][intArrayTri[0].length];
        for (int i = 0; i < intArrayTri.length; i++) {
            for (int j = 0; j < intArrayTri[i].length; j++) {
                for (int k = 0; k < intArrayTri[i][j].length; k++) {
                    flatArray[j][i] += intArrayTri[k][j][i];
                }
            }
        }
        return flatArray;
    }
}
