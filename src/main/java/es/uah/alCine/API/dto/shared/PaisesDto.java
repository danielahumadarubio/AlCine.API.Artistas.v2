package es.uah.alCine.API.dto.shared;

import es.uah.alCine.API.model.Pais;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link Pais}
 */
public class PaisesDto implements Serializable {
    private Integer id;
    private String nombre;

    public PaisesDto() {
    }

    public PaisesDto(Integer id, String nombre) {
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
        PaisesDto entity = (PaisesDto) o;
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