package br.senac.go.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "TIPOINVESTIMENTO")
public class TipoInvestimento {

    @Id //fala que este item é chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) //auto-incremental
    @Column(name = "ID")
    private Integer id;
    @Column(name = "TEMRISCO", nullable = false)
    private boolean temRisco;

    @Column(name = "DESCRICAO", length = 120, nullable = false)
    private String descricao;

    @Column(name ="DATA_INICIO", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name ="DATA_FIM")
    private LocalDateTime dataFim;
}

