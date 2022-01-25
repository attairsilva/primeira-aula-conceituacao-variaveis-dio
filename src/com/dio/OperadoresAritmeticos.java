package com.dio;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        System.out.println("prePos: ");
        prePos();
        System.out.println("Aritmeticos: ");
        aritimeticos();
        System.out.println("Atribuições: ");
        atribuicoes();
        System.out.println("Precedencias: ");
        precedencias();

    }

    private static void prePos(){
        int k = 10;
        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i: "+i);
        System.out.println("j: "+j);
        System.out.println("x: "+x);

    }

    private static void aritimeticos(){

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a + b;
        int r2 = c - a;
        int r3 = d + b;
        int r4 = e / a;
        int r5 = c * b;

        System.out.println("a + b = "+r1);
        System.out.println("c - a = "+r2);
        System.out.println("d + b = "+r3);
        System.out.println("e / a = "+r4);
        System.out.println("c * b = "+r5);

    }

    public static void  atribuicoes(){

        int i = 1400;
        short j = 25;
        long l = 234L;
        int k = 36;
        float f = 4.5f;
        double d = 12.2;

        System.out.println("d: "+ d);

        i += 5; // i = i + 5
        j -= 3; // j = j - 3
        d /= 3.2d; // d = d / 3.2d
        l *= 2; // l = l * 2
        k %= 3; // k = k % 3

        System.out.println("i += 5 => i = i + 5 => " + i );
        System.out.println("j -= 3 => j = j - 3 => " + j );
        System.out.println("d /= 3.2d => d = d / 3.2d => " + d );
        System.out.println("l *= 2 => l = l * 2 => " + l );
        System.out.println("k %= 3 => k = k % 3 => " + k);

    }

    public static void precedencias() {

        int i = 10;
        int j = 20;
        int k = 30;

        System.out.println("Valor de i antes => "+i);
        int a = i++ + --j * k;
        // primeiro faz toda a operação depois implementa a procedencia no i++
        System.out.println(" a = i++ + --j * k => " + a);
        System.out.println("Valor de i depois => "+i);

        int b = k / --i % 3 + 1;
        System.out.println("k / --1 % 3 + 1 => " + b);
        System.out.println("Valor de i depois => " + i);

    }

}
