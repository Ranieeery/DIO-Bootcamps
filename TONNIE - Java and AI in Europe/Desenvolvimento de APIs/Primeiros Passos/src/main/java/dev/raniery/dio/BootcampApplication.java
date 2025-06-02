package dev.raniery.dio;

import com.google.gson.Gson;
import dev.raniery.dio.app.ConversorJson;
import dev.raniery.dio.app.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootcampApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootcampApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(ConversorJson conversor) throws Exception {
        return args -> {
            String json = "{\"cep\": \"00001-001\",\"logradouro\": \"Praça XV\", \"localidade\": \"Rio de Janeiro\"}";
            ViaCepResponse response = conversor.converter(json);
            System.out.println("Dados CEP: " + response);
        };
    }
}
