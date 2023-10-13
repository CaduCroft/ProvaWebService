package br.senac.go.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TIPOCONTA")
public class TipoConta extends Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    @Column(name ="DATA_INICIO", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name ="DATA_FIM")
    private LocalDateTime dataFim;
}
