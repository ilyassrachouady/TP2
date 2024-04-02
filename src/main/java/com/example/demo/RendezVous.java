package com.example.demo;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Setter @Getter
public class RendezVous {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private boolean cancelled;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Medecin medecin;
    @OneToOne(mappedBy = "rendezVous")
    private Consultation consultation;
}
