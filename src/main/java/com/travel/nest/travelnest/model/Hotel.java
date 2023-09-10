package com.travel.nest.travelnest.model;

import org.springframework.data.geo.Point;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "hoteis")
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome")
    @NotEmpty
    private String nome;

    @Column(name = "posicaoX")
    @NotNull
    private Point posicaoX;

    @Column(name = "posicaoY")
    @NotNull
    private Point posicaoY;

}
