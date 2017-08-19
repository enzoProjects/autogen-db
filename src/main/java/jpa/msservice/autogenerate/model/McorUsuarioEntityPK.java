package jpa.msservice.autogenerate.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class McorUsuarioEntityPK implements Serializable {
    private String entidad;
    private int idUsuario;

    @Column(name = "entidad")
    @Id
    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    @Column(name = "id_usuario")
    @Id
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        McorUsuarioEntityPK that = (McorUsuarioEntityPK) o;

        if (idUsuario != that.idUsuario) return false;
        if (entidad != null ? !entidad.equals(that.entidad) : that.entidad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entidad != null ? entidad.hashCode() : 0;
        result = 31 * result + idUsuario;
        return result;
    }
}
