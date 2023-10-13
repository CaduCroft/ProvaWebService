package br.senac.go.model;

import jakarta.persistence.*;
import lombok.Data;

<<<<<<< HEAD
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "CONTA")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
=======
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data //fazer o get,set,hascode, equals - Lombok
@Entity //ORM controle o estado do objeto
@Table(name = "CONTA")
public class Conta {

    @Id //indica chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) //indica a foma de gerar a chave primária
>>>>>>> b059dfe5e908ab84e15813cf94ea8ac791fd879c
    private Integer id;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

<<<<<<< HEAD
    @Column(name = "LIMITECONTA", nullable = false)
    private BigDecimal limiteConta;

    @Column(name ="DATA_INICIO", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name ="DATA_FIM")
=======
    @Column(name = "DATA_INICIO", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name = "DATA_FIM")
>>>>>>> b059dfe5e908ab84e15813cf94ea8ac791fd879c
    private LocalDateTime dataFim;
}
