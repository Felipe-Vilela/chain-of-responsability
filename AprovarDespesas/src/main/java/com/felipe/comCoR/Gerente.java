package com.felipe.comCoR;

public class Gerente extends Aprovador{
    @Override
    public void aprovar(Despesa despesa) {
        if (despesa.getValor() > 100 && despesa.getValor() <= 500){
            System.out.println("Despesa de R$" + despesa.getValor() + " aprovada pelo Gerente");
        } else if (proximo != null) {
            proximo.aprovar(despesa);
        } else {
            System.out.println("Despesa de R$" + despesa.getValor() + " não aprovada: valor excede o limite.");
        }
    }
}
