package com.aluracursos.modulo;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    Moneda moneda(String monedaBase, String monedaCambio, double montoDeCambio){
        try {
            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/1f734457321113ff71bd7de0/pair/" + monedaBase + "/" + monedaCambio + "/" + montoDeCambio);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            var json = response.body();

            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre esa conversion");
        }
    }
}
