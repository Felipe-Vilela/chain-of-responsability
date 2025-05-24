package com.felipe.comCoR;

public class EmailHandler extends Handler {
    @Override
    public String handle(Request request) {
        if (request.email == null || request.email.trim().isEmpty()) {
            return "Email é obrigatório.";
        }
        if (!request.email.contains("@") || !request.email.contains(".")) {
            return "Email inválido.";
        }
        if (proximo != null) {
            return proximo.handle(request);
        }
        return null;
    }
}