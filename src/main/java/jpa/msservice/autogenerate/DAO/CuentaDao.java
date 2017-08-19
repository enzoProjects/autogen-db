package jpa.msservice.autogenerate.DAO;

import jpa.msservice.autogenerate.model.MctaMaestroCuentaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaDao extends JpaRepository<MctaMaestroCuentaEntity, String> {
}
