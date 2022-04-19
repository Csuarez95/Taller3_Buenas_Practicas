package com.company.Classes;

import java.time.LocalDate;

/**
 * Clase abstracta para los atributos y métodos correspondientes a la canción.
 * @author Cristian Suárez Acosta
 */

public abstract class Song {

    /**
     * Atributos de la clase.
     */
    private String title;
    private int id;
    private LocalDate date;
    private int duration;
    private String genre;
    private String cover;
    private String description;

    /**
     * Constructor para acceder a cada una de los atributos.
     * @param title Atributo para guardar el título
     * @param id Atributo para guardar la identificación
     * @param date Atributo para guardar la fecha
     * @param duration Atributo para guardar la duración.
     * @param genre Atributo para guardar el género musical.
     * @param cover Atributo para guardar la portada.
     * @param description Atributo para guardar la descripción de la canción.
     */
    public Song(
            String title,
            int id,
            LocalDate date,
            int duration,
            String genre,
            String cover,
            String description)
    {
        this.title = title;
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    } //Cierre del constructor

    /**
     * Método para retornar el titulo capturado.
     * @return Título de la canción.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Método que solicita el título de la canción
     * @param title Atributo para asignación del título.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Método para retornar el ID capturado.
     * @return ID de la canción.
     */
    public int getId() {
        return id;
    }

    /**
     * Método que solicita el ID de la canción
     * @param id Atributo para asignación del ID.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método para retornar la fecha capturada.
     * @return Fecha de la canción.
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Método que solicita la fecha de la canción
     * @param date Atributo para asignación de la fecha.
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Método para retornar la duración capturada.
     * @return Duración de la canción.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Método que solicita la duración de la canción
     * @param duration Atributo para asignación de la duración.
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Método para retornar el género musical capturado.
     * @return Género de la canción
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Método que solicita el género de la canción
     * @param genre Atributo para asignación del género.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Método para retornar la portada capturada.
     * @return Portada de la canción
     */
    public String getCover() {
        return cover;
    }

    /**
     * Método que solicita la portada de la canción
     * @param cover Atributo para asignación de la portada.
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * Método para retornar la portada capturada.
     * @return Descripción de la canción
     */
    public String getDescription() {
        return description;
    }

    /**
     * Método que solicita la descripción de la canción
     * @param description Atributo para asignación de la descripción.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Método para convertir a String los objetos de la canción.
     * @return Características de la canción.
     */
    @Override
    public String toString() {
        return "Song " + id + ": " +
                "Título: " + title +
                ", Fecha: " + date +
                ", Duración: " + duration +
                ", Género: " + genre +
                ", Portada: " + cover +
                ", Descripción " + description;
    } //Cierre del método toString.
} //Cierre de la clase Song

