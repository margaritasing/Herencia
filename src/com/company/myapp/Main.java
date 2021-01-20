package com.company.myapp;

public class Main {

    public static void main(String[] args) {

        Cliente pablo = new Cliente();
        CajaDeAhorro cdaPablo = pablo.getcDeAhorro();

        cdaPablo.depositar(100.00);
        cdaPablo.extraer(50.25);
        cdaPablo.depositar(300.50);
        System.out.println("El saldo de pablo es: $"+cdaPablo.getSaldo());

    }
}
