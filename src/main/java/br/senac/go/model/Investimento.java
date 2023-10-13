package br.senac.go.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "INVESTIMENTO")
public class Investimento {

    @Id //fala que este item é chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) //auto-incremental
    @Column(name = "ID")
    private Integer id;
    @Column(name = "SALDO", nullable = false)
    private BigDecimal saldo;

    @Column(name = "SALDOINICIAL", nullable = false)
    private BigDecimal saldoInicial;

    @Column(name = "DESCRICAO", length = 120, nullable = false)
    private String descricao;

    @Column(name ="DATA_INICIO", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name ="DATA_FIM")
    private LocalDateTime dataFim;
}

