package jpa.msservice.autogenerate.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "mcli_empresa", schema = "admmcli", catalog = "dbcat")
@IdClass(McliEmpresaEntityPK.class)
public class McliEmpresaEntity {
    private String entidad;
    private int idCliente;
    private String razonSocial;
    private String nombreFantasia;
    private Date fechaEscritura;
    private String codigoPaisOffPrincipal;
    private String empresaRelacionada;
    private String codigoRubro;
    private String codigoEstadoEmpresa;
    private Date fechaEstadoEmpresa;
    private Date fechaCreacion;
    private Date fechaUltActualizacion;
    private Integer idUsuario;

    @Id
    @Column(name = "entidad")
    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    @Id
    @Column(name = "id_cliente")
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Basic
    @Column(name = "razon_social")
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Basic
    @Column(name = "nombre_fantasia")
    public String getNombreFantasia() {
        return nombreFantasia;
    }

    public void setNombreFantasia(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }

    @Basic
    @Column(name = "fecha_escritura")
    public Date getFechaEscritura() {
        return fechaEscritura;
    }

    public void setFechaEscritura(Date fechaEscritura) {
        this.fechaEscritura = fechaEscritura;
    }

    @Basic
    @Column(name = "codigo_pais_off_principal")
    public String getCodigoPaisOffPrincipal() {
        return codigoPaisOffPrincipal;
    }

    public void setCodigoPaisOffPrincipal(String codigoPaisOffPrincipal) {
        this.codigoPaisOffPrincipal = codigoPaisOffPrincipal;
    }

    @Basic
    @Column(name = "empresa_relacionada")
    public String getEmpresaRelacionada() {
        return empresaRelacionada;
    }

    public void setEmpresaRelacionada(String empresaRelacionada) {
        this.empresaRelacionada = empresaRelacionada;
    }

    @Basic
    @Column(name = "codigo_rubro")
    public String getCodigoRubro() {
        return codigoRubro;
    }

    public void setCodigoRubro(String codigoRubro) {
        this.codigoRubro = codigoRubro;
    }

    @Basic
    @Column(name = "codigo_estado_empresa")
    public String getCodigoEstadoEmpresa() {
        return codigoEstadoEmpresa;
    }

    public void setCodigoEstadoEmpresa(String codigoEstadoEmpresa) {
        this.codigoEstadoEmpresa = codigoEstadoEmpresa;
    }

    @Basic
    @Column(name = "fecha_estado_empresa")
    public Date getFechaEstadoEmpresa() {
        return fechaEstadoEmpresa;
    }

    public void setFechaEstadoEmpresa(Date fechaEstadoEmpresa) {
        this.fechaEstadoEmpresa = fechaEstadoEmpresa;
    }

    @Basic
    @Column(name = "fecha_creacion")
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Basic
    @Column(name = "fecha_ult_actualizacion")
    public Date getFechaUltActualizacion() {
        return fechaUltActualizacion;
    }

    public void setFechaUltActualizacion(Date fechaUltActualizacion) {
        this.fechaUltActualizacion = fechaUltActualizacion;
    }

    @Basic
    @Column(name = "id_usuario")
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        McliEmpresaEntity that = (McliEmpresaEntity) o;

        if (idCliente != that.idCliente) return false;
        if (entidad != null ? !entidad.equals(that.entidad) : that.entidad != null) return false;
        if (razonSocial != null ? !razonSocial.equals(that.razonSocial) : that.razonSocial != null) return false;
        if (nombreFantasia != null ? !nombreFantasia.equals(that.nombreFantasia) : that.nombreFantasia != null)
            return false;
        if (fechaEscritura != null ? !fechaEscritura.equals(that.fechaEscritura) : that.fechaEscritura != null)
            return false;
        if (codigoPaisOffPrincipal != null ? !codigoPaisOffPrincipal.equals(that.codigoPaisOffPrincipal) : that.codigoPaisOffPrincipal != null)
            return false;
        if (empresaRelacionada != null ? !empresaRelacionada.equals(that.empresaRelacionada) : that.empresaRelacionada != null)
            return false;
        if (codigoRubro != null ? !codigoRubro.equals(that.codigoRubro) : that.codigoRubro != null) return false;
        if (codigoEstadoEmpresa != null ? !codigoEstadoEmpresa.equals(that.codigoEstadoEmpresa) : that.codigoEstadoEmpresa != null)
            return false;
        if (fechaEstadoEmpresa != null ? !fechaEstadoEmpresa.equals(that.fechaEstadoEmpresa) : that.fechaEstadoEmpresa != null)
            return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(that.fechaCreacion) : that.fechaCreacion != null)
            return false;
        if (fechaUltActualizacion != null ? !fechaUltActualizacion.equals(that.fechaUltActualizacion) : that.fechaUltActualizacion != null)
            return false;
        if (idUsuario != null ? !idUsuario.equals(that.idUsuario) : that.idUsuario != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entidad != null ? entidad.hashCode() : 0;
        result = 31 * result + idCliente;
        result = 31 * result + (razonSocial != null ? razonSocial.hashCode() : 0);
        result = 31 * result + (nombreFantasia != null ? nombreFantasia.hashCode() : 0);
        result = 31 * result + (fechaEscritura != null ? fechaEscritura.hashCode() : 0);
        result = 31 * result + (codigoPaisOffPrincipal != null ? codigoPaisOffPrincipal.hashCode() : 0);
        result = 31 * result + (empresaRelacionada != null ? empresaRelacionada.hashCode() : 0);
        result = 31 * result + (codigoRubro != null ? codigoRubro.hashCode() : 0);
        result = 31 * result + (codigoEstadoEmpresa != null ? codigoEstadoEmpresa.hashCode() : 0);
        result = 31 * result + (fechaEstadoEmpresa != null ? fechaEstadoEmpresa.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (fechaUltActualizacion != null ? fechaUltActualizacion.hashCode() : 0);
        result = 31 * result + (idUsuario != null ? idUsuario.hashCode() : 0);
        return result;
    }
}
