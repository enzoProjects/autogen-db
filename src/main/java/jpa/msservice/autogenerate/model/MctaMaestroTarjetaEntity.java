package jpa.msservice.autogenerate.model;

import javax.persistence.*;

@Entity
@Table(name = "mcta_maestro_tarjeta", schema = "admmcta", catalog = "dbcat")
@IdClass(MctaMaestroTarjetaEntityPK.class)
public class MctaMaestroTarjetaEntity {
    private String entidad;
    private int idTarjeta;
    private int idCuenta;
    private int idCliente;
    private Integer idClienteAdicional;

    @Id
    @Column(name = "entidad")
    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    @Id
    @Column(name = "id_tarjeta")
    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    @Basic
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
    @Column(name = "id_cliente_adicional")
    public Integer getIdClienteAdicional() {
        return idClienteAdicional;
    }

    public void setIdClienteAdicional(Integer idClienteAdicional) {
        this.idClienteAdicional = idClienteAdicional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MctaMaestroTarjetaEntity that = (MctaMaestroTarjetaEntity) o;

        if (idTarjeta != that.idTarjeta) return false;
        if (idCuenta != that.idCuenta) return false;
        if (idCliente != that.idCliente) return false;
        if (entidad != null ? !entidad.equals(that.entidad) : that.entidad != null) return false;
        if (idClienteAdicional != null ? !idClienteAdicional.equals(that.idClienteAdicional) : that.idClienteAdicional != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entidad != null ? entidad.hashCode() : 0;
        result = 31 * result + idTarjeta;
        result = 31 * result + idCuenta;
        result = 31 * result + idCliente;
        result = 31 * result + (idClienteAdicional != null ? idClienteAdicional.hashCode() : 0);
        return result;
    }
}
