package com.dio;

public class TiposDados {

    public static void main(String[] args) {

        byte b1 = 127;
        //byte b2 = 128; // ultrapassa a capacidade

        short s1 = 20000;
        //short s2 = 40000; ultrapassa a capacidade

        //int i1 = -10000000000; // ultrapassa a capacidade
        //int i2 = 10000000000; // ultrapassa a capacidade
        int i3 = 205000;

        long l1 = 1000000000000000000L;
        //long l2 = 10000000000000000000L; // ultrapassa a capacidade
        //long l3 = 1000000000000000000;// sem o L no final, o java nao identifica que é um LONG

        double d1 = 10.20;
        double d2 = 293.0d; // o d no final informando que é um double é opicional

        char c1 = 'w'; // aspas simples quando 1 caracter, tipo char é para um caracter;
        //char c2 = 'ww'; // erro colocando mais de um caracter em um tipo char;
        char c3 = '\u0057'; // este \u0057 é a representação do 'w'

        String st1 = "Ola"; // o tipo string é uma classe java para textos do tipo composto, que se primitivou
        String st2 = "22/10/2022"; // usando uma string para um tipo que nao e o adequado pode
        // trazer a necessidade da conversão e aumentar o processamento, respeite os tipos, existem
        // mais tipos compostos

        System.out.println("Uma variavel tipo String: " + st2);
    }
}
