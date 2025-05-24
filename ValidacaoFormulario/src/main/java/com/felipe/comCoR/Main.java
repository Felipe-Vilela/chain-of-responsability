package com.felipe.comCoR;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Handler validador = new NomeHandler();
        validador.definirProximo(new EmailHandler())
                .definirProximo(new SenhaHandler());

        System.out.println("\nFormulário 1 nome vazio:");
        Request formulario1 = new Request("", "joao.santos@outlook.com", "12345678");
        processarResultado(validador.handle(formulario1));

        System.out.println("\nFormulário 2 nome com espaços em branco:");
        Request formulario2 = new Request("   ", "joao.santos@outlook.com", "12345678");
        processarResultado(validador.handle(formulario2));

        System.out.println("\nFormulário 3 email inválido:");
        Request formulario3 = new Request("Maria", "Maria_invalido", "12345678");
        processarResultado(validador.handle(formulario3));

        System.out.println("\nFormulário 4 senha inválida:");
        Request formulario4 = new Request("Pedro", "pedro.arnaldo@gmail.com", "123");
        processarResultado(validador.handle(formulario4));

        System.out.println("\nFormulário 5 valido:");
        Request formulario5 = new Request("Carlos", "carlos.nogueira@outlook.com", "senha1234");
        processarResultado(validador.handle(formulario5));
    }

    public static void processarResultado(String resultado) {
        System.out.println(Objects.requireNonNullElse(resultado, "Formulário válido."));
    }
}