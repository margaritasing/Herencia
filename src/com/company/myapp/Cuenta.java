package com.company.myapp;

public class Cuenta {
    private String moneda;
    private Double saldo;

    public Cuenta(){
        saldo = 0.0;
        moneda = "ARS";
    }
    public Double getSaldo(){ return saldo; }

    public void depositar(Double monto){
        saldo += monto;
    }
    public void extraer(Double monto){
        saldo -= monto;
    }
}


/*
    pablo "es un" Cliente. // pablo=objeto, Cliente=Clase
    Cliente pablo = new Cliente();
*/
/*
    Un Cliente "tiene una" CuentaCorriente.// atributo
    class Cliente{
        private CuentaCorriente cCorriente;
        private Integer dni;
        private String nombre;
    }
*/
/*
    Una CuentaCorriente "es un tipo de" Cuenta.// superclase
    class CuentaCorriente extends Cuenta{}
 */




}
