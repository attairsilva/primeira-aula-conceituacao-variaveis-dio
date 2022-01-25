package com.dio;

public class Conversoes {
    public static void main(String[] args) {


        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;
        // conversao do short parao o byte, o short tem capacidade maior, é um downcast (reducao)

        long l1;
        int i1 = 10;
        l1 = i1;
        // promover inteiro para long, upcast (aumentou)

        int i2;
        long l2 = 100000000000000L;
        i2 = (int) l2;
        // é um downcast, havera perda de informação porque o tamanho long de 1000000000000L nao cabera
        // na variavel inteiro

        System.out.println("i2 => " + i2);

        int i3;
        float f4 = 11.34334f;
        System.out.println("f4 Float => " + f4);
        i3 = (int)f4;
        // exemplo mais classico de um downcast com perda de informação
        // variavel fracionado para inteiro
        // a convesao ignora a parte fracionado
        System.out.println("(Conversao para inteiro) i3 = (int)f4 => "+ i3);



    }
}
