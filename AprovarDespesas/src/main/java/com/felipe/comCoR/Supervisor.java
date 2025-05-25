package com.felipe.comCoR;

public class Supervisor  extends Aprovador{

    @Override
    public void aprovar(Despesa despesa) {
        if (despesa.getValor() <= 100){
            System.out.println("Despesa de R$" + despesa.getValor() + " aprovada pelo Supervisor");
        } else if (proximo != null) {
            proximo.aprovar(despesa);
        } else {
            System.out.println("Despesa de R$" + despesa.getValor() + " não aprovada: valor excede o limite.");
        }
    }
}
