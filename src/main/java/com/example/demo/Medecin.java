package com.example.demo;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Setter @Getter
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String specialization;
    @OneToMany(mappedBy = "medecin", fetch = FetchType.LAZY)
    private Collection<RendezVous> rendezVous;
}
