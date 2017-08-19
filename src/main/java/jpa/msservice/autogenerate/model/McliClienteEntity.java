package jpa.msservice.autogenerate.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "mcli_cliente", schema = "admmcli", catalog = "dbcat")
@IdClass(McliClienteEntityPK.class)
public class McliClienteEntity {
    private String entidad;
    private int idCliente;
    private String codigoPaisEmisor;
    private String codigoTipoDocumento;
    private String documentoIdentificacion;
    private String digitoVerificador;
    private String codigoTipoCliente;
    private String codigoTipoRut;
    private String codigoCanalEntrada;
    private String codigoSistemaOrigen;
    private String codigoLeyNoMolestar;
    private String codigoLeyPublicidad;
    private String codigoLeyQuiebra;
    private String codigoLeySernac;
    private String codigoEstadoRiesgo;
    private String codigoSegmentoUnico;
    private String statusCodeCliente;
    private String poseeBeneficioColaborador;
    private String codigoEstadoCliente;
    private Date fechaEstadoCliente;
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
    @Column(name = "codigo_pais_emisor")
    public String getCodigoPaisEmisor() {
        return codigoPaisEmisor;
    }

    public void setCodigoPaisEmisor(String codigoPaisEmisor) {
        this.codigoPaisEmisor = codigoPaisEmisor;
    }

    @Basic
    @Column(name = "codigo_tipo_documento")
    public String getCodigoTipoDocumento() {
        return codigoTipoDocumento;
    }

    public void setCodigoTipoDocumento(String codigoTipoDocumento) {
        this.codigoTipoDocumento = codigoTipoDocumento;
    }

    @Basic
    @Column(name = "documento_identificacion")
    public String getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    public void setDocumentoIdentificacion(String documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
    }

