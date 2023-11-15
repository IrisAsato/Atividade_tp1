package com.example.package3;

import com.example.package1.Class1;

public class Class3 {
    public int multiplica(int num1, int num2) {
        return num1 * num2;
    }

    public void testMultiplicacao() {
        Class1 class1 = new Class1();
        int soma = class1.soma(5, 3);
        int resultado = multiplica(soma, 10);

        if(resultado > 20) {
            System.out.println("Debug");
        }

        System.out.println("Resultado da multiplicação: " + resultado);
    }
}
