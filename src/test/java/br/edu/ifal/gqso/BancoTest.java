package br.edu.ifal.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BancoTest {
     Banco banco;


    @BeforeEach
    public void setUp(){
        banco = new Banco();
        banco.setSaldo(100);
    }

    @Test
    public void depositoTest(){
        assertEquals(200, banco.deposito(100));
    }

}