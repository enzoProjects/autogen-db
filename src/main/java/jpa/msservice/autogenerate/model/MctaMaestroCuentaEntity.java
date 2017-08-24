package jpa.msservice.autogenerate.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;

@Entity
@Table(name = "mcta_maestro_cuenta", schema = "admmcta", catalog = "dbcat")
@IdClass(MctaMaestroCuentaEntityPK.class)
public class MctaMaestroCuentaEntity {
    private String entidad;
    private int idCuenta;
    private int idCliente;
    private String indicadorVigente;
    private String numeroCuenta;
    private Integer codigoLogo;
    private String pct;
    private Integer numeroRut;
    private String digitoRut;
    private String nombreTitular;
    private BigInteger codigoSexo;
    private BigInteger codigoEstadoCivil;
    private BigInteger codigoPagoMinimo;
    private Date fechaNacimiento;
    private String dirParticular;
    private String comunaDirParticular;
    private String fonoDirParticular;
    private String dirEnvioEecc;
    private String comunaEnvioEecc;
    private String ciudadEnvioEecc;
    private BigInteger regionEecc;
    private String fonoEnvioEecc;
    private Date fechaActivacionCuenta;
    private Date fechaVencimientoPlastico;
    private Date fechaBloqueo1;
    private Date fechaBloqueo2;
    private Date fechaUltFactNacional;
    private String codigoBloqueo1;
    private String codigoBloqueo2;
    private Integer horaUltBloqueo;
    private BigInteger codigoMorosidad;
    private BigInteger cicloFacturacion;
    private Integer nroInterno;
    private BigDecimal cupoNacionalCupoVirtual;
    private BigDecimal cupoInternacCupoVirtualUs;
    private BigDecimal cupoLineaCredito;
    private BigDecimal deudaEnColocDeudaLcredito;
    private BigDecimal intCotePorCobrarCargoUsr;
    private BigDecimal intMoraPorCobrarCargoUsr;
    private BigDecimal intCoteDevengadosCargoUsr;
    private BigDecimal intMoraDevengadosCargoUsr;
    private BigDecimal intCotePercibidosCargoUsr;
    private BigDecimal intMoraPercibidosCargoUsr;
    private BigDecimal pagoMinimoEecc;
    private BigDecimal deudaTotalClpUs;
    private BigDecimal deudaTotalNacional;
    private BigDecimal deudaTotalInternac;
    private BigDecimal dispoParaAvances;
    private BigDecimal dispoTotalEnClp;
    private BigDecimal dispoTotalEnUs;
    private Integer nroMoras;
    private BigInteger diasMora;
    private Integer mora000030;
    private Integer mora031060;
    private Integer mora061090;
    private Integer mora091120;
    private Date fechaUltMora;
    private Date fechaUltCompra;
    private Date fechaUltCobroGastoAdminis;
    private Integer nroComprasMes;
    private Integer nroPagosMes;
    private Integer nroAvancesMes;
    private Integer nroComprasInternacMes;
    private Integer numerosPagosInternaces;
    private Integer nroComprasEjercicio;
    private Integer nroAvancesEjercicio;
    private BigDecimal mtoTotalCompras;
    private BigDecimal mtoTotalAvances;
    private BigDecimal mtoAvancesDelMes;
    private BigDecimal mtoComprasDelMesNacional;
    private BigDecimal mtoCompraIntMes;
    private BigDecimal mtoComprasIntEjercicio;
    private BigDecimal mtoPagosMes;
    private BigDecimal traspasoDeudaInternacAMn;
    private String cuentaCte;
    private BigInteger codigoCuentaCte;
    private BigDecimal deudaUltFactNacional;
    private BigDecimal deudaUltFactInternac;
    private BigDecimal deudaColocEnCuotasFijas;
    private Integer deuda3CuotasPrecioContado;
    private BigInteger estadoLaCuenta;
    private BigDecimal utilizacionesPorCobrarClp;
    private BigDecimal utilizacionesPorCobrarUs;
    private Integer deudaActualEnCuotas;
    private BigDecimal imptoSaldoFinanciado1X1000;
    private Integer comiAvancesFacturado;
    private Integer comiBencinaFacturado;
    private Integer comiCesFacturado;
    private Integer comiComprasInternaces;
    private Integer fechaApertura;
    private BigDecimal pagosPorAplicarClp;
    private BigDecimal pagosPorAplicarUs;
    private BigInteger codigoCobranza;
    private BigInteger codigoTraspasoSaldo;
    private String cuentaTraspasoSaldos;
    private Date fechaTraspasoSaldo;
    private Integer codigoAfinidad;
    private String codigoRebaja;
    private BigInteger codigoPin;
    private Integer pinOffset;
    private Date fechaUltPago;
    private BigInteger codigoVip;
    private BigInteger codigoHabilitaCompraCuotas;
    private Integer nroInterno2;
    private Integer nroSolicitudFolio;
    private String indicadorRelacion;
    private BigInteger adicionales;
    private Integer diasMoraReal;
    private String codigoEmpleado;
    private Date fechaVencimientoFacturacion;
    private BigDecimal mora121150;
    private BigDecimal mora151180;
    private BigDecimal mora181210;
    private BigDecimal moraMas210;
    private BigInteger codigoSegmentacion;
    private Date fechaActualizaSegmentacion;
    private String nroCuentaAntigua;
    private String filler01;
    private String email;
    private String filler02;
    private Integer idActivo;
    private Date fechaProcesoEmisor;
    private Date fechaCargaSistema;
    private String cuentaPurgada;
    private Integer idFacturacion;
    private BigInteger estadoAutorizador;
    private Date fechaHoraEstadoAutorizador;
    private BigDecimal montoSaldoPendiente;
    private Date fechaHoraSaldoPendiente;
    private Date fechaHoraActualizaMontos;
    private String codigoEstadoCuenta;
    private Date fechaCreacion;
    private Date fechaUltActualizacion;

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

