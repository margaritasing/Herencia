package com.company.myapp;

public class Cliente {
    private Corriente cCorriente;
    private Ahorro cDeAhorro;

    public Cliente(){
        cCorriente = new Corriente();
        cDeAhorro = new Ahorro();
    }

    public Corriente getcCorriente() {
        return cCorriente;
    }
    public Ahorro getcDeAhorro() {
        return cDeAhorro;
    }

}
