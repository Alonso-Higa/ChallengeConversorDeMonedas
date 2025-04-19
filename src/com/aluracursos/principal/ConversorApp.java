package com.aluracursos.principal;

import com.aluracursos.modulo.Calculos;
import com.aluracursos.modulo.ConsultarMoneda;
import com.aluracursos.modulo.GeneradorDeArchivo;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConversorApp {

    public static void main(String[] args) {
        //USD - BRL - ARS - COP
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;
        ConsultarMoneda consultarMoneda = new ConsultarMoneda();
        Calculos calculos = new Calculos(consultarMoneda);
        GeneradorDeArchivo generador = new GeneradorDeArchivo();
        List<String> conversiones = new ArrayList<>();
        String menu = """
                \n*******************************************
                Sea bienvenido/a al conversor de moneda
                1) Dolar =>> Peso argentino
                2) Peso argentino =>> Dolar
                3) Dolar =>> Real brasileño
                4) Real brasileño =>> Dolar
                5) Dolar =>> Peso colombiano
                6) Peso colombiano =>> Dolar
                7) Elija usted sus monedas
                8) Salir
                Elija una opcion valida:
                *******************************************
                """;


        while(true){
            try{
                LocalDateTime timeDate = LocalDateTime.now();
                DateTimeFormatter formatFechaHora =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                String horaFecha = timeDate.format(formatFechaHora);

                try{
                    System.out.println(menu);
                    opcion = Integer.parseInt(lectura.nextLine());
                }catch(NumberFormatException e){
                    System.out.println("Entrada invalida. Ingresar un numero del 1 al 7");
                }


                switch(opcion){
                    case 1: {
                        calculos.rellenarValores("USD", "ARS");
                        System.out.println(calculos.toString());
                        conversiones.add(horaFecha + " / " + calculos.toString());
                        break;
                    }
                    case 2:{
                        calculos.rellenarValores("ARS","USD");
                        System.out.println(calculos.toString());
                        conversiones.add(horaFecha + " / " + calculos.toString());
                        break;
                    }
                    case 3:{
                        calculos.rellenarValores("USD","BRL");
                        System.out.println(calculos.toString());
                        conversiones.add(horaFecha + " / " + calculos.toString());
                        break;
                    }
                    case 4:{
                        calculos.rellenarValores("BRL","USD");
                        System.out.println(calculos.toString());
                        conversiones.add(horaFecha + " / " + calculos.toString());
                        break;
                    }
                    case 5:{
                        calculos.rellenarValores("USD","COP");
                        System.out.println(calculos.toString());
                        conversiones.add(horaFecha + " / " + calculos.toString());
                        break;
                    }
                    case 6:{
                        calculos.rellenarValores("COP","USD");
                        System.out.println(calculos.toString());
                        conversiones.add(horaFecha + " / " + calculos.toString());
                        break;
                    }
                    case 7:{
                        String monedaBaseIngresada;
                        String monedaCambioIngresada;
                        System.out.println("Ingrese su moneda base:");
                        monedaBaseIngresada = lectura.nextLine().toUpperCase();
                        System.out.println("Ingrese su moneda de cambio:");
                        monedaCambioIngresada = lectura.nextLine().toUpperCase();

                        calculos.rellenarValores(monedaBaseIngresada,monedaCambioIngresada);
                        System.out.println(calculos.toString());
                        conversiones.add(horaFecha + " / " + calculos.toString());
                        break;
                    }
                    case 8:{
                        break;
                    } default:{
                        System.out.println("Ingrese una opcion valida");
                    }
                }
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
            try {
                generador.guardarJson(conversiones);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if(opcion == 8){break;}
        }
        System.out.println("Saliendo del programa");
    }
}
