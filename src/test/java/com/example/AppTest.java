package com.example;

import com.example.package3.Class3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void calculaMultiplicacaoDeDoisInteiros(){
        Class3 class3 = new Class3();
        int multiplica = class3.multiplica(2,2);

        assertEquals(4, multiplica);
    }

    @Test
    public void testNumberFormatException(){
        String numero = "One";

        NumberFormatException thrown = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt(numero);
        }, "NumberFormatException was expected");

        assertEquals("For input string: \"One\"", thrown.getMessage());
    }
}