    @Basic
    @Column(name = "numero_cuenta")
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Basic
    @Column(name = "codigo_logo")
    public Integer getCodigoLogo() {
        return codigoLogo;
    }

    public void setCodigoLogo(Integer codigoLogo) {
        this.codigoLogo = codigoLogo;
    }

    @Basic
    @Column(name = "pct")
    public String getPct() {
        return pct;
    }

    public void setPct(String pct) {
        this.pct = pct;
    }

    @Basic
    @Column(name = "numero_rut")
    public Integer getNumeroRut() {
        return numeroRut;
    }

    public void setNumeroRut(Integer numeroRut) {
        this.numeroRut = numeroRut;
    }

    @Basic
    @Column(name = "digito_rut")
    public String getDigitoRut() {
        return digitoRut;
    }

    public void setDigitoRut(String digitoRut) {
        this.digitoRut = digitoRut;
    }

    @Basic
    @Column(name = "nombre_titular")
    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    @Basic
    @Column(name = "codigo_sexo")
    public BigInteger getCodigoSexo() {
        return codigoSexo;
    }

    public void setCodigoSexo(BigInteger codigoSexo) {
        this.codigoSexo = codigoSexo;
    }

    @Basic
    @Column(name = "codigo_estado_civil")
    public BigInteger getCodigoEstadoCivil() {
        return codigoEstadoCivil;
    }

    public void setCodigoEstadoCivil(BigInteger codigoEstadoCivil) {
        this.codigoEstadoCivil = codigoEstadoCivil;
    }

    @Basic
    @Column(name = "codigo_pago_minimo")
    public BigInteger getCodigoPagoMinimo() {
        return codigoPagoMinimo;
    }

    public void setCodigoPagoMinimo(BigInteger codigoPagoMinimo) {
        this.codigoPagoMinimo = codigoPagoMinimo;
    }

    @Basic
    @Column(name = "fecha_nacimiento")
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Basic
    @Column(name = "dir_particular")
    public String getDirParticular() {
        return dirParticular;
    }

    public void setDirParticular(String dirParticular) {
        this.dirParticular = dirParticular;
    }

    @Basic
    @Column(name = "comuna_dir_particular")
    public String getComunaDirParticular() {
        return comunaDirParticular;
    }

    public void setComunaDirParticular(String comunaDirParticular) {
        this.comunaDirParticular = comunaDirParticular;
    }

    @Basic
    @Column(name = "fono_dir_particular")
    public String getFonoDirParticular() {
        return fonoDirParticular;
    }

    public void setFonoDirParticular(String fonoDirParticular) {
        this.fonoDirParticular = fonoDirParticular;
    }

    @Basic
    @Column(name = "dir_envio_eecc")
    public String getDirEnvioEecc() {
        return dirEnvioEecc;
    }

    public void setDirEnvioEecc(String dirEnvioEecc) {
        this.dirEnvioEecc = dirEnvioEecc;
    }

    @Basic
    @Column(name = "comuna_envio_eecc")
    public String getComunaEnvioEecc() {
        return comunaEnvioEecc;
    }

    public void setComunaEnvioEecc(String comunaEnvioEecc) {
        this.comunaEnvioEecc = comunaEnvioEecc;
    }

    @Basic
    @Column(name = "ciudad_envio_eecc")
    public String getCiudadEnvioEecc() {
        return ciudadEnvioEecc;
    }

    public void setCiudadEnvioEecc(String ciudadEnvioEecc) {
        this.ciudadEnvioEecc = ciudadEnvioEecc;
    }

    @Basic
    @Column(name = "region_eecc")
    public BigInteger getRegionEecc() {
        return regionEecc;
    }

    public void setRegionEecc(BigInteger regionEecc) {
        this.regionEecc = regionEecc;
    }

    @Basic
    @Column(name = "fono_envio_eecc")
    public String getFonoEnvioEecc() {
        return fonoEnvioEecc;
    }

    public void setFonoEnvioEecc(String fonoEnvioEecc) {
        this.fonoEnvioEecc = fonoEnvioEecc;
    }

