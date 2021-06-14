package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import model.enuns.StatusAtivo;

@Entity
@Table(name = "TBOD_item_lista")
public class ItemList {
    
    @Id
    @Column(name = "id_item_lista")
    @GeneratedValue
    private int idItemList;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id_lista")
    private List lista;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id_OWNER")
    private OwnerList ownerAutor;

    @Column(name = "ds_cricao")
    private Date dtCriacao;

    @Column(name = "is_status")
    @Enumerated
    private StatusAtivo statusAtivo;

    @Column(name = "ds_conteudo")
    private String conteudo;
    @Column(name = "fl_marcado")
    private boolean marcado;
    @Column(name = "dt_agendado")
    private Date agendado;

    //TODO Fazer o tipo de lista.
    
}
