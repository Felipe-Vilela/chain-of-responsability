package com.felipe.comCoR;

public abstract class Handler {
    protected Handler proximo;

    public Handler definirProximo(Handler proximo) {
        this.proximo = proximo;
        return this;
    }

    public abstract String handle(Request request);
}

