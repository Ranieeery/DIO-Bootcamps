package dev.raniery.dio.app;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

@Component
public class ConversorJson {

    private final Gson gson;

    public ConversorJson(Gson gson) {
        this.gson = gson;
    }

    public ViaCepResponse converter(String json) {
        return gson.fromJson(json, ViaCepResponse.class);
    }
}
