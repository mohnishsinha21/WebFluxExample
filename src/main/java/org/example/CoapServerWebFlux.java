package org.example;

import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.server.resources.CoapExchange;
import org.eclipse.californium.core.CoapResource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoapServerWebFlux implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CoapServerWebFlux.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        CoapServer server = new CoapServer();
        server.add(new CoapResource("hello") {
            @Override
            public void handleGET(CoapExchange exchange) {
                exchange.respond("Hello, CoAP from WebFlux!");
            }
        });
        server.start();
    }
}

