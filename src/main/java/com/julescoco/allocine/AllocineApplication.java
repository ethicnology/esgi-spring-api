package com.julescoco.allocine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class AllocineApplication {
    public static void main(String[] args) {
        SpringApplication.run(AllocineApplication.class, args);
    }
    @Autowired
    private FilmRepository filmRepository;
    @GetMapping("/hello")
    public @ResponseBody Iterable<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    @PostMapping("add")
    public @ResponseBody String addFilm(@Reque)
}
