package lucavigano.gestioneprenotazioni.services;

import lucavigano.gestioneprenotazioni.repositories.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostazioneService {

    @Autowired
    private PostazioneRepository postazioneRepository;
}
