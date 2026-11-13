package uk.ac.westminster.products_api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }
    @GetMapping("/student")
    public String student() {
        return "My name is Kamal";
    }

    @GetMapping("/course")
    public String course() {
        return "Object Oriented Programming";
    }
    @GetMapping("/goodbye")
        public String goodbye(){
            return "Goodbye from Spring Boot";
        }
    }
