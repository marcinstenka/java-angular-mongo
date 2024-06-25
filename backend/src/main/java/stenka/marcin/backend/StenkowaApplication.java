package stenka.marcin.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import stenka.marcin.backend.todo.entity.Todo;

import java.util.Date;

@SpringBootApplication
public class StenkowaApplication {
    public static void main(String[] args) {
        SpringApplication.run(StenkowaApplication.class, args);
    }


}
