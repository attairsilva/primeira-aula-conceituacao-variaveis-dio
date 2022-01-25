package com.dio;

public class Variaveis {

    public static void main(String[] args) {

        int i;
        int I;
        // int 1a; // Variaveis não podem começar com numero
        int _1a; // Embora permitido deve ser evitado;
        int $aq; // Embora permitido deve ser evitado;
        //int I = 10; // Variavel ja foi decladada
        final int somatotal = 10; // Embora permitido, sendo final boa pratica deveria ser aixa alta
        final int SOMA = 10;
        int asrn24678md;
        //int akd 272md; // Nao e permitido espaço
        int aiuy2$8798_md = 10;
        //int a09892$6556%78_md = 10; // Nao e permitido percentual como nome da variavel

        int quantidadeProduto = 50; // Notaçao camelo
        final int NUMERO_TENTATIVAS = 10; // Nao existe notaçao camelo para variavel final
        final int num_tetativa = 20; // Nao da erro, mas nao segue boa pratica para final tudo maiusculo
        int numeroagora = 20; // Nao da erro, mas nao segue boa pratica da notaçao camelo
        int qtdPro=20; // Nao tem expressividade da representaçao

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(num_tetativa);
        System.out.println(numeroagora);
        System.out.println(qtdPro);

    }

}
