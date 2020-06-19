package com.julescoco.allocine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Film {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer film_id;

    private String film_titre;
    private String film_url_affiche;
    private String film_datesortie;
    private String film_duree;
    private Integer film_court;
    private Integer film_anneeproduction;
    private String film_synopsis;
    private Integer film_etoilespresse;
    private Integer film_etoilesspectateurs;
    private String film_info;
    private String film_genre;
    private String film_public;
    private String film_remake;
    private String film_titreoriginal;
    private String film_distribuepar;

    public Integer getFilm_id() {
        return film_id;
    }

    public void setFilm_id(Integer film_id) {
        this.film_id = film_id;
    }

    public String getFilm_titre() {
        return film_titre;
    }

    public void setFilm_titre(String film_titre) {
        this.film_titre = film_titre;
    }

    public String getFilm_url_affiche() {
        return film_url_affiche;
    }

    public void setFilm_url_affiche(String film_url_affiche) {
        this.film_url_affiche = film_url_affiche;
    }

    public String getFilm_datesortie() {
        return film_datesortie;
    }

    public void setFilm_datesortie(String film_datesortie) {
        this.film_datesortie = film_datesortie;
    }

    public String getFilm_duree() {
        return film_duree;
    }

    public void setFilm_duree(String film_duree) {
        this.film_duree = film_duree;
    }

    public Integer getFilm_court() {
        return film_court;
    }

    public void setFilm_court(Integer film_court) {
        this.film_court = film_court;
    }

    public Integer getFilm_anneeproduction() {
        return film_anneeproduction;
    }

    public void setFilm_anneeproduction(Integer film_anneeproduction) {
        this.film_anneeproduction = film_anneeproduction;
    }

    public String getFilm_synopsis() {
        return film_synopsis;
    }

    public void setFilm_synopsis(String film_synopsis) {
        this.film_synopsis = film_synopsis;
    }

    public Integer getFilm_etoilespresse() {
        return film_etoilespresse;
    }

    public void setFilm_etoilespresse(Integer film_etoilespresse) {
        this.film_etoilespresse = film_etoilespresse;
    }

    public Integer getFilm_etoilesspectateurs() {
        return film_etoilesspectateurs;
    }

    public void setFilm_etoilesspectateurs(Integer film_etoilesspectateurs) {
        this.film_etoilesspectateurs = film_etoilesspectateurs;
    }

    public String getFilm_info() {
        return film_info;
    }

    public void setFilm_info(String film_info) {
        this.film_info = film_info;
    }

    public String getFilm_genre() {
        return film_genre;
    }

    public void setFilm_genre(String film_genre) {
        this.film_genre = film_genre;
    }

    public String getFilm_public() {
        return film_public;
    }

    public void setFilm_public(String film_public) {
        this.film_public = film_public;
    }

    public String getFilm_remake() {
        return film_remake;
    }

    public void setFilm_remake(String film_remake) {
        this.film_remake = film_remake;
    }

    public String getFilm_titreoriginal() {
        return film_titreoriginal;
    }

    public void setFilm_titreoriginal(String film_titreoriginal) {
        this.film_titreoriginal = film_titreoriginal;
    }

    public String getFilm_distribuepar() {
        return film_distribuepar;
    }

    public void setFilm_distribuepar(String film_distribuepar) {
        this.film_distribuepar = film_distribuepar;
    }
}
