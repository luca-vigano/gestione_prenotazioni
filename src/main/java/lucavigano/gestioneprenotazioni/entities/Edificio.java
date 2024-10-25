package lucavigano.gestioneprenotazioni.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "edificio")
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    private String nome;
    private String inidizzo;
    private String citta;

    public Edificio(String nome, String inidizzo, String citta) {
        this.nome = nome;
        this.inidizzo = inidizzo;
        this.citta = citta;
    }
}
