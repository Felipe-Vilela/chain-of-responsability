package com.felipe.semCoR;

public class Main {
    public static void main(String[] args) {
        Despesa despesa01 = new Despesa(75);
        Despesa despesa02 = new Despesa(200);
        Despesa despesa03 = new Despesa(750);
        Despesa despesa04 = new Despesa(1200);
        DespesasAprovador aprovador = new DespesasAprovador();

        System.out.println("Processando despesas sem Chain of Responsibility:");
        aprovador.aprovar(despesa01);
        aprovador.aprovar(despesa02);
        aprovador.aprovar(despesa03);
        aprovador.aprovar(despesa04);
    }
}