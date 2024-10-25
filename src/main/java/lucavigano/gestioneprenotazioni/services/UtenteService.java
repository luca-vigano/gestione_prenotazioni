package lucavigano.gestioneprenotazioni.services;

import lombok.extern.slf4j.Slf4j;
import lucavigano.gestioneprenotazioni.entities.Utente;
import lucavigano.gestioneprenotazioni.exceptions.ValidationException;
import lucavigano.gestioneprenotazioni.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UtenteService {

    @Autowired
    private UtenteRepository utenteRepository;

    public void saveUtente (Utente newUtente){
        if(utenteRepository.existsByEmail(newUtente.getEmail())) throw new ValidationException("Email già usata");
        utenteRepository.save(newUtente);
        log.info("l'Utente " + newUtente.getUsername() + " è stato salvato correttamente");
    }
}
