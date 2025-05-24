package com.felipe.semCoR;

public class ValidadorFormulario {

    public String validar(String nome, String email, String senha) {
        if (nome == null || nome.trim().isEmpty()) {
            return "Nome é obrigatório.";
        }
        if (email == null || !email.contains("@") || !email.contains(".")) {
            return "Email inválido.";
        }
        if (senha == null || senha.length() < 8) {
            return "A senha deve ter pelo menos 8 caracteres.";
        }
        return "Formulário válido.";
    }
}

