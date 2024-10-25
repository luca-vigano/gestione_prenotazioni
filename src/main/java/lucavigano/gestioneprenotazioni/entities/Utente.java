package lucavigano.gestioneprenotazioni.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "utente")

public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String nome;
    private String cognome;
    private String email;
}
