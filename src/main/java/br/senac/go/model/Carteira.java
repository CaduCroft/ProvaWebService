package br.senac.go.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
@Entity
@Table(name= "CARTEIRA")
public class Carteira {

    @Id //fala que este item é chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) //auto-incremental
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOME", length = 120, nullable = false)
    private String nome;
=======
@Entity //Esta anotação o ORM faz o controle de estado desta classe
@Table(name = "CARTEIRA")
public class Carteira {

    @Id //fala que este item é chave primária
    @GeneratedValue(strategy= GenerationType.AUTO) //auto-incremental
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOME", length = 120, nullable = false)
    private String nome;

>>>>>>> b059dfe5e908ab84e15813cf94ea8ac791fd879c
    @Column(name = "DESCRICAO", length = 120, nullable = false)
    private String descricao;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<Pessoa> pessoas = new ArrayList<>();
<<<<<<< HEAD
=======

>>>>>>> b059dfe5e908ab84e15813cf94ea8ac791fd879c
}
