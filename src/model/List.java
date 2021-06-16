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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id_OWNER")
    private OwnerList ownerList;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_cadastro",nullable=false,columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP")
    private Date dtCadastro;

    @Temporal(TemporalType.TIMESTAMP)
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

    public List() {
        this.setDtCadastro(new Date());
    }
    
    public List(String nome) {
        this.setDtCadastro(new Date());
        this.setTitulo(nome);
    }

    public int getIdList() {
        return this.idList;
    }

    public void setIdList(int idList) {
        this.idList = idList;
    }

    public OwnerList getOwnerList() {
        return this.ownerList;
    }

    public void setOwnerList(OwnerList ownerList) {
        this.ownerList = ownerList;
    }

    public Date getDtCadastro() {
        return this.dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public Date getDtAlteracao() {
        return this.dtAlteracao;
    }

    public void setDtAlteracao(Date dtAlteracao) {
        this.dtAlteracao = dtAlteracao;
    }

    public StatusAtivo getAtivo() {
        return this.ativo;
    }

    public void setAtivo(StatusAtivo ativo) {
        this.ativo = ativo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public PrivacidadeLista getPrivacidadeLista() {
        return this.privacidadeLista;
    }

    public void setPrivacidadeLista(PrivacidadeLista privacidadeLista) {
        this.privacidadeLista = privacidadeLista;
    }

    public TipoLista getTipoLista() {
        return this.tipoLista;
    }

    public void setTipoLista(TipoLista tipoLista) {
        this.tipoLista = tipoLista;
    }
    
}
