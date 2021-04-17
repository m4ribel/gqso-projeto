package br.edu.ifal.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.ifal.gqso.Banco.ValorNegativo;

public class BancoTest {
    Banco banco;
    

    @BeforeEach
    public void setUp() throws ValorNegativo {
        banco = new Banco();
        banco.deposito(100);
    }

    @Test
    public void depositoTest() throws ValorNegativo{
        assertEquals(200, banco.deposito(100));
        assertThrows(Banco.ValorNegativo.class, () -> banco.deposito(-100));
    }

}