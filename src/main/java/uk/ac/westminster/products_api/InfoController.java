package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Stretch task: a second controller exposing application information.
 *   GET /info -> a String describing the application
 */

@RestController
public class InfoController {

    @GetMapping("/info")
    public String info() {
        return "Products API - Tutorial 1 Spring Boot application.";
    }

}
