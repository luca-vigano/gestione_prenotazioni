package lucavigano.gestioneprenotazioni.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazione")
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "postazione_id")
    private Postazione postazione;

    private LocalDate dataPrenotazione;


    public Prenotazione(Utente utente, Postazione postazione, LocalDate dataPrenotazione) {
        this.utente = utente;
        this.postazione = postazione;
        this.dataPrenotazione = dataPrenotazione;
    }
}
