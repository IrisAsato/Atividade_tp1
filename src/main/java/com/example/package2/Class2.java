package com.example.package2;

import com.example.App;
import com.example.package1.Class1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Class2 {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public int subtrai(int num1, int num2) {
        return num1 - num2;
    }

    public void testSubtracao() {
        Class1 class1 = new Class1();
        int soma = class1.soma(5, 3);
        int resultado = subtrai(soma, 2);
        logger.info("Resultado da subtração: " + resultado);
    }
}
