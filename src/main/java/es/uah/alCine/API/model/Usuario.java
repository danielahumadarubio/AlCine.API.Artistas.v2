package es.uah.alCine.API.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "NOMBRE", nullable = false, length = 45)
    private String nombre;

    @Column(name = "NACIMIENTO", nullable = false)
    private Instant nacimiento;

    @ManyToOne( optional = false)
    @JoinColumn(name = "ID_PAIS", nullable = false)
    private Pais pais;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_ROL", nullable = false)
    private Rol rol;

    @Column(name = "PASSWORD", nullable = false, length = 60)
    private String password;

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

    public void setIdPais(Pais pais) {
        this.pais = pais;
    }

    public Rol getRol() {
        return rol;
    }

    public void setIdRol(Rol rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}