package com.example.package3;

import com.example.App;
import com.example.package1.Class1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Class3 {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public int multiplica(int num1, int num2) {
        return num1 * num2;
    }

    public void testMultiplicacao() {
        Class1 class1 = new Class1();
        int soma = class1.soma(5, 3);
        int resultado = multiplica(soma, 10);

        if(resultado > 20) {
            logger.debug("Resultado maior que 20");
        }

        logger.info("Resultado da multiplicação: " + resultado);
    }
}