    @Basic
    @Column(name = "fecha_activacion_cuenta")
    public Date getFechaActivacionCuenta() {
        return fechaActivacionCuenta;
    }

    public void setFechaActivacionCuenta(Date fechaActivacionCuenta) {
        this.fechaActivacionCuenta = fechaActivacionCuenta;
    }

    @Basic
    @Column(name = "fecha_vencimiento_plastico")
    public Date getFechaVencimientoPlastico() {
        return fechaVencimientoPlastico;
    }

    public void setFechaVencimientoPlastico(Date fechaVencimientoPlastico) {
        this.fechaVencimientoPlastico = fechaVencimientoPlastico;
    }

    @Basic
    @Column(name = "fecha_bloqueo_1")
    public Date getFechaBloqueo1() {
        return fechaBloqueo1;
    }

    public void setFechaBloqueo1(Date fechaBloqueo1) {
        this.fechaBloqueo1 = fechaBloqueo1;
    }

    @Basic
    @Column(name = "fecha_bloqueo_2")
    public Date getFechaBloqueo2() {
        return fechaBloqueo2;
    }

    public void setFechaBloqueo2(Date fechaBloqueo2) {
        this.fechaBloqueo2 = fechaBloqueo2;
    }

    @Basic
    @Column(name = "fecha_ult_fact_nacional")
    public Date getFechaUltFactNacional() {
        return fechaUltFactNacional;
    }

    public void setFechaUltFactNacional(Date fechaUltFactNacional) {
        this.fechaUltFactNacional = fechaUltFactNacional;
    }

    @Basic
    @Column(name = "codigo_bloqueo_1")
    public String getCodigoBloqueo1() {
        return codigoBloqueo1;
    }

    public void setCodigoBloqueo1(String codigoBloqueo1) {
        this.codigoBloqueo1 = codigoBloqueo1;
    }

    @Basic
    @Column(name = "codigo_bloqueo_2")
    public String getCodigoBloqueo2() {
        return codigoBloqueo2;
    }

    public void setCodigoBloqueo2(String codigoBloqueo2) {
        this.codigoBloqueo2 = codigoBloqueo2;
    }

    @Basic
    @Column(name = "hora_ult_bloqueo")
    public Integer getHoraUltBloqueo() {
        return horaUltBloqueo;
    }

    public void setHoraUltBloqueo(Integer horaUltBloqueo) {
        this.horaUltBloqueo = horaUltBloqueo;
    }

    @Basic
    @Column(name = "codigo_morosidad")
    public BigInteger getCodigoMorosidad() {
        return codigoMorosidad;
    }

    public void setCodigoMorosidad(BigInteger codigoMorosidad) {
        this.codigoMorosidad = codigoMorosidad;
    }

    @Basic
    @Column(name = "ciclo_facturacion")
    public BigInteger getCicloFacturacion() {
        return cicloFacturacion;
    }

    public void setCicloFacturacion(BigInteger cicloFacturacion) {
        this.cicloFacturacion = cicloFacturacion;
    }

    @Basic
    @Column(name = "nro_interno")
    public Integer getNroInterno() {
        return nroInterno;
    }

    public void setNroInterno(Integer nroInterno) {
        this.nroInterno = nroInterno;
    }

    @Basic
    @Column(name = "cupo_nacional_cupo_virtual")
    public BigDecimal getCupoNacionalCupoVirtual() {
        return cupoNacionalCupoVirtual;
    }

    public void setCupoNacionalCupoVirtual(BigDecimal cupoNacionalCupoVirtual) {
        this.cupoNacionalCupoVirtual = cupoNacionalCupoVirtual;
    }

    @Basic
    @Column(name = "cupo_internac_cupo_virtual_us")
    public BigDecimal getCupoInternacCupoVirtualUs() {
        return cupoInternacCupoVirtualUs;
    }

    public void setCupoInternacCupoVirtualUs(BigDecimal cupoInternacCupoVirtualUs) {
        this.cupoInternacCupoVirtualUs = cupoInternacCupoVirtualUs;
    }

    @Basic
    @Column(name = "cupo_linea_credito")
    public BigDecimal getCupoLineaCredito() {
        return cupoLineaCredito;
    }

    public void setCupoLineaCredito(BigDecimal cupoLineaCredito) {
        this.cupoLineaCredito = cupoLineaCredito;
    }

    @Basic
    @Column(name = "deuda_en_coloc_deuda_lcredito")
    public BigDecimal getDeudaEnColocDeudaLcredito() {
        return deudaEnColocDeudaLcredito;
    }

    public void setDeudaEnColocDeudaLcredito(BigDecimal deudaEnColocDeudaLcredito) {
        this.deudaEnColocDeudaLcredito = deudaEnColocDeudaLcredito;
    }

    @Basic
    @Column(name = "int_cote_por_cobrar_cargo_usr")
    public BigDecimal getIntCotePorCobrarCargoUsr() {
        return intCotePorCobrarCargoUsr;
    }

    public void setIntCotePorCobrarCargoUsr(BigDecimal intCotePorCobrarCargoUsr) {
        this.intCotePorCobrarCargoUsr = intCotePorCobrarCargoUsr;
    }

