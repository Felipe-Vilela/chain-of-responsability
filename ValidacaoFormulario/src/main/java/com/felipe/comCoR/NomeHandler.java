package com.felipe.comCoR;

public class  NomeHandler extends Handler {
    @Override
    public String handle(Request request) {
        if (request.nome == null || request.nome.isEmpty()) {
            return "Nome é obrigatório.";
        }
        if (proximo != null) {
            return proximo.handle(request);
        }
        return null;
    }
}