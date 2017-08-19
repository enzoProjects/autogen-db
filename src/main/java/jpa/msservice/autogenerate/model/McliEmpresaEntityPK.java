package jpa.msservice.autogenerate.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class McliEmpresaEntityPK implements Serializable {
    private String entidad;
    private int idCliente;

    @Column(name = "entidad")
    @Id
    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    @Column(name = "id_cliente")
    @Id
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        McliEmpresaEntityPK that = (McliEmpresaEntityPK) o;

        if (idCliente != that.idCliente) return false;
        if (entidad != null ? !entidad.equals(that.entidad) : that.entidad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entidad != null ? entidad.hashCode() : 0;
        result = 31 * result + idCliente;
        return result;
    }
}
