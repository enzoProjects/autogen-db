package jpa.msservice.autogenerate.model;

import javax.persistence.*;

@Entity
@Table(name = "mcor_usuario", schema = "admmcor", catalog = "dbcat")
@IdClass(McorUsuarioEntityPK.class)
public class McorUsuarioEntity {
    private String entidad;
    private int idUsuario;
    private Integer idUsuarioSuperior;
    private Integer idUsuarioBaja;
    private Integer idUsuarioActualiza;
    private Integer codigo_usuario;

    @Id
    @Column(name = "entidad")
    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    @Id
    @Column(name = "id_usuario")
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Basic
    @Column(name = "id_usuario_superior")
    public Integer getIdUsuarioSuperior() {
        return idUsuarioSuperior;
    }

    public void setIdUsuarioSuperior(Integer idUsuarioSuperior) {
        this.idUsuarioSuperior = idUsuarioSuperior;
    }

    @Basic
    @Column(name = "id_usuario_baja")
    public Integer getIdUsuarioBaja() {
        return idUsuarioBaja;
    }

    public void setIdUsuarioBaja(Integer idUsuarioBaja) {
        this.idUsuarioBaja = idUsuarioBaja;
    }

    @Basic
    @Column(name = "id_usuario_actualiza")
    public Integer getIdUsuarioActualiza() {
        return idUsuarioActualiza;
    }

    public void setIdUsuarioActualiza(Integer idUsuarioActualiza) {
        this.idUsuarioActualiza = idUsuarioActualiza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        McorUsuarioEntity that = (McorUsuarioEntity) o;

        if (idUsuario != that.idUsuario) return false;
        if (entidad != null ? !entidad.equals(that.entidad) : that.entidad != null) return false;
        if (idUsuarioSuperior != null ? !idUsuarioSuperior.equals(that.idUsuarioSuperior) : that.idUsuarioSuperior != null)
            return false;
        if (idUsuarioBaja != null ? !idUsuarioBaja.equals(that.idUsuarioBaja) : that.idUsuarioBaja != null)
            return false;
        if (idUsuarioActualiza != null ? !idUsuarioActualiza.equals(that.idUsuarioActualiza) : that.idUsuarioActualiza != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = entidad != null ? entidad.hashCode() : 0;
        result = 31 * result + idUsuario;
        result = 31 * result + (idUsuarioSuperior != null ? idUsuarioSuperior.hashCode() : 0);
        result = 31 * result + (idUsuarioBaja != null ? idUsuarioBaja.hashCode() : 0);
        result = 31 * result + (idUsuarioActualiza != null ? idUsuarioActualiza.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "codigo_usuario")
    public Integer getCodigo_usuario() {
        return codigo_usuario;
    }

    public void setCodigo_usuario(Integer codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }
}
