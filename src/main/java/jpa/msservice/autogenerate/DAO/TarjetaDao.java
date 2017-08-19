package jpa.msservice.autogenerate.DAO;

import jpa.msservice.autogenerate.model.MctaMaestroTarjetaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarjetaDao extends JpaRepository<MctaMaestroTarjetaEntity, String> {
}