    @Basic
    @Column(name = "int_mora_por_cobrar_cargo_usr")
    public BigDecimal getIntMoraPorCobrarCargoUsr() {
        return intMoraPorCobrarCargoUsr;
    }

    public void setIntMoraPorCobrarCargoUsr(BigDecimal intMoraPorCobrarCargoUsr) {
        this.intMoraPorCobrarCargoUsr = intMoraPorCobrarCargoUsr;
    }

    @Basic
    @Column(name = "int_cote_devengados_cargo_usr")
    public BigDecimal getIntCoteDevengadosCargoUsr() {
        return intCoteDevengadosCargoUsr;
    }

    public void setIntCoteDevengadosCargoUsr(BigDecimal intCoteDevengadosCargoUsr) {
        this.intCoteDevengadosCargoUsr = intCoteDevengadosCargoUsr;
    }

    @Basic
    @Column(name = "int_mora_devengados_cargo_usr")
    public BigDecimal getIntMoraDevengadosCargoUsr() {
        return intMoraDevengadosCargoUsr;
    }

    public void setIntMoraDevengadosCargoUsr(BigDecimal intMoraDevengadosCargoUsr) {
        this.intMoraDevengadosCargoUsr = intMoraDevengadosCargoUsr;
    }

    @Basic
    @Column(name = "int_cote_percibidos_cargo_usr")
    public BigDecimal getIntCotePercibidosCargoUsr() {
        return intCotePercibidosCargoUsr;
    }

    public void setIntCotePercibidosCargoUsr(BigDecimal intCotePercibidosCargoUsr) {
        this.intCotePercibidosCargoUsr = intCotePercibidosCargoUsr;
    }

    @Basic
    @Column(name = "int_mora_percibidos_cargo_usr")
    public BigDecimal getIntMoraPercibidosCargoUsr() {
        return intMoraPercibidosCargoUsr;
    }

    public void setIntMoraPercibidosCargoUsr(BigDecimal intMoraPercibidosCargoUsr) {
        this.intMoraPercibidosCargoUsr = intMoraPercibidosCargoUsr;
    }

    @Basic
    @Column(name = "pago_minimo_eecc")
    public BigDecimal getPagoMinimoEecc() {
        return pagoMinimoEecc;
    }

    public void setPagoMinimoEecc(BigDecimal pagoMinimoEecc) {
        this.pagoMinimoEecc = pagoMinimoEecc;
    }

    @Basic
    @Column(name = "deuda_total_clp_us")
    public BigDecimal getDeudaTotalClpUs() {
        return deudaTotalClpUs;
    }

