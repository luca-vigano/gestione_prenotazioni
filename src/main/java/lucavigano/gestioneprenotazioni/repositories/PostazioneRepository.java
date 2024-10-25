package lucavigano.gestioneprenotazioni.repositories;

import lucavigano.gestioneprenotazioni.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {

    @Query("SELECT p FROM Postazione p WHERE p.tipo = :tipo AND p.edificio.citta = :citta")
    List<Postazione> findByTipoAndCitta(String tipo,String citta);

}
