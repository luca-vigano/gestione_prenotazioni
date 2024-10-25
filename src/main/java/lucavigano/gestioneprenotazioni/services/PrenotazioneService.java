package lucavigano.gestioneprenotazioni.services;


import lucavigano.gestioneprenotazioni.entities.Prenotazione;
import lucavigano.gestioneprenotazioni.exceptions.ValidationException;
import lucavigano.gestioneprenotazioni.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrenotazioneService {
     @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public void salvaPrenotazione(Prenotazione newPrenotazione) {
        List<Prenotazione> listaPrenotazioni = prenotazioneRepository.findByPostazioneAndDataPrenotazione(newPrenotazione.getPostazione().getId(),newPrenotazione.getDataPrenotazione());
        List <Prenotazione> listaConfrontoDate = prenotazioneRepository.findByUtenteAndDataPrenotazione(newPrenotazione.getUtente().getId(),newPrenotazione.getDataPrenotazione());
        if(listaPrenotazioni.isEmpty()) throw new ValidationException("Postazione già prenotata per quella data");
        if(listaConfrontoDate.isEmpty()) throw new ValidationException("Hai già una prenotazione fatta per quella data");

        prenotazioneRepository.save(newPrenotazione);
    }


}
