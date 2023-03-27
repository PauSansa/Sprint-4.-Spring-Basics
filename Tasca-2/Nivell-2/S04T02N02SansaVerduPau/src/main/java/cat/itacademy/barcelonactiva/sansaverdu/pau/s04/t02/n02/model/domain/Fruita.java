package cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Fruita")
public class Fruita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    private int quantitatQuilos;

    public Fruita() {
    }

    public Fruita(int id, String nom, int quantitatQuilos) {
        this.id = id;
        this.nom = nom;
        this.quantitatQuilos = quantitatQuilos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantitatQuilos() {
        return quantitatQuilos;
    }

    public void setQuantitatQuilos(int quantitatQuilos) {
        this.quantitatQuilos = quantitatQuilos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruita fruita = (Fruita) o;
        return id == fruita.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
