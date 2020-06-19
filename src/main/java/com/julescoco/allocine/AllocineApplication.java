package com.julescoco.allocine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class AllocineApplication {
    private static final Logger log = LoggerFactory.getLogger(AllocineApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(AllocineApplication.class, args);
    }

    @Autowired
    private FilmRepository filmRepository;

    @GetMapping("/films")
    public @ResponseBody Iterable<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    @GetMapping("/film/avis")
    public @ResponseBody String getAvisFrom(@RequestParam Integer id) {
        Film search = filmRepository.findByFilmid(id);
        return "{ \"avis_spec\":" + search.getFilm_etoilesspectateurs()+ ", \"avis_press\":" + search.getFilm_etoilespresse()+ "}";
    }

    @DeleteMapping("/film/delete")
    public @ResponseBody String deleteFilm(@RequestParam Integer film_id) {
        Film film = filmRepository.findByFilmid(film_id);
        String film_title = filmRepository.findByFilmid(film_id).getTitre();
        filmRepository.delete(film);
        return film_title + " deleted";
    }

    @PutMapping("/film/edit")
    public @ResponseBody String editFilm(@RequestParam Integer film_id,
                                        @RequestParam String film_titre,
                                        @RequestParam String film_url_affiche,
                                        @RequestParam String film_datesortie,
                                        @RequestParam String film_duree,
                                        @RequestParam Integer film_court,
                                        @RequestParam Integer film_anneeproduction,
                                        @RequestParam String film_synopsis,
                                        @RequestParam Integer film_etoilespresse,
                                        @RequestParam Integer film_etoilesspectateurs,
                                        @RequestParam Integer film_info,
                                        @RequestParam String film_genre,
                                        @RequestParam String film_public,
                                        @RequestParam String film_remake,
                                        @RequestParam String film_titreoriginal,
                                        @RequestParam String film_distribuepar) {
        Film film = filmRepository.findByFilmid(film_id);
        film.setTitre(film_titre);
        film.setFilm_url_affiche(film_url_affiche);
        film.setFilm_datesortie(film_datesortie);
        film.setFilm_duree(film_duree);
        film.setFilm_court(film_court);
        film.setFilm_anneeproduction(film_anneeproduction);
        film.setFilm_synopsis(film_synopsis);
        film.setFilm_etoilespresse(film_etoilespresse);
        film.setFilm_etoilesspectateurs(film_etoilesspectateurs);
        film.setFilm_info(film_info);
        film.setFilm_genre(film_genre);
        film.setFilm_public(film_public);
        film.setFilm_remake(film_remake);
        film.setFilm_titreoriginal(film_titreoriginal);
        film.setFilm_distribuepar(film_distribuepar);
        filmRepository.save(film);
        return film_titre + " edited";
    }

    @PostMapping("/film/add")
    public @ResponseBody String addFilm(@RequestParam String film_titre,
                                        @RequestParam String film_url_affiche,
                                        @RequestParam String film_datesortie,
                                        @RequestParam String film_duree,
                                        @RequestParam Integer film_court,
                                        @RequestParam Integer film_anneeproduction,
                                        @RequestParam String film_synopsis,
                                        @RequestParam Integer film_etoilespresse,
                                        @RequestParam Integer film_etoilesspectateurs,
                                        @RequestParam Integer film_info,
                                        @RequestParam String film_genre,
                                        @RequestParam String film_public,
                                        @RequestParam String film_remake,
                                        @RequestParam String film_titreoriginal,
                                        @RequestParam String film_distribuepar) {
        Film film = new Film();
        film.setTitre(film_titre);
        film.setFilm_url_affiche(film_url_affiche);
        film.setFilm_datesortie(film_datesortie);
        film.setFilm_duree(film_duree);
        film.setFilm_court(film_court);
        film.setFilm_anneeproduction(film_anneeproduction);
        film.setFilm_synopsis(film_synopsis);
        film.setFilm_etoilespresse(film_etoilespresse);
        film.setFilm_etoilesspectateurs(film_etoilesspectateurs);
        film.setFilm_info(film_info);
        film.setFilm_genre(film_genre);
        film.setFilm_public(film_public);
        film.setFilm_remake(film_remake);
        film.setFilm_titreoriginal(film_titreoriginal);
        film.setFilm_distribuepar(film_distribuepar);
        filmRepository.save(film);
        return film.getFilm_id() + " added";
    }
}
