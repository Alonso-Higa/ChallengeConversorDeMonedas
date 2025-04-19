package com.aluracursos.modulo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeneradorDeArchivo {
    public void guardarJson(List<String> lista) throws IOException {
        try{
            FileWriter fileWriter = new FileWriter("historialDeConversiones.txt");
            for(String conversiones : lista){
                fileWriter.write(conversiones);
                fileWriter.write("\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Problemas para guardar la conversion en el archivo");;
        }

    }
}
