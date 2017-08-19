package jpa.msservice.autogenerate.DAO;

import jpa.msservice.autogenerate.model.McliPersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDao extends JpaRepository<McliPersonaEntity, String> {
}
