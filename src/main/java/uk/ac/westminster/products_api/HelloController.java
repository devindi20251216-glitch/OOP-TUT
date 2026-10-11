package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * Ttorial 1 controller.

 *   GET /goodbye  -> Activity 3: goodbye message
 *   GET /status   -> Stretch task: status message including today's date
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye from Spring Boot!";
    }

    @GetMapping("/status")
    public String status() {
        return "API running - " + LocalDate.now();
    }

}
