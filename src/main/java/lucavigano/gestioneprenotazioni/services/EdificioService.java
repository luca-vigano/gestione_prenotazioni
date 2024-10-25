package lucavigano.gestioneprenotazioni.services;

import lucavigano.gestioneprenotazioni.entities.Edificio;
import lucavigano.gestioneprenotazioni.repositories.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificioService {

    @Autowired
    private EdificioRepository edificioRepository;

    public void salvaEdificio(Edificio newEdificio) {
        // se ho tempo inserire controlli
        edificioRepository.save(newEdificio);
    }
}
