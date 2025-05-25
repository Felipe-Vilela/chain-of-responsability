package com.felipe.comCoR;

public abstract class Aprovador {
    protected Aprovador proximo;

    public Aprovador setProximo(Aprovador proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract void aprovar(Despesa despesa);
}
