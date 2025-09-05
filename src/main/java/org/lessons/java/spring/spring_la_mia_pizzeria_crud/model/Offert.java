package org.lessons.java.spring.spring_la_mia_pizzeria_crud.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "offerts")
public class Offert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "offert_id", nullable = false)
    private Pizza pizza;

    // una data di inizio
    @NotNull(message = "L'offerta deve pur iniziare")
    private LocalDate offerDate;

    // una data di fine
    @NotNull(message = "Dovrà pur finire quest'offerta no??")
    private LocalDate finishOfferDate;

    // un titolo
    @Size(max = 25, message = "Un pò troppo non credi?")
    private String titleOffer;
}
