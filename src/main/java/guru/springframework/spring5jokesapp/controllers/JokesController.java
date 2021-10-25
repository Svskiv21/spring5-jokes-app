package guru.springframework.spring5jokesapp.controllers;

import guru.springframework.spring5jokesapp.services.ChuckNorrisQuotesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {
    private final ChuckNorrisQuotesService chuckNorrisQuotesService;

    public JokesController(ChuckNorrisQuotesService chuckNorrisQuotesService) {
        this.chuckNorrisQuotesService = chuckNorrisQuotesService;
    }

    @GetMapping("/")
    public String getJoke(){
        return chuckNorrisQuotesService.Joke();
    }
}
