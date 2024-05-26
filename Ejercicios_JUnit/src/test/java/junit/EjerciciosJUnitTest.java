package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class EjerciciosJUnitTest {

    @Disabled
    @Test
    void testSumEvenNum(){
        Assertions.assertEquals(6, EjerciciosJUnit.sumEvenNum(2));
        Assertions.assertEquals( 12, EjerciciosJUnit.sumEvenNum(3));
    }
    @Disabled
    @Test
    void testFactorial(){
        Assertions.assertEquals( 6, EjerciciosJUnit.factorial(3));
        Assertions.assertEquals(24, EjerciciosJUnit.factorial(4));
        Assertions.assertEquals( 120, EjerciciosJUnit.factorial(5));
    }

    @Test
    void testCreateAndInitializeArray(){

//        int[] expectedArray = {1, 2, 3};
        int[] expectedArray = new int[3];
        for (int i = 0; i < expectedArray.length; i++) {
            expectedArray[i] = i + 1;
        }

        int[] obtainedArray = EjerciciosJUnit.createAndInitializeArray(3);

        Assertions.assertEquals(3, obtainedArray.length);
        Assertions.assertTrue(obtainedArray[2] == 3);
        Assertions.assertArrayEquals(expectedArray, obtainedArray);
        //Assertions.assertArrayEquals(expectedArray, EjerciciosJUnit.createAndInitializeArray(3));
    }
    @Test
    void testGetUnidimensionalString() {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        String expectedString = "1 2 3 4 5 6 7 8 9";
        String obtainedString = EjerciciosJUnit.getUnidimensionalString(testArray);

        Assertions.assertEquals(expectedString, obtainedString);
    }

    @Test
    void testSplitStringAndCountNumberOfWords(){
        String fraseParaTrocear = "El perro de San Roque no tiene rabo porque Fernando se lo ha cortado";

        int cantidadEsperadaDePalabras = 14;
        int cantidadObtenidaDePalabras = EjerciciosJUnit.splitStringAndCountNumberOfWords(fraseParaTrocear);

        Assertions.assertEquals(cantidadEsperadaDePalabras, cantidadObtenidaDePalabras);
    }
    @Test
    void testAnhadirElementosAListaVacia(){
        List<String> listaDePalabras= new ArrayList<>();
        String fraseParaAnhadir = "El perro de San Roque no tiene rabo porque Fernando se lo ha cortado";

        Assertions.assertTrue(listaDePalabras.isEmpty());

        EjerciciosJUnit ejerciciosJUnit = new EjerciciosJUnit();
        ejerciciosJUnit.anhadirElementosALista(listaDePalabras, fraseParaAnhadir);

        Assertions.assertFalse(listaDePalabras.isEmpty());
        Assertions.assertEquals(14, listaDePalabras.size());
        Assertions.assertTrue(listaDePalabras.contains("Roque"));
        Assertions.assertEquals("San", listaDePalabras.get(3));
    }

    @Test
    void testAnhadirElementosAListaConListaYaPoblada(){
        List<String> listaLlenaDePalabras= new ArrayList<>();
        String fraseParaDividir = "Escucha esto que te digo:";
        String fraseParaAnhadir = "El perro de San Roque no tiene rabo porque Fernando se lo ha cortado";


        listaLlenaDePalabras.addAll(List.of(fraseParaDividir.split( " ")));
        int tamanhoDeLaLista = listaLlenaDePalabras.size();

        EjerciciosJUnit ejerciciosJUnit = new EjerciciosJUnit();
        ejerciciosJUnit.anhadirElementosALista(listaLlenaDePalabras, fraseParaAnhadir);

        Assertions.assertEquals(tamanhoDeLaLista + 14, listaLlenaDePalabras.size());
        Assertions.assertEquals(19, listaLlenaDePalabras.size());
        Assertions.assertEquals(1, listaLlenaDePalabras.indexOf("esto"));
        Assertions.assertEquals(6, listaLlenaDePalabras.indexOf("perro"));
    }
}
