package com.felipe.comCoR;

public class SenhaHandler extends Handler {
    @Override
    public String handle(Request request) {
        if (request.senha == null || request.senha.length() < 8) {
            return "A senha deve ter pelo menos 8 caracteres.";
        }
        if (proximo != null) {
            return proximo.handle(request);
        }
        return null;
    }
}