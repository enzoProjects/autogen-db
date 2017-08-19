package jpa.msservice.autogenerate.DAO;

import jpa.msservice.autogenerate.model.McliEmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaDao extends JpaRepository<McliEmpresaEntity, String> {
}
