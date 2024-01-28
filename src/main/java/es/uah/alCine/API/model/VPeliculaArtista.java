package es.uah.alCine.API.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;

/**
 * Mapping for DB view
 */
@Entity
@Immutable
@Table(name = "v_pelicula_artista")
public class VPeliculaArtista {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ID_PELICULA", nullable = false)
    private Integer idPelicula;

    @Column(name = "TITULO", nullable = false, length = 45)
    private String titulo;

    @Column(name = "DURACION", nullable = false)
    private Integer duracion;

    @Column(name = "ID_PAIS", nullable = false)
    private Integer idPais;

    @Column(name = "ANO", nullable = false)
    private Integer ano;

    @Column(name = "ID_GENERO", nullable = false)
    private Integer idGenero;

    @Column(name = "SINOPSIS", length = 250)
    private String sinopsis;

    @Column(name = "PORTADA")
    private String portada;

    @Column(name = "ID_ARTISTA")
    private Integer idArtista;

    @Column(name = "NOMBRE", length = 45)
    private String nombre;

    @Column(name = "ID_TIPO_ARTISTA")
    private Integer idTipoArtista;

    @Column(name = "NOMBRE_GENERO", length = 45)
    private String nombreGenero;

    @Column(name = "NOMBRE_PAIS", length = 45)
    private String nombrePais;

    public Long getId() {
        return id;
    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public Integer getAno() {
        return ano;
    }

    public Integer getIdGenero() {
        return idGenero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getPortada() {
        return portada;
    }

    public Integer getIdArtista() {
        return idArtista;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getIdTipoArtista() {
        return idTipoArtista;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    protected VPeliculaArtista() {
    }
}