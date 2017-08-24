package jpa.msservice.autogenerate.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;

@Entity
@Table(name = "mcta_maestro_tarjeta", schema = "admmcta", catalog = "dbcat")
@IdClass(MctaMaestroTarjetaEntityPK.class)
public class MctaMaestroTarjetaEntity {
    private String entidad;
    private int idTarjeta;
    private int idCuenta;
    private int idCliente;
    private Integer idClienteAdicional;
    private String numeroCuenta;
    private String numeroTarjeta;
    private String tipoTarjeta;
    private Integer numeroDelAdicional;
    private String nombreDelAdicional;
    private Integer rutAdicional;
    private String dvRutAdicional;
    private Date fechaApertura;
    private BigInteger estadoTarjeta;
    private Date fechaActivacion;
    private String codigoBloqueo;
    private Date fechaHoraBloqueo;
    private Integer numeroSolicitud;
    private Date fechaIngreso;
    private BigDecimal cupoDiferenciadoNacional;
    private BigDecimal cupoDiferenciadoInternac;
    private BigDecimal cupoAvanceNacional;
    private BigDecimal cupoAvanceInternac;
    private BigDecimal deudaTotalNacional;
    private BigDecimal deudaTotalInternac;
    private BigDecimal disponibleTotalNacional;
    private BigDecimal disponibleTotalInternac;
    private BigDecimal deudaTotalAvanceNacional;
    private BigDecimal deudaTotalAvanceInternac;
    private BigDecimal disponibleAvanceNacional;
    private BigDecimal disponibleAvanceInternac;
    private BigInteger codigoPinTarjeta;
    private Integer pinOfsetTarjeta;
    private String nombresTarjeta;
    private String apellidoPaternoTarjeta;
    private String apellidoMaternoTarjeta;
    private String direccionTarjeta;
    private String filler;
    private Integer idActivo;
    private Date fechaProcesoEmisor;
    private Date fechaCargaSistema;
    private String codigoLogo;
    private String codigoOrganizacion;
    private String indicadorVigente;
    private String tarjetaPurgada;
    private String indicadorTarjetaNueva;
    private Integer idFacturacion;
    private String tarjetaAbierta;
    private BigInteger estadoAutorizador;
    private Date fechaHoraEstadoAutorizador;
    private Date fechaEmisionTarjeta;
    private Date fechaEntregaTarjeta;
    private Date fechaVencimientoTarjeta;
    private String codigoSucursalEmisor;
    private String codigoEstadoTarjeta;
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

    @Basic
    @Column(name = "numero_cuenta")
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Basic
    @Column(name = "numero_tarjeta")
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Basic
    @Column(name = "tipo_tarjeta")
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    @Basic
    @Column(name = "numero_del_adicional")
    public Integer getNumeroDelAdicional() {
        return numeroDelAdicional;
    }

    public void setNumeroDelAdicional(Integer numeroDelAdicional) {
        this.numeroDelAdicional = numeroDelAdicional;
    }

    @Basic
    @Column(name = "nombre_del_adicional")
    public String getNombreDelAdicional() {
        return nombreDelAdicional;
    }

    public void setNombreDelAdicional(String nombreDelAdicional) {
        this.nombreDelAdicional = nombreDelAdicional;
    }

    @Basic
    @Column(name = "rut_adicional")
    public Integer getRutAdicional() {
        return rutAdicional;
    }

    public void setRutAdicional(Integer rutAdicional) {
        this.rutAdicional = rutAdicional;
    }

    @Basic
    @Column(name = "dv_rut_adicional")
    public String getDvRutAdicional() {
        return dvRutAdicional;
    }

    public void setDvRutAdicional(String dvRutAdicional) {
        this.dvRutAdicional = dvRutAdicional;
    }

    @Basic
    @Column(name = "fecha_apertura")
    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    @Basic
    @Column(name = "estado_tarjeta")
    public BigInteger getEstadoTarjeta() {
        return estadoTarjeta;
    }

    public void setEstadoTarjeta(BigInteger estadoTarjeta) {
        this.estadoTarjeta = estadoTarjeta;
    }

