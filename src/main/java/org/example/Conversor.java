package org.example;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Conversor {
    private final String apiKey;
    private final RequisicaoAPI requisicaoAPI;

    public Conversor(String apiKey) {
        this.apiKey = apiKey;
        this.requisicaoAPI = new RequisicaoAPI();
    }

    public double converter(String de, String para, double valor) throws Exception {
        String json = requisicaoAPI.buscarCotacao(de, para, apiKey);
        JsonObject objeto = JsonParser.parseString(json).getAsJsonObject();
        double taxa = objeto.get("conversion_rate").getAsDouble();
        return valor * taxa;
    }
}
