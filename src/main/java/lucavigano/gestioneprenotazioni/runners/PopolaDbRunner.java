package lucavigano.gestioneprenotazioni.runners;

import lucavigano.gestioneprenotazioni.entities.Edificio;
import lucavigano.gestioneprenotazioni.entities.Postazione;
import lucavigano.gestioneprenotazioni.entities.Prenotazione;
import lucavigano.gestioneprenotazioni.entities.Utente;
import lucavigano.gestioneprenotazioni.enums.TipoPostazione;
import lucavigano.gestioneprenotazioni.repositories.PostazioneRepository;
import lucavigano.gestioneprenotazioni.repositories.UtenteRepository;
import lucavigano.gestioneprenotazioni.services.EdificioService;
import lucavigano.gestioneprenotazioni.services.PostazioneService;
import lucavigano.gestioneprenotazioni.services.PrenotazioneService;
import lucavigano.gestioneprenotazioni.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Optional;

@Component
public class PopolaDbRunner implements CommandLineRunner {
    @Autowired
    private UtenteService utenteService;

    @Autowired
    private PrenotazioneService prenotazioneService;

    @Autowired
    private EdificioService edificioService;

    @Autowired
    private PostazioneService postazioneService;

    @Override
    public void run(String... args) throws Exception {


//        Utente utente1 = new Utente("Pippo", "Mario", "Rossi","mario@rossi.com");
//        Utente utente2 = new Utente("Pluto", "Gaia", "Verdi","gaia@verdi.com");
//        Utente utente3 = new Utente("Paperino", "aldo", "Baglio","aldo@baglio.com");
//
//        utenteService.saveUtente(utente1);
//        utenteService.saveUtente(utente2);
//        utenteService.saveUtente(utente3);
//
//        Edificio edificio1 = new Edificio("Duomo","piazza duomo","Milano");
//        Edificio edificio2 = new Edificio("Colosseo","via al colosseo","Roma");
//        Edificio edificio3 = new Edificio("Gondola","via delle gondole","Venezia");
//
//        edificioService.salvaEdificio(edificio1);
//        edificioService.salvaEdificio(edificio2);
//        edificioService.salvaEdificio(edificio3);
//
//        Postazione postazione1 = new Postazione("Piccola ma attrezzata", TipoPostazione.PRIVATO,20,edificio3);
//        Postazione postazione2 = new Postazione("Ampio spazio", TipoPostazione.OPENSPACE,100,edificio1);
//        Postazione postazione3 = new Postazione("Vista colosseo", TipoPostazione.SALA_RIUNIONI,10,edificio2);
//
//        postazioneService.savePostazione(postazione1);
//        postazioneService.savePostazione(postazione2);
//        postazioneService.savePostazione(postazione3);

        Utente utentefromdb = utenteService.findById(1L);
        System.out.println(utentefromdb);

        Postazione postazionefromdb = postazioneService.findById(1L);
        System.out.println(postazionefromdb);



//        Prenotazione prenotazione1 = new Prenotazione(utentefromdb,postazionefromdb, LocalDate.now());
//        Prenotazione prenotazione2 = new Prenotazione(utente2,postazione2, LocalDate.now());
//        Prenotazione prenotazione3 = new Prenotazione(utente3,postazione3, LocalDate.now());
//
//        prenotazioneService.salvaPrenotazione(prenotazione1);
//        prenotazioneService.salvaPrenotazione(prenotazione2);
//        prenotazioneService.salvaPrenotazione(prenotazione3);







    }
}
