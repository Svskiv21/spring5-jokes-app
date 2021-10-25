package guru.springframework.spring5jokesapp;

import guru.springframework.spring5jokesapp.controllers.JokesController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5JokesAppApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring5JokesAppApplication.class, args);

        JokesController jokesController = ctx.getBean("jokesController", JokesController.class);
        System.out.println("Fist joke time: ");
        System.out.println(jokesController.getJoke());
    }

}
