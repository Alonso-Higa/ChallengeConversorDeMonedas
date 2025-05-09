package com.aluracursos.modulo;

import java.util.Scanner;

public class Calculos {
    private String monedaBase;
    private String monedaCambio;
    private double montoDeCambio;

    Scanner lectura = new Scanner(System.in);
    ConsultarMoneda conversion;

    public Calculos(ConsultarMoneda conversion){
        this.conversion = conversion;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public String getMonedaCambio() {
        return monedaCambio;
    }

    public double getMontoDeCambio() {
        return montoDeCambio;
    }
    public void rellenarValores(String monedaBase, String monedaCambio){
        this.monedaBase = monedaBase;
        this.monedaCambio = monedaCambio;
        //System.out.println("Ingrese la cantidad de " + monedaBase + " que deseas convertir a " + monedaCambio + ": ");
        //this.montoDeCambio = Double.parseDouble(lectura.nextLine());
        while(true){
            try{
                System.out.println("Ingrese la cantidad de " + monedaBase + " que deseas convertir a " + monedaCambio + ": ");
                this.montoDeCambio = Double.parseDouble(lectura.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Respuesta invalida, ingresarlo de nuevo");
            }
        }
    }

    @Override
    public String toString() {
        Moneda monedaConvertida = conversion.moneda(monedaBase,monedaCambio,montoDeCambio);

        if(monedaConvertida.base_code() == null){
            return "No se encontro resultado, revise bien los nombres de las monedas";
        }
        else{
            return "El valor " + montoDeCambio + " [" + monedaConvertida.base_code() + "] " +
                    " corresponde en " + monedaConvertida.target_code() + " a =>> " +
                    monedaConvertida.conversion_result() + "["+monedaConvertida.target_code()+"]";
        }
    }
}
