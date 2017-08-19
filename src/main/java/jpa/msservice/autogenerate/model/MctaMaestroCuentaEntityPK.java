package jpa.msservice.autogenerate.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MctaMaestroCuentaEntityPK implements Serializable {
    private String entidad;
    private int idCuenta;

    @Column(name = "entidad")
    @Id
    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    @Column(name = "id_cuenta")
    @Id
    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MctaMaestroCuentaEntityPK that = (MctaMaestroCuentaEntityPK) o;

        if (idCuenta != that.idCuenta) return false;
        if (entidad != null ? !entidad.equals(that.entidad) : that.entidad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entidad != null ? entidad.hashCode() : 0;
        result = 31 * result + idCuenta;
        return result;
    }
}
