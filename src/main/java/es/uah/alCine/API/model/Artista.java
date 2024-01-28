package es.uah.alCine.API.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "artistas")
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "NOMBRE", nullable = false, length = 45)
    private String nombre;

    @Column(name = "NACIMIENTO", nullable = false)
    private Instant nacimiento;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_PAIS", nullable = false)
    private Pais pais;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_TIPO_ARTISTA", nullable = false)
    private TipoArtista tipoArtista;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Instant getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Instant nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public TipoArtista getTipoArtista() {
        return tipoArtista;
    }

    public void setTipoArtista(TipoArtista tipoArtista) {
        this.tipoArtista = tipoArtista;
    }

}