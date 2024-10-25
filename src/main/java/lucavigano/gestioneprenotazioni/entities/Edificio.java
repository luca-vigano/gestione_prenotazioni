package lucavigano.gestioneprenotazioni.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "edificio")
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String inidizzo;
    private String citta;

}
