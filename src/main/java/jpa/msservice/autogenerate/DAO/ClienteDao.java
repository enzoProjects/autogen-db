package jpa.msservice.autogenerate.DAO;

import jpa.msservice.autogenerate.model.McliClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao extends JpaRepository<McliClienteEntity, String> {
}
