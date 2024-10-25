package lucavigano.gestioneprenotazioni.repositories;

import lucavigano.gestioneprenotazioni.entities.Postazione;
import lucavigano.gestioneprenotazioni.entities.Prenotazione;
import lucavigano.gestioneprenotazioni.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {

    @Query("SELECT p FROM Prenotazione p WHERE p.postazione.id = :postazioneId AND p.dataPrenotazione = :dataPrenotazione")
    List<Prenotazione> findByPostazioneAndDataPrenotazione(Long postazioneId, LocalDate dataPrenotazione);

    @Query("SELECT p FROM Prenotazione p WHERE p.utente.id = :utenteId AND p.dataPrenotazione = :dataPrenotazione")
    List<Prenotazione> findByUtenteAndDataPrenotazione(Long utenteId, LocalDate dataPrenotazione);

}