    @Basic
    @Column(name = "fecha_activacion")
    public Date getFechaActivacion() {
        return fechaActivacion;
    }

    public void setFechaActivacion(Date fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }

    @Basic
    @Column(name = "codigo_bloqueo")
    public String getCodigoBloqueo() {
        return codigoBloqueo;
    }

    public void setCodigoBloqueo(String codigoBloqueo) {
        this.codigoBloqueo = codigoBloqueo;
    }

    @Basic
    @Column(name = "fecha_hora_bloqueo")
    public Date getFechaHoraBloqueo() {
        return fechaHoraBloqueo;
    }

    public void setFechaHoraBloqueo(Date fechaHoraBloqueo) {
        this.fechaHoraBloqueo = fechaHoraBloqueo;
    }

    @Basic
    @Column(name = "numero_solicitud")
    public Integer getNumeroSolicitud() {
        return numeroSolicitud;
    }

    public void setNumeroSolicitud(Integer numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    @Basic
    @Column(name = "fecha_ingreso")
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Basic
    @Column(name = "cupo_diferenciado_nacional")
    public BigDecimal getCupoDiferenciadoNacional() {
        return cupoDiferenciadoNacional;
    }

    public void setCupoDiferenciadoNacional(BigDecimal cupoDiferenciadoNacional) {
        this.cupoDiferenciadoNacional = cupoDiferenciadoNacional;
    }

    @Basic
    @Column(name = "cupo_diferenciado_internac")
    public BigDecimal getCupoDiferenciadoInternac() {
        return cupoDiferenciadoInternac;
    }

    public void setCupoDiferenciadoInternac(BigDecimal cupoDiferenciadoInternac) {
        this.cupoDiferenciadoInternac = cupoDiferenciadoInternac;
    }

    @Basic
    @Column(name = "cupo_avance_nacional")
    public BigDecimal getCupoAvanceNacional() {
        return cupoAvanceNacional;
    }

    public void setCupoAvanceNacional(BigDecimal cupoAvanceNacional) {
        this.cupoAvanceNacional = cupoAvanceNacional;
    }

    @Basic
    @Column(name = "cupo_avance_internac")
    public BigDecimal getCupoAvanceInternac() {
        return cupoAvanceInternac;
    }

    public void setCupoAvanceInternac(BigDecimal cupoAvanceInternac) {
        this.cupoAvanceInternac = cupoAvanceInternac;
    }

    @Basic
    @Column(name = "deuda_total_nacional")
    public BigDecimal getDeudaTotalNacional() {
        return deudaTotalNacional;
    }

    public void setDeudaTotalNacional(BigDecimal deudaTotalNacional) {
        this.deudaTotalNacional = deudaTotalNacional;
    }

    @Basic
    @Column(name = "deuda_total_internac")
    public BigDecimal getDeudaTotalInternac() {
        return deudaTotalInternac;
    }

    public void setDeudaTotalInternac(BigDecimal deudaTotalInternac) {
        this.deudaTotalInternac = deudaTotalInternac;
    }

    @Basic
    @Column(name = "disponible_total_nacional")
    public BigDecimal getDisponibleTotalNacional() {
        return disponibleTotalNacional;
    }

    public void setDisponibleTotalNacional(BigDecimal disponibleTotalNacional) {
        this.disponibleTotalNacional = disponibleTotalNacional;
    }

    @Basic
    @Column(name = "disponible_total_internac")
    public BigDecimal getDisponibleTotalInternac() {
        return disponibleTotalInternac;
    }

    public void setDisponibleTotalInternac(BigDecimal disponibleTotalInternac) {
        this.disponibleTotalInternac = disponibleTotalInternac;
    }

    @Basic
    @Column(name = "deuda_total_avance_nacional")
    public BigDecimal getDeudaTotalAvanceNacional() {
        return deudaTotalAvanceNacional;
    }

    public void setDeudaTotalAvanceNacional(BigDecimal deudaTotalAvanceNacional) {
        this.deudaTotalAvanceNacional = deudaTotalAvanceNacional;
    }

    @Basic
    @Column(name = "deuda_total_avance_internac")
    public BigDecimal getDeudaTotalAvanceInternac() {
        return deudaTotalAvanceInternac;
    }

    public void setDeudaTotalAvanceInternac(BigDecimal deudaTotalAvanceInternac) {
        this.deudaTotalAvanceInternac = deudaTotalAvanceInternac;
    }

    @Basic
    @Column(name = "disponible_avance_nacional")
    public BigDecimal getDisponibleAvanceNacional() {
        return disponibleAvanceNacional;
    }

    public void setDisponibleAvanceNacional(BigDecimal disponibleAvanceNacional) {
        this.disponibleAvanceNacional = disponibleAvanceNacional;
    }

    @Basic
    @Column(name = "disponible_avance_internac")
    public BigDecimal getDisponibleAvanceInternac() {
        return disponibleAvanceInternac;
    }

    public void setDisponibleAvanceInternac(BigDecimal disponibleAvanceInternac) {
        this.disponibleAvanceInternac = disponibleAvanceInternac;
    }

    @Basic
    @Column(name = "codigo_pin_tarjeta")
    public BigInteger getCodigoPinTarjeta() {
        return codigoPinTarjeta;
    }

    public void setCodigoPinTarjeta(BigInteger codigoPinTarjeta) {
        this.codigoPinTarjeta = codigoPinTarjeta;
    }

    @Basic
    @Column(name = "pin_ofset_tarjeta")
    public Integer getPinOfsetTarjeta() {
        return pinOfsetTarjeta;
    }

    public void setPinOfsetTarjeta(Integer pinOfsetTarjeta) {
        this.pinOfsetTarjeta = pinOfsetTarjeta;
    }

    @Basic
    @Column(name = "nombres_tarjeta")
    public String getNombresTarjeta() {
        return nombresTarjeta;
    }

    public void setNombresTarjeta(String nombresTarjeta) {
        this.nombresTarjeta = nombresTarjeta;
    }

    @Basic
    @Column(name = "apellido_paterno_tarjeta")
    public String getApellidoPaternoTarjeta() {
        return apellidoPaternoTarjeta;
    }

    public void setApellidoPaternoTarjeta(String apellidoPaternoTarjeta) {
        this.apellidoPaternoTarjeta = apellidoPaternoTarjeta;
    }

    @Basic
    @Column(name = "apellido_materno_tarjeta")
    public String getApellidoMaternoTarjeta() {
        return apellidoMaternoTarjeta;
    }

    public void setApellidoMaternoTarjeta(String apellidoMaternoTarjeta) {
        this.apellidoMaternoTarjeta = apellidoMaternoTarjeta;
    }

    @Basic
    @Column(name = "direccion_tarjeta")
    public String getDireccionTarjeta() {
        return direccionTarjeta;
    }

    public void setDireccionTarjeta(String direccionTarjeta) {
        this.direccionTarjeta = direccionTarjeta;
    }

    @Basic
    @Column(name = "filler")
    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }

