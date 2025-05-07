package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequisicaoAPI {
    public String buscarCotacao(String base, String target, String apiKey) throws Exception {
        String endpoint = String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s", apiKey, base, target);
        URL url = new URL(endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder resposta = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            resposta.append(inputLine);
        }
        in.close();

        return resposta.toString();
    }
}
