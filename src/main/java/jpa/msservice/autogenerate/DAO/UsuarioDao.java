package jpa.msservice.autogenerate.DAO;

import jpa.msservice.autogenerate.model.McorUsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<McorUsuarioEntity, String> {
}
