package lucavigano.gestioneprenotazioni.services;

import lucavigano.gestioneprenotazioni.entities.Postazione;
import lucavigano.gestioneprenotazioni.enums.TipoPostazione;
import lucavigano.gestioneprenotazioni.exceptions.NotFoundException;
import lucavigano.gestioneprenotazioni.repositories.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {

    @Autowired
    private PostazioneRepository postazioneRepository;

    public void savePostazione (Postazione newPostazione) {
        // se ho tempo mettere controlli
        postazioneRepository.save(newPostazione);
    }

    public Postazione findById (long postazioneId){
        return postazioneRepository.findById(postazioneId).orElseThrow(() -> new NotFoundException(postazioneId));
    }

    public List<Postazione> cercaPostazioniPerTipoECitta(TipoPostazione tipo, String citta) {
        return postazioneRepository.findByTipoAndCitta(tipo, citta);
    }
}
