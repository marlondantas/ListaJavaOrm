package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import model.enuns.PrivacidadeLista;
import model.enuns.TipoLista;
import model.enuns.StatusAtivo;

@Entity
@Table(name = "TBOD_lista")
public class List {
    
    @Id
    @Column(name = "id_lista")
    @GeneratedValue
    private int idList;
    
    @Column(name = "dt_cadastro")
    private Date dtCadastro;
    @Column(name = "dt_alteracao")
    private Date dtAlteracao;

    @Column(name = "id_ativo")
    @Enumerated
    private StatusAtivo ativo;

    @Column(name = "ds_titulo")
    private String titulo;

    @Column(name = "id_privacidade")
    @Enumerated
    private PrivacidadeLista privacidadeLista;

    @Enumerated
    @Column(name = "id_tipo_lista")
    private TipoLista tipoLista;
    
}
