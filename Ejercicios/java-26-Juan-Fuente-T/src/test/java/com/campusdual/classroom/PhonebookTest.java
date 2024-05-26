package com.campusdual.classroom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;


/**
 * This class contains unit tests for the Phonebook class.
 */
class PhonebookTest {
    private Phonebook nuevoPhonebook;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream("1\n4\n".getBytes());
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    Contact nuevoContacto;
    Contact nuevoContacto2;

    /**
     * Sets up the necessary objects and configurations before each test case.
     */
    @BeforeEach
    void setUp() {
        nuevoPhonebook = new Phonebook();
        nuevoContacto = new Contact("Vicente", "Lescopio", "666666666");
        nuevoContacto2 = new Contact("Constante", "Remoto", "666666667");
        nuevoPhonebook.addContact(nuevoContacto);
        nuevoPhonebook.addContact(nuevoContacto2);

        MockitoAnnotations.openMocks(this);
        System.setOut(new PrintStream(outContent));
        System.setIn(inContent);
        MockitoAnnotations.openMocks(this);
    }

    /**
     * Tests the setData method with new data.
     */
    @Test
    void testSetData(){
        Map<String, Contact> agenda = new HashMap<>();

        agenda.put("jlopez", new Contact("Javier", "López", "124678"));
        agenda.put("rperez", new Contact("Ramón", "Pérez", "135790"));
        nuevoPhonebook.setData(agenda);
        Assertions.assertEquals(2, nuevoPhonebook.getData().size());
        Assertions.assertTrue(nuevoPhonebook.getData().containsKey("jlopez"));
        Assertions.assertEquals("Ramón",nuevoPhonebook.getData().get("rperez").getName());
    }


    /**
     * Tests the addContact method with valid data.
     */
    @Test
    void testAddContactConDatosValidos() {
        Assertions.assertEquals(2, nuevoPhonebook.getData().size());
        Contact nuevoContacto = new Contact("Clemente", "Leférico Alto", "666666669");
        nuevoPhonebook.addContact(nuevoContacto);
        Assertions.assertEquals(3, nuevoPhonebook.getData().size());
        Assertions.assertEquals("Clemente", nuevoPhonebook.getData().get(nuevoContacto.getCode()).getName());
    }

    /**
     * Tests the addContact method with erroneous data.
     * This test case is currently disabled, cause it goes into a loop requesting a valid value
     */
    @Disabled
    @Test
    void testAddContactConDatosErroneos() {
        Assertions.assertTrue(nuevoPhonebook.getData().isEmpty());
        Contact nuevoContacto = new Contact("Vicente", "", "");
        nuevoPhonebook.addContact(nuevoContacto);

        PrintStream printStream = Mockito.mock(PrintStream.class);
        System.setOut(printStream);

        String expectedMessage = "No se ha podido guardar el contacto. No se admiten campos en blanco. " +
                "Inténtelo de nuevo\n";

        nuevoPhonebook.addContact();

        Mockito.verify(printStream).println(expectedMessage);
        Assertions.assertEquals(2, nuevoPhonebook.getData().size());
        Assertions.assertNotEquals("Vicente", nuevoPhonebook.getData().get(nuevoContacto.getCode()).getName());
    }

    /**
     * Tests the showPhonebook method.
     */
    @Test
    void testShowPhonebook() {
        PrintStream printStream = Mockito.mock(PrintStream.class);
        System.setOut(printStream);

        nuevoPhonebook.showPhonebook();

        String expectedMessage1 = "Nombre Vicente Lescopio. Telefono 666666666. Codigo vlescopio\n";
        String expectedMessage2 = "Nombre Constante Remoto. Telefono 666666667. Codigo cremoto\n";

        Mockito.verify(printStream).println(expectedMessage1);
        Mockito.verify(printStream).println(expectedMessage2);
        Assertions.assertEquals("Vicente", nuevoPhonebook.getData().get(nuevoContacto.getCode()).getName());
        Assertions.assertEquals("Constante", nuevoPhonebook.getData().get(nuevoContacto2.getCode()).getName());
    }

    /**
     * Tests the deleteContact method with an existing contact.
     */
    @Test
    void testDeleteContactExistente() {
        Assertions.assertEquals(2, nuevoPhonebook.getData().size());

        // Simula la entrada del usuario para eliminar un contacto
        String input = "cremoto\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));


        PrintStream printStream = Mockito.mock(PrintStream.class);
        System.setOut(printStream);
        nuevoPhonebook.deleteContact();

        String expectedMessage = "Has borrado a : Constante Remoto\n";

        Mockito.verify(printStream).println(expectedMessage);

        Assertions.assertEquals(1, nuevoPhonebook.getData().size());
    }

    /**
     * Tests the deleteContact method with a non-existent contact.
     * This test case is currently disabled, cause it goes into a loop requesting a real contact
     */
    @Disabled
    @Test
    void testDeleteContactInexistente() {
        Assertions.assertEquals(2, nuevoPhonebook.getData().size());

        // Simula la entrada erronea para eliminar un contacto
        String input = "vacaburra\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        PrintStream printStream = Mockito.mock(PrintStream.class);
        System.setOut(printStream);

        nuevoPhonebook.deleteContact();

        String expectedMessage = "Código no válido, inténtelo de nuevo" + "\n";

        Mockito.verify(printStream).println(expectedMessage);

        Assertions.assertEquals(2, nuevoPhonebook.getData().size());
    }

    /**
     * Tests the getContactSelectedByUser method.
     * This test case is currently disabled, cause it goes into a loop requesting a contact
     */
    @Disabled
    @Test
    void getContactSelectedByUser() {

        Assertions.assertEquals(2, nuevoPhonebook.getData().size());

        String input = "vlescopio\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Mockea la respuesta de Utils.string()
        //when(Utils.string("Introduzca el código del contacto que desea eliminar." + "\n")).thenReturn("cremoto");

        PrintStream printStream = Mockito.mock(PrintStream.class);
        System.setOut(printStream);
        nuevoPhonebook.getContactSelectedByUser();

        String expectedMessage = "Nombre Constante Remoto. Telefono 666666667. Codigo cremoto\n";

        Mockito.verify(printStream).println(expectedMessage);
        Assertions.assertEquals("Constante", nuevoPhonebook.getData().get(nuevoContacto2.getCode()).getName());

    }
}
