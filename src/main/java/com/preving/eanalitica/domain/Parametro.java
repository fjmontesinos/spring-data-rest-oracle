package com.preving.eanalitica.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "EA2_PARAMETROS", schema = "VS_2007", catalog = "")
public class Parametro {
    private long id;
    private String codigo;
    private String nombre;
    private int activo;
    private double precio;
    private Set<Perfil> perfiles;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EA2_PARAMETRO_SQ")
    @SequenceGenerator(sequenceName = "ea2_parametros_seq", allocationSize = 1, name = "EA2_PARAMETRO_SQ")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CODIGO")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "NOMBRE")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "ACTIVO")
    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    @Basic
    @Column(name = "PRECIO")
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parametro that = (Parametro) o;

        if (id != that.id) return false;
        if (activo != that.activo) return false;
        if (precio != that.precio) return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (int) (activo ^ (activo >>> 32));
        //result = 31 * result + (int) (precio ^ (precio >>> 32));
        return result;
    }

    @ManyToMany
    @JoinTable(name = "EA2_PERFILES_X_PARAMETROS", catalog = "", schema = "VS_2007", joinColumns = @JoinColumn(name = "PARAMETRO_ID", referencedColumnName = "ID", nullable = false), inverseJoinColumns = @JoinColumn(name = "PERFIL_ID", referencedColumnName = "ID", nullable = false))
    public Set<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(Set<Perfil> perfiles) {
        this.perfiles = perfiles;
    }
}
