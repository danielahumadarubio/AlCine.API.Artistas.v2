package es.uah.alCine.API.model;

import jakarta.persistence.*;

@Entity
@Table(name = "peliculas")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "TITULO", nullable = false, length = 45)
    private String titulo;

    @Column(name = "DURACION", nullable = false)
    private Integer duracion;


    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_PAIS", nullable = false)
    private Pais pais;

    @Column(name = "ANO", nullable = false)
    private Integer ano;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_GENERO", nullable = false)
    private Genero genero;

    @Column(name = "SINOPSIS", length = 250)
    private String sinopsis;

    @Column(name = "PORTADA", length = 250)
    private String portada;

    @Column(name = "NUM_OSCARS", nullable = true)
    private Integer numOscars;

    public Integer getnumOscars() {
        return numOscars;
    }

    public void setnumOscars(Integer numOscars) {
        this.numOscars = numOscars;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }


    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

}