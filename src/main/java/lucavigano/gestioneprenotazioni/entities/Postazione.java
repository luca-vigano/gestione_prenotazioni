package lucavigano.gestioneprenotazioni.entities;


import jakarta.persistence.*;
import lombok.*;
import lucavigano.gestioneprenotazioni.enums.TipoPostazione;

@Entity
@Table(name = "postazione")
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoPostazione tipoPostazione;

    private int numeroMaxOccupanti;

    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

    public Postazione(String descrizione, TipoPostazione tipoPostazione, int numeroMaxOccupanti, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.numeroMaxOccupanti = numeroMaxOccupanti;
        this.edificio = edificio;
    }
}
