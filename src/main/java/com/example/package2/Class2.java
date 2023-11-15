package com.example.package2;

import com.example.package1.Class1;

public class Class2 {
    public int subtrai(int num1, int num2) {
        return num1 - num2;
    }

    public void testSubtracao() {
        Class1 class1 = new Class1();
        int soma = class1.soma(5, 3);
        int resultado = subtrai(soma, 2);
        System.out.println("Resultado da subtração: " + resultado);
    }
}
