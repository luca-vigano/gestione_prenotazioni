package lucavigano.gestioneprenotazioni.repositories;

import lucavigano.gestioneprenotazioni.entities.Postazione;
import lucavigano.gestioneprenotazioni.enums.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {

    @Query("SELECT p FROM Postazione p WHERE p.tipo = :tipo AND p.edificio.citta = :citta")
    List<Postazione> findByTipoAndCitta(TipoPostazione tipo, String citta);

}
