package junit;

import java.util.List;

public class EjerciciosJUnit {
    public static int sumEvenNum(int num) {
        int total = 0;
        for (int i = 1; i <= num; i++) {
            total = total + 2 * i;
        }
        return total;
    }

    public static int factorial(int num) {
        int total = 1;
        for (int i = 1; i <= num; i++) {
            total *= i; //o también total = total * i
        }
        return total;
    }

    public static int[] createAndInitializeArray(int numOfElements) {
        int[] intArray = new int[numOfElements];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }

        return intArray;
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

    public static int splitStringAndCountNumberOfWords(String fraseParaDividir) {
        return fraseParaDividir.split(" ").length;
    }

    public void anhadirElementosALista(List<String> listaDePalabras, String palabrasNuevas) {
        String[] listaPalabrasNuevas = palabrasNuevas.split(" ");

        for (int i = 0; i < listaPalabrasNuevas.length; i++) {
            listaDePalabras.add(listaPalabrasNuevas[i]);
        }
    }
}