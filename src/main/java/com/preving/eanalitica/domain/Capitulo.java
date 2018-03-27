package com.preving.eanalitica.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "EA2_CAPITULOS", schema = "VS_2007", catalog = "")
public class Capitulo {
    private long id;
    private String capitulo;
    private int activo;
    private String descripcion;

    private Set<Parametro> parametros;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EA2_CAPITULOS_SQ")
    @SequenceGenerator(sequenceName = "ea2_capitulos_seq", allocationSize = 1, name = "EA2_CAPITULOS_SQ")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CAPITULO")
    public String getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(String capitulo) {
        this.capitulo = capitulo;
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
    @Column(name = "DESCRIPCION")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Capitulo that = (Capitulo) o;

        if (id != that.id) return false;
        if (activo != that.activo) return false;
        if (capitulo != null ? !capitulo.equals(that.capitulo) : that.capitulo != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (capitulo != null ? capitulo.hashCode() : 0);
        result = 31 * result + (int) (activo ^ (activo >>> 32));
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }


    @OneToMany(mappedBy = "capitulo")
    public Set<Parametro> getParametros() {
        return parametros;
    }

    public void setParametros(Set<Parametro> parametros) {
        this.parametros = parametros;
    }
}
