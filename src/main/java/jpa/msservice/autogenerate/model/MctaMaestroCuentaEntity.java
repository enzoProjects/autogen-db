package jpa.msservice.autogenerate.model;

import javax.persistence.*;

@Entity
@Table(name = "mcta_maestro_cuenta", schema = "admmcta", catalog = "dbcat")
@IdClass(MctaMaestroCuentaEntityPK.class)
public class MctaMaestroCuentaEntity {
    private String entidad;
    private int idCuenta;
    private int idCliente;
    private String indicadorVigente;

    @Id
    @Column(name = "entidad")
    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    @Id
    @Column(name = "id_cuenta")
    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    @Basic
    @Column(name = "id_cliente")
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Basic
    @Column(name = "indicador_vigente")
    public String getIndicadorVigente() {
        return indicadorVigente;
    }

    public void setIndicadorVigente(String indicadorVigente) {
        this.indicadorVigente = indicadorVigente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MctaMaestroCuentaEntity that = (MctaMaestroCuentaEntity) o;

        if (idCuenta != that.idCuenta) return false;
        if (idCliente != that.idCliente) return false;
        if (entidad != null ? !entidad.equals(that.entidad) : that.entidad != null) return false;
        if (indicadorVigente != null ? !indicadorVigente.equals(that.indicadorVigente) : that.indicadorVigente != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entidad != null ? entidad.hashCode() : 0;
        result = 31 * result + idCuenta;
        result = 31 * result + idCliente;
        result = 31 * result + (indicadorVigente != null ? indicadorVigente.hashCode() : 0);
        return result;
    }
}
