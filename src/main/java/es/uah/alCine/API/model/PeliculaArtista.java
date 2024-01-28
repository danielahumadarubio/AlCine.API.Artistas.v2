package es.uah.alCine.API.model;

import jakarta.persistence.*;

@Entity
@Table(name = "peliculas_artistas")
public class PeliculaArtista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @ManyToOne( optional = false)
    @JoinColumn(name = "ID_PELICULA", nullable = false)
    private Pelicula pelicula;

    @ManyToOne( optional = false)
    @JoinColumn(name = "ID_ARTISTA", nullable = false)
    private Artista artista;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Artista getActor() {
        return artista;
    }

    public void setIdActor(Artista artista) {
        this.artista = artista;
    }

}