package jpa.msservice.autogenerate.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "mcli_persona", schema = "admmcli", catalog = "dbcat")
@IdClass(McliPersonaEntityPK.class)
public class McliPersonaEntity {
    private String entidad;
    private int idCliente;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String primerNombre;
    private String segundoNombre;
    private Date fechaNacimiento;
    private Date fechaDefuncion;
    private Integer edadCliente;
    private String codigoGenero;
    private String codigoEstadoCivil;
    private String permanencia;
    private String codigoNivelEducacion;
    private String codigoProfesion;
    private String codigoInstitucionEstudio;
    private String codigoEspecialidad;
    private Integer idIsapre;
    private Integer idAfp;
    private String regimenConyugal;
    private String codigoTipoPension;
    private Integer cantidadHijos;
    private Integer cantidadCargas;
    private String clienteColaborador;
    private String codigoEstadoPersona;
    private Date fechaEstadoPersona;
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
    @Column(name = "apellido_paterno")
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    @Basic
    @Column(name = "apellido_materno")
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    @Basic
    @Column(name = "primer_nombre")
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    @Basic
    @Column(name = "segundo_nombre")
    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
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
    @Column(name = "fecha_defuncion")
    public Date getFechaDefuncion() {
        return fechaDefuncion;
    }

    public void setFechaDefuncion(Date fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }

    @Basic
    @Column(name = "edad_cliente")
    public Integer getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(Integer edadCliente) {
        this.edadCliente = edadCliente;
    }

    @Basic
    @Column(name = "codigo_genero")
    public String getCodigoGenero() {
        return codigoGenero;
    }

    public void setCodigoGenero(String codigoGenero) {
        this.codigoGenero = codigoGenero;
    }

    @Basic
    @Column(name = "codigo_estado_civil")
    public String getCodigoEstadoCivil() {
        return codigoEstadoCivil;
    }

    public void setCodigoEstadoCivil(String codigoEstadoCivil) {
        this.codigoEstadoCivil = codigoEstadoCivil;
    }

    @Basic
    @Column(name = "permanencia")
    public String getPermanencia() {
        return permanencia;
    }

    public void setPermanencia(String permanencia) {
        this.permanencia = permanencia;
    }

    @Basic
    @Column(name = "codigo_nivel_educacion")
    public String getCodigoNivelEducacion() {
        return codigoNivelEducacion;
    }

    public void setCodigoNivelEducacion(String codigoNivelEducacion) {
        this.codigoNivelEducacion = codigoNivelEducacion;
    }

    @Basic
    @Column(name = "codigo_profesion")
    public String getCodigoProfesion() {
        return codigoProfesion;
    }

    public void setCodigoProfesion(String codigoProfesion) {
        this.codigoProfesion = codigoProfesion;
    }

    @Basic
    @Column(name = "codigo_institucion_estudio")
    public String getCodigoInstitucionEstudio() {
        return codigoInstitucionEstudio;
    }

    public void setCodigoInstitucionEstudio(String codigoInstitucionEstudio) {
        this.codigoInstitucionEstudio = codigoInstitucionEstudio;
    }

