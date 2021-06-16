package model;

import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import model.enuns.StatusAtivo;

@Entity
@Table(name = "TBOD_item_lista")
public class ItemList {
    
    @Id
    @Column(name = "id_item_lista")
    @GeneratedValue
    private int idItemList;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id_lista",nullable=false)
    private List lista;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id_OWNER",nullable=false)
    private OwnerList ownerAutor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_cadastro",nullable=false,columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP")
    private Date dtCriacao;

    @Column(name = "id_status")
    @Enumerated
    private StatusAtivo statusAtivo;

    @Column(name = "ds_conteudo")
    private String conteudo;
    @Column(name = "fl_marcado")
    private boolean marcado;
    @Column(name = "dt_agendado")
    private Date agendado;

    //TODO Fazer o tipo de lista.

    public ItemList(){
        this.setDtCriacao(new Date());
    }


    public int getIdItemList() {
        return this.idItemList;
    }

    public void setIdItemList(int idItemList) {
        this.idItemList = idItemList;
    }

    public List getLista() {
        return this.lista;
    }

    public void setLista(List lista) {
        this.lista = lista;
    }

    public OwnerList getOwnerAutor() {
        return this.ownerAutor;
    }

    public void setOwnerAutor(OwnerList ownerAutor) {
        this.ownerAutor = ownerAutor;
    }

    public Date getDtCriacao() {
        return this.dtCriacao;
    }

    public void setDtCriacao(Date dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    public StatusAtivo getStatusAtivo() {
        return this.statusAtivo;
    }

    public void setStatusAtivo(StatusAtivo statusAtivo) {
        this.statusAtivo = statusAtivo;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public boolean isMarcado() {
        return this.marcado;
    }

    public boolean getMarcado() {
        return this.marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }

    public Date getAgendado() {
        return this.agendado;
    }

    public void setAgendado(Date agendado) {
        this.agendado = agendado;
    }
    
}