    @Basic
    @Column(name = "digito_verificador")
    public String getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(String digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    @Basic
    @Column(name = "codigo_tipo_cliente")
    public String getCodigoTipoCliente() {
        return codigoTipoCliente;
    }

    public void setCodigoTipoCliente(String codigoTipoCliente) {
        this.codigoTipoCliente = codigoTipoCliente;
    }

    @Basic
    @Column(name = "codigo_tipo_rut")
    public String getCodigoTipoRut() {
        return codigoTipoRut;
    }

    public void setCodigoTipoRut(String codigoTipoRut) {
        this.codigoTipoRut = codigoTipoRut;
    }

    @Basic
    @Column(name = "codigo_canal_entrada")
    public String getCodigoCanalEntrada() {
        return codigoCanalEntrada;
    }

    public void setCodigoCanalEntrada(String codigoCanalEntrada) {
        this.codigoCanalEntrada = codigoCanalEntrada;
    }

    @Basic
    @Column(name = "codigo_sistema_origen")
    public String getCodigoSistemaOrigen() {
        return codigoSistemaOrigen;
    }

    public void setCodigoSistemaOrigen(String codigoSistemaOrigen) {
        this.codigoSistemaOrigen = codigoSistemaOrigen;
    }

    @Basic
    @Column(name = "codigo_ley_no_molestar")
    public String getCodigoLeyNoMolestar() {
        return codigoLeyNoMolestar;
    }

    public void setCodigoLeyNoMolestar(String codigoLeyNoMolestar) {
        this.codigoLeyNoMolestar = codigoLeyNoMolestar;
    }

    @Basic
    @Column(name = "codigo_ley_publicidad")
    public String getCodigoLeyPublicidad() {
        return codigoLeyPublicidad;
    }

    public void setCodigoLeyPublicidad(String codigoLeyPublicidad) {
        this.codigoLeyPublicidad = codigoLeyPublicidad;
    }

    @Basic
    @Column(name = "codigo_ley_quiebra")
    public String getCodigoLeyQuiebra() {
        return codigoLeyQuiebra;
    }

    public void setCodigoLeyQuiebra(String codigoLeyQuiebra) {
        this.codigoLeyQuiebra = codigoLeyQuiebra;
    }

    @Basic
    @Column(name = "codigo_ley_sernac")
    public String getCodigoLeySernac() {
        return codigoLeySernac;
    }

    public void setCodigoLeySernac(String codigoLeySernac) {
        this.codigoLeySernac = codigoLeySernac;
    }

    @Basic
    @Column(name = "codigo_estado_riesgo")
    public String getCodigoEstadoRiesgo() {
        return codigoEstadoRiesgo;
    }

    public void setCodigoEstadoRiesgo(String codigoEstadoRiesgo) {
        this.codigoEstadoRiesgo = codigoEstadoRiesgo;
    }

    @Basic
    @Column(name = "codigo_segmento_unico")
    public String getCodigoSegmentoUnico() {
        return codigoSegmentoUnico;
    }

    public void setCodigoSegmentoUnico(String codigoSegmentoUnico) {
        this.codigoSegmentoUnico = codigoSegmentoUnico;
    }

    @Basic
    @Column(name = "status_code_cliente")
    public String getStatusCodeCliente() {
        return statusCodeCliente;
    }

    public void setStatusCodeCliente(String statusCodeCliente) {
        this.statusCodeCliente = statusCodeCliente;
    }

    @Basic
    @Column(name = "posee_beneficio_colaborador")
    public String getPoseeBeneficioColaborador() {
        return poseeBeneficioColaborador;
    }

    public void setPoseeBeneficioColaborador(String poseeBeneficioColaborador) {
        this.poseeBeneficioColaborador = poseeBeneficioColaborador;
    }

    @Basic
    @Column(name = "codigo_estado_cliente")
    public String getCodigoEstadoCliente() {
        return codigoEstadoCliente;
    }

    public void setCodigoEstadoCliente(String codigoEstadoCliente) {
        this.codigoEstadoCliente = codigoEstadoCliente;
    }

    @Basic
    @Column(name = "fecha_estado_cliente")
    public Date getFechaEstadoCliente() {
        return fechaEstadoCliente;
    }

    public void setFechaEstadoCliente(Date fechaEstadoCliente) {
        this.fechaEstadoCliente = fechaEstadoCliente;
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

        McliClienteEntity that = (McliClienteEntity) o;

        if (idCliente != that.idCliente) return false;
        if (entidad != null ? !entidad.equals(that.entidad) : that.entidad != null) return false;
        if (codigoPaisEmisor != null ? !codigoPaisEmisor.equals(that.codigoPaisEmisor) : that.codigoPaisEmisor != null)
            return false;
        if (codigoTipoDocumento != null ? !codigoTipoDocumento.equals(that.codigoTipoDocumento) : that.codigoTipoDocumento != null)
            return false;
        if (documentoIdentificacion != null ? !documentoIdentificacion.equals(that.documentoIdentificacion) : that.documentoIdentificacion != null)
            return false;
        if (digitoVerificador != null ? !digitoVerificador.equals(that.digitoVerificador) : that.digitoVerificador != null)
            return false;
        if (codigoTipoCliente != null ? !codigoTipoCliente.equals(that.codigoTipoCliente) : that.codigoTipoCliente != null)
            return false;
        if (codigoTipoRut != null ? !codigoTipoRut.equals(that.codigoTipoRut) : that.codigoTipoRut != null)
            return false;
        if (codigoCanalEntrada != null ? !codigoCanalEntrada.equals(that.codigoCanalEntrada) : that.codigoCanalEntrada != null)
            return false;
        if (codigoSistemaOrigen != null ? !codigoSistemaOrigen.equals(that.codigoSistemaOrigen) : that.codigoSistemaOrigen != null)
            return false;
        if (codigoLeyNoMolestar != null ? !codigoLeyNoMolestar.equals(that.codigoLeyNoMolestar) : that.codigoLeyNoMolestar != null)
            return false;
        if (codigoLeyPublicidad != null ? !codigoLeyPublicidad.equals(that.codigoLeyPublicidad) : that.codigoLeyPublicidad != null)
            return false;
        if (codigoLeyQuiebra != null ? !codigoLeyQuiebra.equals(that.codigoLeyQuiebra) : that.codigoLeyQuiebra != null)
            return false;
        if (codigoLeySernac != null ? !codigoLeySernac.equals(that.codigoLeySernac) : that.codigoLeySernac != null)
            return false;
        if (codigoEstadoRiesgo != null ? !codigoEstadoRiesgo.equals(that.codigoEstadoRiesgo) : that.codigoEstadoRiesgo != null)
            return false;
        if (codigoSegmentoUnico != null ? !codigoSegmentoUnico.equals(that.codigoSegmentoUnico) : that.codigoSegmentoUnico != null)
            return false;
        if (statusCodeCliente != null ? !statusCodeCliente.equals(that.statusCodeCliente) : that.statusCodeCliente != null)
            return false;
        if (poseeBeneficioColaborador != null ? !poseeBeneficioColaborador.equals(that.poseeBeneficioColaborador) : that.poseeBeneficioColaborador != null)
            return false;
        if (codigoEstadoCliente != null ? !codigoEstadoCliente.equals(that.codigoEstadoCliente) : that.codigoEstadoCliente != null)
            return false;
        if (fechaEstadoCliente != null ? !fechaEstadoCliente.equals(that.fechaEstadoCliente) : that.fechaEstadoCliente != null)
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
        result = 31 * result + (codigoPaisEmisor != null ? codigoPaisEmisor.hashCode() : 0);
        result = 31 * result + (codigoTipoDocumento != null ? codigoTipoDocumento.hashCode() : 0);
        result = 31 * result + (documentoIdentificacion != null ? documentoIdentificacion.hashCode() : 0);
        result = 31 * result + (digitoVerificador != null ? digitoVerificador.hashCode() : 0);
        result = 31 * result + (codigoTipoCliente != null ? codigoTipoCliente.hashCode() : 0);
        result = 31 * result + (codigoTipoRut != null ? codigoTipoRut.hashCode() : 0);
        result = 31 * result + (codigoCanalEntrada != null ? codigoCanalEntrada.hashCode() : 0);
        result = 31 * result + (codigoSistemaOrigen != null ? codigoSistemaOrigen.hashCode() : 0);
        result = 31 * result + (codigoLeyNoMolestar != null ? codigoLeyNoMolestar.hashCode() : 0);
        result = 31 * result + (codigoLeyPublicidad != null ? codigoLeyPublicidad.hashCode() : 0);
        result = 31 * result + (codigoLeyQuiebra != null ? codigoLeyQuiebra.hashCode() : 0);
        result = 31 * result + (codigoLeySernac != null ? codigoLeySernac.hashCode() : 0);
        result = 31 * result + (codigoEstadoRiesgo != null ? codigoEstadoRiesgo.hashCode() : 0);
        result = 31 * result + (codigoSegmentoUnico != null ? codigoSegmentoUnico.hashCode() : 0);
        result = 31 * result + (statusCodeCliente != null ? statusCodeCliente.hashCode() : 0);
        result = 31 * result + (poseeBeneficioColaborador != null ? poseeBeneficioColaborador.hashCode() : 0);
        result = 31 * result + (codigoEstadoCliente != null ? codigoEstadoCliente.hashCode() : 0);
        result = 31 * result + (fechaEstadoCliente != null ? fechaEstadoCliente.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (fechaUltActualizacion != null ? fechaUltActualizacion.hashCode() : 0);
        result = 31 * result + (idUsuario != null ? idUsuario.hashCode() : 0);
        return result;
    }
}
