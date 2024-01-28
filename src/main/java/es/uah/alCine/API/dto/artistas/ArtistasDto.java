package es.uah.alCine.API.dto.artistas;

import es.uah.alCine.API.dto.shared.PaisesDto;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * DTO for {@link es.uah.alCine.model.Artistas}
 */
public class ArtistasDto implements Serializable {

    private Integer id;
    private String nombre;
    private Instant nacimiento;
    private PaisesDto pais;
    private TiposArtistasDto tipoArtista;

    public ArtistasDto() {
    }

    public ArtistasDto(Integer id, String nombre, Instant nacimiento, PaisesDto pais, TiposArtistasDto tipoArtista) {
        this.id = id;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.pais = pais;
        this.tipoArtista = tipoArtista;
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

    public PaisesDto getPais() {
        return pais;
    }

    public void setPais(PaisesDto pais) {
        this.pais = pais;
    }

    public TiposArtistasDto getTipoArtista() {
        return tipoArtista;
    }

    public void setTipoArtista(TiposArtistasDto tipoArtista) {
        this.tipoArtista = tipoArtista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArtistasDto entity = (ArtistasDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.nombre, entity.nombre) &&
                Objects.equals(this.nacimiento, entity.nacimiento) &&
                Objects.equals(this.pais, entity.pais) &&
                Objects.equals(this.tipoArtista, entity.tipoArtista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, nacimiento, pais, tipoArtista);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "nombre = " + nombre + ", " +
                "nacimiento = " + nacimiento + ", " +
                "pais = " + pais + ", " +
                "tipoArtista = " + tipoArtista + ")";
    }
}