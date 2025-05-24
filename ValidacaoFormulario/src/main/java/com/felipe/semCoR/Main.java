package com.felipe.semCoR;

public class Main {
    public static void main(String[] args) {
        ValidadorFormulario validadorFormulario = new ValidadorFormulario();

        System.out.println("Validações com nome vazio");
        System.out.println(validadorFormulario.validar("", "joao.santos@outlook.com", "12345678"));
        System.out.println(validadorFormulario.validar("   ", "joao.santos@outlook.com", "12345678"));
        System.out.println("\nValidações com e-mail inválido");
        System.out.println(validadorFormulario.validar("Maria", "Maria_invalido", "12345678"));
        System.out.println("\nValidações com senha inválido");
        System.out.println(validadorFormulario.validar("Pedro", "pedro.arnaldo@gmail.com", "123"));
        System.out.println("\nFormulário Válido");
        System.out.println(validadorFormulario.validar("Carlos", "carlos.nogueira@outlook.com", "senha1234"));
    }
}

