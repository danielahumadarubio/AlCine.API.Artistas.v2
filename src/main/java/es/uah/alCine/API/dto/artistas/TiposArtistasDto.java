package es.uah.alCine.API.dto.artistas;

import es.uah.alCine.API.model.TipoArtista;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link TipoArtista}
 */
public class TiposArtistasDto implements Serializable {
    private Integer id;
    private String nombre;

    public TiposArtistasDto() {
    }

    public TiposArtistasDto(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TiposArtistasDto entity = (TiposArtistasDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.nombre, entity.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "nombre = " + nombre + ")";
    }
}