package lucavigano.gestioneprenotazioni.services;

import lucavigano.gestioneprenotazioni.entities.Utente;
import lucavigano.gestioneprenotazioni.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {

    @Autowired
    private UtenteRepository utenteRepository;

    public void saveUtente (Utente newUtente){

    }
}
