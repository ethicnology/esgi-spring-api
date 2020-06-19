package com.julescoco.allocine;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FilmRepository extends CrudRepository<Film, Integer> {
    Film findByTitre(String title);
    Film findByFilmid(Integer id);
}
