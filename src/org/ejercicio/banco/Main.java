package org.ejercicio.banco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Luiz Gomez", 25672946);
        CuentaBancaria cuenta1 = new CuentaBancaria(6831531, cliente1, 51000);
        System.out.println("Programa ejecutado con éxito!");
    }
}