package com.felipe.semCoR;

public class DespesasAprovador {
    public void aprovar(Despesa despesa) {
        double valor = despesa.getValor();
        if (valor <= 100) {
            System.out.println("Despesa de R$" + valor + " aprovada pelo Supervisor.");
        } else if (valor <= 500) {
            System.out.println("Despesa de R$" + valor + " aprovada pelo Gerente.");
        } else if (valor <= 1000) {
            System.out.println("Despesa de R$" + valor + " aprovada pelo Diretor Financeiro.");
        } else {
            System.out.println("Despesa de R$" + valor + " não aprovada: valor excede o limite.");
        }
    }
}