    @Basic
    @Column(name = "codigo_especialidad")
    public String getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(String codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    @Basic
    @Column(name = "id_isapre")
    public Integer getIdIsapre() {
        return idIsapre;
    }

    public void setIdIsapre(Integer idIsapre) {
        this.idIsapre = idIsapre;
    }

    @Basic
    @Column(name = "id_afp")
    public Integer getIdAfp() {
        return idAfp;
    }

    public void setIdAfp(Integer idAfp) {
        this.idAfp = idAfp;
    }

    @Basic
    @Column(name = "regimen_conyugal")
    public String getRegimenConyugal() {
        return regimenConyugal;
    }

    public void setRegimenConyugal(String regimenConyugal) {
        this.regimenConyugal = regimenConyugal;
    }

    @Basic
    @Column(name = "codigo_tipo_pension")
    public String getCodigoTipoPension() {
        return codigoTipoPension;
    }

    public void setCodigoTipoPension(String codigoTipoPension) {
        this.codigoTipoPension = codigoTipoPension;
    }

    @Basic
    @Column(name = "cantidad_hijos")
    public Integer getCantidadHijos() {
        return cantidadHijos;
    }

    public void setCantidadHijos(Integer cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    @Basic
    @Column(name = "cantidad_cargas")
    public Integer getCantidadCargas() {
        return cantidadCargas;
    }

    public void setCantidadCargas(Integer cantidadCargas) {
        this.cantidadCargas = cantidadCargas;
    }

    @Basic
    @Column(name = "cliente_colaborador")
    public String getClienteColaborador() {
        return clienteColaborador;
    }

    public void setClienteColaborador(String clienteColaborador) {
        this.clienteColaborador = clienteColaborador;
    }

    @Basic
    @Column(name = "codigo_estado_persona")
    public String getCodigoEstadoPersona() {
        return codigoEstadoPersona;
    }

    public void setCodigoEstadoPersona(String codigoEstadoPersona) {
        this.codigoEstadoPersona = codigoEstadoPersona;
    }

    @Basic
    @Column(name = "fecha_estado_persona")
    public Date getFechaEstadoPersona() {
        return fechaEstadoPersona;
    }

    public void setFechaEstadoPersona(Date fechaEstadoPersona) {
        this.fechaEstadoPersona = fechaEstadoPersona;
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

        McliPersonaEntity that = (McliPersonaEntity) o;

        if (idCliente != that.idCliente) return false;
        if (entidad != null ? !entidad.equals(that.entidad) : that.entidad != null) return false;
        if (apellidoPaterno != null ? !apellidoPaterno.equals(that.apellidoPaterno) : that.apellidoPaterno != null)
            return false;
        if (apellidoMaterno != null ? !apellidoMaterno.equals(that.apellidoMaterno) : that.apellidoMaterno != null)
            return false;
        if (primerNombre != null ? !primerNombre.equals(that.primerNombre) : that.primerNombre != null) return false;
        if (segundoNombre != null ? !segundoNombre.equals(that.segundoNombre) : that.segundoNombre != null)
            return false;
        if (fechaNacimiento != null ? !fechaNacimiento.equals(that.fechaNacimiento) : that.fechaNacimiento != null)
            return false;
        if (fechaDefuncion != null ? !fechaDefuncion.equals(that.fechaDefuncion) : that.fechaDefuncion != null)
            return false;
        if (edadCliente != null ? !edadCliente.equals(that.edadCliente) : that.edadCliente != null) return false;
        if (codigoGenero != null ? !codigoGenero.equals(that.codigoGenero) : that.codigoGenero != null) return false;
        if (codigoEstadoCivil != null ? !codigoEstadoCivil.equals(that.codigoEstadoCivil) : that.codigoEstadoCivil != null)
            return false;
        if (permanencia != null ? !permanencia.equals(that.permanencia) : that.permanencia != null) return false;
        if (codigoNivelEducacion != null ? !codigoNivelEducacion.equals(that.codigoNivelEducacion) : that.codigoNivelEducacion != null)
            return false;
        if (codigoProfesion != null ? !codigoProfesion.equals(that.codigoProfesion) : that.codigoProfesion != null)
            return false;
        if (codigoInstitucionEstudio != null ? !codigoInstitucionEstudio.equals(that.codigoInstitucionEstudio) : that.codigoInstitucionEstudio != null)
            return false;
        if (codigoEspecialidad != null ? !codigoEspecialidad.equals(that.codigoEspecialidad) : that.codigoEspecialidad != null)
            return false;
        if (idIsapre != null ? !idIsapre.equals(that.idIsapre) : that.idIsapre != null) return false;
        if (idAfp != null ? !idAfp.equals(that.idAfp) : that.idAfp != null) return false;
        if (regimenConyugal != null ? !regimenConyugal.equals(that.regimenConyugal) : that.regimenConyugal != null)
            return false;
        if (codigoTipoPension != null ? !codigoTipoPension.equals(that.codigoTipoPension) : that.codigoTipoPension != null)
            return false;
        if (cantidadHijos != null ? !cantidadHijos.equals(that.cantidadHijos) : that.cantidadHijos != null)
            return false;
        if (cantidadCargas != null ? !cantidadCargas.equals(that.cantidadCargas) : that.cantidadCargas != null)
            return false;
        if (clienteColaborador != null ? !clienteColaborador.equals(that.clienteColaborador) : that.clienteColaborador != null)
            return false;
        if (codigoEstadoPersona != null ? !codigoEstadoPersona.equals(that.codigoEstadoPersona) : that.codigoEstadoPersona != null)
            return false;
        if (fechaEstadoPersona != null ? !fechaEstadoPersona.equals(that.fechaEstadoPersona) : that.fechaEstadoPersona != null)
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
        result = 31 * result + (apellidoPaterno != null ? apellidoPaterno.hashCode() : 0);
        result = 31 * result + (apellidoMaterno != null ? apellidoMaterno.hashCode() : 0);
        result = 31 * result + (primerNombre != null ? primerNombre.hashCode() : 0);
        result = 31 * result + (segundoNombre != null ? segundoNombre.hashCode() : 0);
        result = 31 * result + (fechaNacimiento != null ? fechaNacimiento.hashCode() : 0);
        result = 31 * result + (fechaDefuncion != null ? fechaDefuncion.hashCode() : 0);
        result = 31 * result + (edadCliente != null ? edadCliente.hashCode() : 0);
        result = 31 * result + (codigoGenero != null ? codigoGenero.hashCode() : 0);
        result = 31 * result + (codigoEstadoCivil != null ? codigoEstadoCivil.hashCode() : 0);
        result = 31 * result + (permanencia != null ? permanencia.hashCode() : 0);
        result = 31 * result + (codigoNivelEducacion != null ? codigoNivelEducacion.hashCode() : 0);
        result = 31 * result + (codigoProfesion != null ? codigoProfesion.hashCode() : 0);
        result = 31 * result + (codigoInstitucionEstudio != null ? codigoInstitucionEstudio.hashCode() : 0);
        result = 31 * result + (codigoEspecialidad != null ? codigoEspecialidad.hashCode() : 0);
        result = 31 * result + (idIsapre != null ? idIsapre.hashCode() : 0);
        result = 31 * result + (idAfp != null ? idAfp.hashCode() : 0);
        result = 31 * result + (regimenConyugal != null ? regimenConyugal.hashCode() : 0);
        result = 31 * result + (codigoTipoPension != null ? codigoTipoPension.hashCode() : 0);
        result = 31 * result + (cantidadHijos != null ? cantidadHijos.hashCode() : 0);
        result = 31 * result + (cantidadCargas != null ? cantidadCargas.hashCode() : 0);
        result = 31 * result + (clienteColaborador != null ? clienteColaborador.hashCode() : 0);
        result = 31 * result + (codigoEstadoPersona != null ? codigoEstadoPersona.hashCode() : 0);
        result = 31 * result + (fechaEstadoPersona != null ? fechaEstadoPersona.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (fechaUltActualizacion != null ? fechaUltActualizacion.hashCode() : 0);
        result = 31 * result + (idUsuario != null ? idUsuario.hashCode() : 0);
        return result;
    }
}
