package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CuentaBancariaTest {

    private CuentaBancaria cuentabancaria;
    private int amountToDeposit;
    private String correctPass = "*****";
    @BeforeEach
    void init() { //init es lo mismo que Setup, el nombre no es importante, solo la etiqueta @BeforeEach
        this.correctPass = "*****";
        this.amountToDeposit = 600;
        this.cuentabancaria = new CuentaBancaria(1000, correctPass);
    }

    @Test
    void testSetPassword(){
        this.cuentabancaria.setPassword("12345");
        Assertions.assertEquals("12345", this.cuentabancaria.getPassword());
    }

    @Test
    void testDepositar() {
        Assertions.assertEquals(1600, this.cuentabancaria.depositar(amountToDeposit));
        Assertions.assertEquals(1600, this.cuentabancaria.getSaldo());
    }

    @Test
    void testRetirarCorrectamente(){
        Assertions.assertEquals(600, this.cuentabancaria.retirar(amountToDeposit, correctPass));
        Assertions.assertEquals(400, this.cuentabancaria.getSaldo());
    }
    @Test
    void testRetirarMasQueSaldoExistente(){
        Assertions.assertEquals(0, this.cuentabancaria.retirar(1100, correctPass));
        Assertions.assertEquals(1000, this.cuentabancaria.getSaldo());
}

    @Test
    void testRetirarConContraseñaErronea(){
        Assertions.assertEquals(0, this.cuentabancaria.retirar(amountToDeposit, "***"));
        Assertions.assertEquals(1000, this.cuentabancaria.getSaldo());
    }
    @Test
    void testRetirarConContraseñaCorrectaCantidadIgualSaldo(){
        Assertions.assertEquals(cuentabancaria.getSaldo(), this.cuentabancaria.retirar(cuentabancaria.getSaldo(), correctPass));
        Assertions.assertEquals(0, this.cuentabancaria.getSaldo());
    }

    @Test
    void testDimeSaldo(){
        Assertions.assertEquals(1000, this.cuentabancaria.dimeSaldo());
    }
    @Test
    void testDimePassword(){
        Assertions.assertEquals(correctPass, this.cuentabancaria.dimePassword());
    }

}
