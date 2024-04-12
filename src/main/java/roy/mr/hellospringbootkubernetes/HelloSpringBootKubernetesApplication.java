package roy.mr.hellospringbootkubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloSpringBootKubernetesApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBootKubernetesApplication.class, args);
    }

    @GetMapping
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/exit")
    public void exit() {
        System.exit(500);
    }
}
