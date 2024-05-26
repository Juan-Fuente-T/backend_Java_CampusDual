package com.campusdual.classroom;

import com.campusdual.util.Utils;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.MockitoAnnotations;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * This class contains test cases for the Contact class.
 */
@ExtendWith(MockitoExtension.class)
class ContactTest {
    private Contact contact;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream("1\n4\n".getBytes());
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;


    @BeforeEach
    void setUp(){
        contact = new Contact("Javier", "López", "1234567");
        MockitoAnnotations.openMocks(this);
        System.setOut(new PrintStream(outContent));
        System.setIn(inContent);
    }

    //En este caso se comprueba if y else en el mismo test, no es lo ideal

    /**
     * Test case for the Contact.getCode() method.
     * It checks the generation of contact codes for different scenarios.
     */
    @Test
    void testContactCodeGenerator(){
        //Caso de un unico apellido
//        String valorEsperado = "jlopez";

        Assertions.assertEquals("jlopez", contact.getCode());

        //Caso de multiples apellidos
        Contact contacto2 = new Contact("Fernando Miguel", "Juan de los Santos Requejo León", "1114555");
        Assertions.assertEquals("fjdelossantosrequejoleon", contacto2.getCode());

        Contact contacto3 = new Contact("Carlos", "Fernández-Simón", "11111111");
        Assertions.assertEquals("cfernandez-simon", contacto3.getCode());
    }

    /**
     * Test case for the Contact.callMyNumber() method.
     * It verifies if the contact's own number is called correctly.
     */
    @Test
    void testCallMyNumber(){
        PrintStream printStream = Mockito.mock(PrintStream.class);
        System.setOut(printStream);

        contact.callMyNumber();

        String expectedMessage = "Mi nombre es Juan Fuente. El telefono es 555666777";
        Mockito.verify(printStream).println(expectedMessage);
    }


    /**
     * Test case for the Contact.callOtherNumber() method.
     * It verifies if another number can be called by the contact.
     */
    @Test
    void testCallOtherNumber() {
        PrintStream printStream = Mockito.mock(PrintStream.class);
        System.setOut(printStream);

        contact.callOtherNumber("123456789");

       String expectedMessage = "Yo, Juan Fuente, estoy llamando al numero 123456789\n";
       Mockito.verify(printStream).println(expectedMessage);
    }

    /**
     * Test case for the Contact.showContactDetails() method.
     * It checks if the contact details are displayed correctly.
     */
    @Test
    void testShowContactDetails(){
        PrintStream printStream = Mockito.mock(PrintStream.class);
        System.setOut(printStream);

        contact.showContactDetails();

        Mockito.verify(printStream).println("Nombre Javier López. Telefono 1234567. Codigo jlopez\n");
    }

    /**
     * Test case for the Contact.contactMenu() method.
     * It tests the functionality of the contact menu.
     * This test is currently disabled, cause it goes into a loop requesting the values
     */
    @Disabled
    @Test
    public void testContactMenu() {
        String input = "4\n"; // Simula la entrada del usuario para salir del menú
        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);
        // Redirige System.out a un ByteArrayOutputStream para capturar la salida
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        contact.contactMenu();

        System.out.println(outContent.toString());
        String expectedOutput = "Seleccione una de las siguientes opciones: "
                        + "\n (1) Llamarse a si mismo. "
                        + "\n (2) Llamar a otro número"
                        + "\n (3) Mostrar detalles del contacto."
                        + "\n (4) Salir del menú."
                        + "\nSaliendo del menú.\n"
                        + "\n";
       // Assertions.assertEquals(expectedOutput, outContent.toString());
        }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
