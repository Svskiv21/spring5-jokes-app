package guru.springframework.spring5jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class ChuckNorrisQuotesService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisQuotesService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String Joke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
