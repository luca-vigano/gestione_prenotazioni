package lucavigano.gestioneprenotazioni.repositories;

import lucavigano.gestioneprenotazioni.entities.Postazione;
import lucavigano.gestioneprenotazioni.entities.Prenotazione;
import lucavigano.gestioneprenotazioni.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {

    List<Prenotazione> findByPostazione_IdAndDataPrenotazione(Postazione postazione, LocalDate dataPrenotazione);
    List<Prenotazione> findByUtente_IdAndDataPrenotazione(Utente utente, LocalDate dataPrenotazione);
}
