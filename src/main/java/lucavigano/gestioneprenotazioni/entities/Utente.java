package lucavigano.gestioneprenotazioni.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "utente")
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    private String username;
    private String nome;
    private String cognome;
    private String email;


    public Utente(String username, String nome, String cognome, String email) {
        this.username = username;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }
}