    @Basic
    @Column(name = "id_activo")
    public Integer getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(Integer idActivo) {
        this.idActivo = idActivo;
    }

    @Basic
    @Column(name = "fecha_proceso_emisor")
    public Date getFechaProcesoEmisor() {
        return fechaProcesoEmisor;
    }

    public void setFechaProcesoEmisor(Date fechaProcesoEmisor) {
        this.fechaProcesoEmisor = fechaProcesoEmisor;
    }

    @Basic
    @Column(name = "fecha_carga_sistema")
    public Date getFechaCargaSistema() {
        return fechaCargaSistema;
    }

    public void setFechaCargaSistema(Date fechaCargaSistema) {
        this.fechaCargaSistema = fechaCargaSistema;
    }

    @Basic
    @Column(name = "codigo_logo")
    public String getCodigoLogo() {
        return codigoLogo;
    }

    public void setCodigoLogo(String codigoLogo) {
        this.codigoLogo = codigoLogo;
    }

    @Basic
    @Column(name = "codigo_organizacion")
    public String getCodigoOrganizacion() {
        return codigoOrganizacion;
    }

    public void setCodigoOrganizacion(String codigoOrganizacion) {
        this.codigoOrganizacion = codigoOrganizacion;
    }

    @Basic
    @Column(name = "indicador_vigente")
    public String getIndicadorVigente() {
        return indicadorVigente;
    }

