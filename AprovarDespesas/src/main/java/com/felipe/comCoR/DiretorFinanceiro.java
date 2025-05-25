package com.felipe.comCoR;

public class DiretorFinanceiro extends Aprovador {

    @Override
    public void aprovar(Despesa despesa) {
        if (despesa.getValor() > 500 && despesa.getValor() <= 1000){
            System.out.println("Despesa de R$" + despesa.getValor() + " aprovada pelo Diretor Financeiro");
        } else {
            System.out.println("Despesa de R$" + despesa.getValor() + " não aprovada: valor excede o limite.");
        }
    }
}
