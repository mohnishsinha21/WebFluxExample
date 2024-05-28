package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

// navigate to http://localhost:8082/
@SpringBootApplication
public class WebFluxSample {

    public static void main(String[] args) {
        SpringApplication.run(WebFluxSample.class, args);
    }

    @RestController
    class TestController {

        @GetMapping("/")
        public Mono<String> hello() {
            return Mono.just("Hello, WebFlux!");
        }
    }
}