    public void setIndicadorVigente(String indicadorVigente) {
        this.indicadorVigente = indicadorVigente;
    }

    @Basic
    @Column(name = "tarjeta_purgada")
    public String getTarjetaPurgada() {
        return tarjetaPurgada;
    }

    public void setTarjetaPurgada(String tarjetaPurgada) {
        this.tarjetaPurgada = tarjetaPurgada;
    }

    @Basic
    @Column(name = "indicador_tarjeta_nueva")
    public String getIndicadorTarjetaNueva() {
        return indicadorTarjetaNueva;
    }

    public void setIndicadorTarjetaNueva(String indicadorTarjetaNueva) {
        this.indicadorTarjetaNueva = indicadorTarjetaNueva;
    }

    @Basic
    @Column(name = "id_facturacion")
    public Integer getIdFacturacion() {
        return idFacturacion;
    }

    public void setIdFacturacion(Integer idFacturacion) {
        this.idFacturacion = idFacturacion;
    }

    @Basic
    @Column(name = "tarjeta_abierta")
    public String getTarjetaAbierta() {
        return tarjetaAbierta;
    }

    public void setTarjetaAbierta(String tarjetaAbierta) {
        this.tarjetaAbierta = tarjetaAbierta;
    }

    @Basic
    @Column(name = "estado_autorizador")
    public BigInteger getEstadoAutorizador() {
        return estadoAutorizador;
    }

    public void setEstadoAutorizador(BigInteger estadoAutorizador) {
        this.estadoAutorizador = estadoAutorizador;
    }

    @Basic
    @Column(name = "fecha_hora_estado_autorizador")
    public Date getFechaHoraEstadoAutorizador() {
        return fechaHoraEstadoAutorizador;
    }

    public void setFechaHoraEstadoAutorizador(Date fechaHoraEstadoAutorizador) {
        this.fechaHoraEstadoAutorizador = fechaHoraEstadoAutorizador;
    }

    @Basic
    @Column(name = "fecha_emision_tarjeta")
    public Date getFechaEmisionTarjeta() {
        return fechaEmisionTarjeta;
    }

    public void setFechaEmisionTarjeta(Date fechaEmisionTarjeta) {
        this.fechaEmisionTarjeta = fechaEmisionTarjeta;
    }

    @Basic
    @Column(name = "fecha_entrega_tarjeta")
    public Date getFechaEntregaTarjeta() {
        return fechaEntregaTarjeta;
    }

    public void setFechaEntregaTarjeta(Date fechaEntregaTarjeta) {
        this.fechaEntregaTarjeta = fechaEntregaTarjeta;
    }

    @Basic
    @Column(name = "fecha_vencimiento_tarjeta")
    public Date getFechaVencimientoTarjeta() {
        return fechaVencimientoTarjeta;
    }

    public void setFechaVencimientoTarjeta(Date fechaVencimientoTarjeta) {
        this.fechaVencimientoTarjeta = fechaVencimientoTarjeta;
    }

    @Basic
    @Column(name = "codigo_sucursal_emisor")
    public String getCodigoSucursalEmisor() {
        return codigoSucursalEmisor;
    }

    public void setCodigoSucursalEmisor(String codigoSucursalEmisor) {
        this.codigoSucursalEmisor = codigoSucursalEmisor;
    }

    @Basic
    @Column(name = "codigo_estado_tarjeta")
    public String getCodigoEstadoTarjeta() {
        return codigoEstadoTarjeta;
    }

    public void setCodigoEstadoTarjeta(String codigoEstadoTarjeta) {
        this.codigoEstadoTarjeta = codigoEstadoTarjeta;
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
}