    public void setDeudaTotalClpUs(BigDecimal deudaTotalClpUs) {
        this.deudaTotalClpUs = deudaTotalClpUs;
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
    @Column(name = "dispo_para_avances")
    public BigDecimal getDispoParaAvances() {
        return dispoParaAvances;
    }

    public void setDispoParaAvances(BigDecimal dispoParaAvances) {
        this.dispoParaAvances = dispoParaAvances;
    }

    @Basic
    @Column(name = "dispo_total_en_clp")
    public BigDecimal getDispoTotalEnClp() {
        return dispoTotalEnClp;
    }

    public void setDispoTotalEnClp(BigDecimal dispoTotalEnClp) {
        this.dispoTotalEnClp = dispoTotalEnClp;
    }

    @Basic
    @Column(name = "dispo_total_en_us")
    public BigDecimal getDispoTotalEnUs() {
        return dispoTotalEnUs;
    }

    public void setDispoTotalEnUs(BigDecimal dispoTotalEnUs) {
        this.dispoTotalEnUs = dispoTotalEnUs;
    }

    @Basic
    @Column(name = "nro_moras")
    public Integer getNroMoras() {
        return nroMoras;
    }

    public void setNroMoras(Integer nroMoras) {
        this.nroMoras = nroMoras;
    }

    @Basic
    @Column(name = "dias_mora")
    public BigInteger getDiasMora() {
        return diasMora;
    }

    public void setDiasMora(BigInteger diasMora) {
        this.diasMora = diasMora;
    }

    @Basic
    @Column(name = "mora_000_030")
    public Integer getMora000030() {
        return mora000030;
    }

    public void setMora000030(Integer mora000030) {
        this.mora000030 = mora000030;
    }

    @Basic
    @Column(name = "mora_031_060")
    public Integer getMora031060() {
        return mora031060;
    }

    public void setMora031060(Integer mora031060) {
        this.mora031060 = mora031060;
    }

    @Basic
    @Column(name = "mora_061_090")
    public Integer getMora061090() {
        return mora061090;
    }

    public void setMora061090(Integer mora061090) {
        this.mora061090 = mora061090;
    }

    @Basic
    @Column(name = "mora_091_120")
    public Integer getMora091120() {
        return mora091120;
    }

    public void setMora091120(Integer mora091120) {
        this.mora091120 = mora091120;
    }

    @Basic
    @Column(name = "fecha_ult_mora")
    public Date getFechaUltMora() {
        return fechaUltMora;
    }

    public void setFechaUltMora(Date fechaUltMora) {
        this.fechaUltMora = fechaUltMora;
    }

    @Basic
    @Column(name = "fecha_ult_compra")
    public Date getFechaUltCompra() {
        return fechaUltCompra;
    }

    public void setFechaUltCompra(Date fechaUltCompra) {
        this.fechaUltCompra = fechaUltCompra;
    }

    @Basic
    @Column(name = "fecha_ult_cobro_gasto_adminis")
    public Date getFechaUltCobroGastoAdminis() {
        return fechaUltCobroGastoAdminis;
    }

    public void setFechaUltCobroGastoAdminis(Date fechaUltCobroGastoAdminis) {
        this.fechaUltCobroGastoAdminis = fechaUltCobroGastoAdminis;
    }

    @Basic
    @Column(name = "nro_compras_mes")
    public Integer getNroComprasMes() {
        return nroComprasMes;
    }

    public void setNroComprasMes(Integer nroComprasMes) {
        this.nroComprasMes = nroComprasMes;
    }

    @Basic
    @Column(name = "nro_pagos_mes")
    public Integer getNroPagosMes() {
        return nroPagosMes;
    }

    public void setNroPagosMes(Integer nroPagosMes) {
        this.nroPagosMes = nroPagosMes;
    }

    @Basic
    @Column(name = "nro_avances_mes")
    public Integer getNroAvancesMes() {
        return nroAvancesMes;
    }

    public void setNroAvancesMes(Integer nroAvancesMes) {
        this.nroAvancesMes = nroAvancesMes;
    }

    @Basic
    @Column(name = "nro_compras_internac_mes")
    public Integer getNroComprasInternacMes() {
        return nroComprasInternacMes;
    }

    public void setNroComprasInternacMes(Integer nroComprasInternacMes) {
        this.nroComprasInternacMes = nroComprasInternacMes;
    }

    @Basic
    @Column(name = "numeros_pagos_internaces")
    public Integer getNumerosPagosInternaces() {
        return numerosPagosInternaces;
    }

    public void setNumerosPagosInternaces(Integer numerosPagosInternaces) {
        this.numerosPagosInternaces = numerosPagosInternaces;
    }

    @Basic
    @Column(name = "nro_compras_ejercicio")
    public Integer getNroComprasEjercicio() {
        return nroComprasEjercicio;
    }

    public void setNroComprasEjercicio(Integer nroComprasEjercicio) {
        this.nroComprasEjercicio = nroComprasEjercicio;
    }

    @Basic
    @Column(name = "nro_avances_ejercicio")
    public Integer getNroAvancesEjercicio() {
        return nroAvancesEjercicio;
    }

    public void setNroAvancesEjercicio(Integer nroAvancesEjercicio) {
        this.nroAvancesEjercicio = nroAvancesEjercicio;
    }

    @Basic
    @Column(name = "mto_total_compras")
    public BigDecimal getMtoTotalCompras() {
        return mtoTotalCompras;
    }

    public void setMtoTotalCompras(BigDecimal mtoTotalCompras) {
        this.mtoTotalCompras = mtoTotalCompras;
    }

    @Basic
    @Column(name = "mto_total_avances")
    public BigDecimal getMtoTotalAvances() {
        return mtoTotalAvances;
    }

    public void setMtoTotalAvances(BigDecimal mtoTotalAvances) {
        this.mtoTotalAvances = mtoTotalAvances;
    }

    @Basic
    @Column(name = "mto_avances_del_mes")
    public BigDecimal getMtoAvancesDelMes() {
        return mtoAvancesDelMes;
    }

    public void setMtoAvancesDelMes(BigDecimal mtoAvancesDelMes) {
        this.mtoAvancesDelMes = mtoAvancesDelMes;
    }

    @Basic
    @Column(name = "mto_compras_del_mes_nacional")
    public BigDecimal getMtoComprasDelMesNacional() {
        return mtoComprasDelMesNacional;
    }

    public void setMtoComprasDelMesNacional(BigDecimal mtoComprasDelMesNacional) {
        this.mtoComprasDelMesNacional = mtoComprasDelMesNacional;
    }

    @Basic
    @Column(name = "mto_compra_int_mes")
    public BigDecimal getMtoCompraIntMes() {
        return mtoCompraIntMes;
    }

    public void setMtoCompraIntMes(BigDecimal mtoCompraIntMes) {
        this.mtoCompraIntMes = mtoCompraIntMes;
    }

    @Basic
    @Column(name = "mto_compras_int_ejercicio")
    public BigDecimal getMtoComprasIntEjercicio() {
        return mtoComprasIntEjercicio;
    }

    public void setMtoComprasIntEjercicio(BigDecimal mtoComprasIntEjercicio) {
        this.mtoComprasIntEjercicio = mtoComprasIntEjercicio;
    }

    @Basic
    @Column(name = "mto_pagos_mes")
    public BigDecimal getMtoPagosMes() {
        return mtoPagosMes;
    }

    public void setMtoPagosMes(BigDecimal mtoPagosMes) {
        this.mtoPagosMes = mtoPagosMes;
    }

    @Basic
    @Column(name = "traspaso_deuda_internac_a_mn")
    public BigDecimal getTraspasoDeudaInternacAMn() {
        return traspasoDeudaInternacAMn;
    }

    public void setTraspasoDeudaInternacAMn(BigDecimal traspasoDeudaInternacAMn) {
        this.traspasoDeudaInternacAMn = traspasoDeudaInternacAMn;
    }

    @Basic
    @Column(name = "cuenta_cte")
    public String getCuentaCte() {
        return cuentaCte;
    }

    public void setCuentaCte(String cuentaCte) {
        this.cuentaCte = cuentaCte;
    }

    @Basic
    @Column(name = "codigo_cuenta_cte")
    public BigInteger getCodigoCuentaCte() {
        return codigoCuentaCte;
    }

    public void setCodigoCuentaCte(BigInteger codigoCuentaCte) {
        this.codigoCuentaCte = codigoCuentaCte;
    }

    @Basic
    @Column(name = "deuda_ult_fact_nacional")
    public BigDecimal getDeudaUltFactNacional() {
        return deudaUltFactNacional;
    }

    public void setDeudaUltFactNacional(BigDecimal deudaUltFactNacional) {
        this.deudaUltFactNacional = deudaUltFactNacional;
    }

    @Basic
    @Column(name = "deuda_ult_fact_internac")
    public BigDecimal getDeudaUltFactInternac() {
        return deudaUltFactInternac;
    }

    public void setDeudaUltFactInternac(BigDecimal deudaUltFactInternac) {
        this.deudaUltFactInternac = deudaUltFactInternac;
    }

    @Basic
    @Column(name = "deuda_coloc_en_cuotas_fijas")
    public BigDecimal getDeudaColocEnCuotasFijas() {
        return deudaColocEnCuotasFijas;
    }

    public void setDeudaColocEnCuotasFijas(BigDecimal deudaColocEnCuotasFijas) {
        this.deudaColocEnCuotasFijas = deudaColocEnCuotasFijas;
    }

    @Basic
    @Column(name = "deuda_3_cuotas_precio_contado")
    public Integer getDeuda3CuotasPrecioContado() {
        return deuda3CuotasPrecioContado;
    }

    public void setDeuda3CuotasPrecioContado(Integer deuda3CuotasPrecioContado) {
        this.deuda3CuotasPrecioContado = deuda3CuotasPrecioContado;
    }

    @Basic
    @Column(name = "estado_la_cuenta")
    public BigInteger getEstadoLaCuenta() {
        return estadoLaCuenta;
    }

    public void setEstadoLaCuenta(BigInteger estadoLaCuenta) {
        this.estadoLaCuenta = estadoLaCuenta;
    }

    @Basic
    @Column(name = "utilizaciones_por_cobrar_clp")
    public BigDecimal getUtilizacionesPorCobrarClp() {
        return utilizacionesPorCobrarClp;
    }

    public void setUtilizacionesPorCobrarClp(BigDecimal utilizacionesPorCobrarClp) {
        this.utilizacionesPorCobrarClp = utilizacionesPorCobrarClp;
    }

    @Basic
    @Column(name = "utilizaciones_por_cobrar_us")
    public BigDecimal getUtilizacionesPorCobrarUs() {
        return utilizacionesPorCobrarUs;
    }

    public void setUtilizacionesPorCobrarUs(BigDecimal utilizacionesPorCobrarUs) {
        this.utilizacionesPorCobrarUs = utilizacionesPorCobrarUs;
    }

    @Basic
    @Column(name = "deuda_actual_en_cuotas")
    public Integer getDeudaActualEnCuotas() {
        return deudaActualEnCuotas;
    }

    public void setDeudaActualEnCuotas(Integer deudaActualEnCuotas) {
        this.deudaActualEnCuotas = deudaActualEnCuotas;
    }

    @Basic
    @Column(name = "impto_saldo_financiado_1x1000")
    public BigDecimal getImptoSaldoFinanciado1X1000() {
        return imptoSaldoFinanciado1X1000;
    }

    public void setImptoSaldoFinanciado1X1000(BigDecimal imptoSaldoFinanciado1X1000) {
        this.imptoSaldoFinanciado1X1000 = imptoSaldoFinanciado1X1000;
    }

    @Basic
    @Column(name = "comi_avances_facturado")
    public Integer getComiAvancesFacturado() {
        return comiAvancesFacturado;
    }

    public void setComiAvancesFacturado(Integer comiAvancesFacturado) {
        this.comiAvancesFacturado = comiAvancesFacturado;
    }

    @Basic
    @Column(name = "comi_bencina_facturado")
    public Integer getComiBencinaFacturado() {
        return comiBencinaFacturado;
    }

    public void setComiBencinaFacturado(Integer comiBencinaFacturado) {
        this.comiBencinaFacturado = comiBencinaFacturado;
    }

    @Basic
    @Column(name = "comi_ces_facturado")
    public Integer getComiCesFacturado() {
        return comiCesFacturado;
    }

    public void setComiCesFacturado(Integer comiCesFacturado) {
        this.comiCesFacturado = comiCesFacturado;
    }

    @Basic
    @Column(name = "comi_compras_internaces")
    public Integer getComiComprasInternaces() {
        return comiComprasInternaces;
    }

    public void setComiComprasInternaces(Integer comiComprasInternaces) {
        this.comiComprasInternaces = comiComprasInternaces;
    }

    @Basic
    @Column(name = "fecha_apertura")
    public Integer getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Integer fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    @Basic
    @Column(name = "pagos_por_aplicar_clp")
    public BigDecimal getPagosPorAplicarClp() {
        return pagosPorAplicarClp;
    }

    public void setPagosPorAplicarClp(BigDecimal pagosPorAplicarClp) {
        this.pagosPorAplicarClp = pagosPorAplicarClp;
    }

    @Basic
    @Column(name = "pagos_por_aplicar_us")
    public BigDecimal getPagosPorAplicarUs() {
        return pagosPorAplicarUs;
    }

    public void setPagosPorAplicarUs(BigDecimal pagosPorAplicarUs) {
        this.pagosPorAplicarUs = pagosPorAplicarUs;
    }

    @Basic
    @Column(name = "codigo_cobranza")
    public BigInteger getCodigoCobranza() {
        return codigoCobranza;
    }

    public void setCodigoCobranza(BigInteger codigoCobranza) {
        this.codigoCobranza = codigoCobranza;
    }

    @Basic
    @Column(name = "codigo_traspaso_saldo")
    public BigInteger getCodigoTraspasoSaldo() {
        return codigoTraspasoSaldo;
    }

    public void setCodigoTraspasoSaldo(BigInteger codigoTraspasoSaldo) {
        this.codigoTraspasoSaldo = codigoTraspasoSaldo;
    }

    @Basic
    @Column(name = "cuenta_traspaso_saldos")
    public String getCuentaTraspasoSaldos() {
        return cuentaTraspasoSaldos;
    }

    public void setCuentaTraspasoSaldos(String cuentaTraspasoSaldos) {
        this.cuentaTraspasoSaldos = cuentaTraspasoSaldos;
    }

    @Basic
    @Column(name = "fecha_traspaso_saldo")
    public Date getFechaTraspasoSaldo() {
        return fechaTraspasoSaldo;
    }

    public void setFechaTraspasoSaldo(Date fechaTraspasoSaldo) {
        this.fechaTraspasoSaldo = fechaTraspasoSaldo;
    }

    @Basic
    @Column(name = "codigo_afinidad")
    public Integer getCodigoAfinidad() {
        return codigoAfinidad;
    }

    public void setCodigoAfinidad(Integer codigoAfinidad) {
        this.codigoAfinidad = codigoAfinidad;
    }

    @Basic
    @Column(name = "codigo_rebaja")
    public String getCodigoRebaja() {
        return codigoRebaja;
    }

    public void setCodigoRebaja(String codigoRebaja) {
        this.codigoRebaja = codigoRebaja;
    }

    @Basic
    @Column(name = "codigo_pin")
    public BigInteger getCodigoPin() {
        return codigoPin;
    }

    public void setCodigoPin(BigInteger codigoPin) {
        this.codigoPin = codigoPin;
    }

    @Basic
    @Column(name = "pin_offset")
    public Integer getPinOffset() {
        return pinOffset;
    }

    public void setPinOffset(Integer pinOffset) {
        this.pinOffset = pinOffset;
    }

    @Basic
    @Column(name = "fecha_ult_pago")
    public Date getFechaUltPago() {
        return fechaUltPago;
    }

    public void setFechaUltPago(Date fechaUltPago) {
        this.fechaUltPago = fechaUltPago;
    }

    @Basic
    @Column(name = "codigo_vip")
    public BigInteger getCodigoVip() {
        return codigoVip;
    }

    public void setCodigoVip(BigInteger codigoVip) {
        this.codigoVip = codigoVip;
    }

    @Basic
    @Column(name = "codigo_habilita_compra_cuotas")
    public BigInteger getCodigoHabilitaCompraCuotas() {
        return codigoHabilitaCompraCuotas;
    }

    public void setCodigoHabilitaCompraCuotas(BigInteger codigoHabilitaCompraCuotas) {
        this.codigoHabilitaCompraCuotas = codigoHabilitaCompraCuotas;
    }

    @Basic
    @Column(name = "nro_interno_2")
    public Integer getNroInterno2() {
        return nroInterno2;
    }

    public void setNroInterno2(Integer nroInterno2) {
        this.nroInterno2 = nroInterno2;
    }

    @Basic
    @Column(name = "nro_solicitud_folio")
    public Integer getNroSolicitudFolio() {
        return nroSolicitudFolio;
    }

    public void setNroSolicitudFolio(Integer nroSolicitudFolio) {
        this.nroSolicitudFolio = nroSolicitudFolio;
    }

    @Basic
    @Column(name = "indicador_relacion")
    public String getIndicadorRelacion() {
        return indicadorRelacion;
    }

    public void setIndicadorRelacion(String indicadorRelacion) {
        this.indicadorRelacion = indicadorRelacion;
    }

    @Basic
    @Column(name = "adicionales")
    public BigInteger getAdicionales() {
        return adicionales;
    }

    public void setAdicionales(BigInteger adicionales) {
        this.adicionales = adicionales;
    }

    @Basic
    @Column(name = "dias_mora_real")
    public Integer getDiasMoraReal() {
        return diasMoraReal;
    }

    public void setDiasMoraReal(Integer diasMoraReal) {
        this.diasMoraReal = diasMoraReal;
    }

    @Basic
    @Column(name = "codigo_empleado")
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    @Basic
    @Column(name = "fecha_vencimiento_facturacion")
    public Date getFechaVencimientoFacturacion() {
        return fechaVencimientoFacturacion;
    }

    public void setFechaVencimientoFacturacion(Date fechaVencimientoFacturacion) {
        this.fechaVencimientoFacturacion = fechaVencimientoFacturacion;
    }

    @Basic
    @Column(name = "mora_121_150")
    public BigDecimal getMora121150() {
        return mora121150;
    }

    public void setMora121150(BigDecimal mora121150) {
        this.mora121150 = mora121150;
    }

    @Basic
    @Column(name = "mora_151_180")
    public BigDecimal getMora151180() {
        return mora151180;
    }

    public void setMora151180(BigDecimal mora151180) {
        this.mora151180 = mora151180;
    }

    @Basic
    @Column(name = "mora_181_210")
    public BigDecimal getMora181210() {
        return mora181210;
    }

    public void setMora181210(BigDecimal mora181210) {
        this.mora181210 = mora181210;
    }

    @Basic
    @Column(name = "mora_mas_210")
    public BigDecimal getMoraMas210() {
        return moraMas210;
    }

    public void setMoraMas210(BigDecimal moraMas210) {
        this.moraMas210 = moraMas210;
    }

    @Basic
    @Column(name = "codigo_segmentacion")
    public BigInteger getCodigoSegmentacion() {
        return codigoSegmentacion;
    }

    public void setCodigoSegmentacion(BigInteger codigoSegmentacion) {
        this.codigoSegmentacion = codigoSegmentacion;
    }

    @Basic
    @Column(name = "fecha_actualiza_segmentacion")
    public Date getFechaActualizaSegmentacion() {
        return fechaActualizaSegmentacion;
    }

    public void setFechaActualizaSegmentacion(Date fechaActualizaSegmentacion) {
        this.fechaActualizaSegmentacion = fechaActualizaSegmentacion;
    }

    @Basic
    @Column(name = "nro_cuenta_antigua")
    public String getNroCuentaAntigua() {
        return nroCuentaAntigua;
    }

    public void setNroCuentaAntigua(String nroCuentaAntigua) {
        this.nroCuentaAntigua = nroCuentaAntigua;
    }

    @Basic
    @Column(name = "filler_01")
    public String getFiller01() {
        return filler01;
    }

    public void setFiller01(String filler01) {
        this.filler01 = filler01;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "filler_02")
    public String getFiller02() {
        return filler02;
    }

    public void setFiller02(String filler02) {
        this.filler02 = filler02;
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
    @Column(name = "cuenta_purgada")
    public String getCuentaPurgada() {
        return cuentaPurgada;
    }

    public void setCuentaPurgada(String cuentaPurgada) {
        this.cuentaPurgada = cuentaPurgada;
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
    @Column(name = "monto_saldo_pendiente")
    public BigDecimal getMontoSaldoPendiente() {
        return montoSaldoPendiente;
    }

    public void setMontoSaldoPendiente(BigDecimal montoSaldoPendiente) {
        this.montoSaldoPendiente = montoSaldoPendiente;
    }

    @Basic
    @Column(name = "fecha_hora_saldo_pendiente")
    public Date getFechaHoraSaldoPendiente() {
        return fechaHoraSaldoPendiente;
    }

    public void setFechaHoraSaldoPendiente(Date fechaHoraSaldoPendiente) {
        this.fechaHoraSaldoPendiente = fechaHoraSaldoPendiente;
    }

    @Basic
    @Column(name = "fecha_hora_actualiza_montos")
    public Date getFechaHoraActualizaMontos() {
        return fechaHoraActualizaMontos;
    }

    public void setFechaHoraActualizaMontos(Date fechaHoraActualizaMontos) {
        this.fechaHoraActualizaMontos = fechaHoraActualizaMontos;
    }

    @Basic
    @Column(name = "codigo_estado_cuenta")
    public String getCodigoEstadoCuenta() {
        return codigoEstadoCuenta;
    }

    public void setCodigoEstadoCuenta(String codigoEstadoCuenta) {
        this.codigoEstadoCuenta = codigoEstadoCuenta;
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
}
