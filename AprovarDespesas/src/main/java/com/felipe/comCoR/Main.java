package com.felipe.comCoR;

public class Main {
    public static void main(String[] args) {
        Aprovador supervisor = new Supervisor();
        Aprovador gerente = new Gerente();
        Aprovador diretor = new DiretorFinanceiro();

        supervisor.setProximo(gerente).setProximo(diretor);

        Despesa despesa01 = new Despesa(75);
        Despesa despesa02 = new Despesa(200);
        Despesa despesa03 = new Despesa(750);
        Despesa despesa04 = new Despesa(1200);

        System.out.println("Processando despesas com Chain of Responsibility:");
        supervisor.aprovar(despesa01);
        supervisor.aprovar(despesa02);
        supervisor.aprovar(despesa03);
        supervisor.aprovar(despesa04);
    }
}
