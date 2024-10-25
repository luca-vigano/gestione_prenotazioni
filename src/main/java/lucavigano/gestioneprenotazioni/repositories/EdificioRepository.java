package lucavigano.gestioneprenotazioni.repositories;

import lucavigano.gestioneprenotazioni.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Long> {
}
