package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import model.enuns.StatusAtivo;
import model.enuns.TipoOwner;

@Entity
@Table(name = "TBOD_OWNER")
public class OwnerList {

    @Id
    @Column(name = "id_OWNER",nullable=false)
    @GeneratedValue
    private int idOwner;
    
    @Column(name = "ID_STATUS",columnDefinition = "smallint",nullable=false)
    @Enumerated
    private StatusAtivo ativo;

    @Column(name = "CD_DISCORD",nullable=false)
    private String idDiscord;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CADASTRO",nullable=false,columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP")
    private Date DataCadastro;

    @Column(name = "ID_TIPO",columnDefinition = "smallint",nullable=false)
    @Enumerated
    private TipoOwner tipoOwner;
    
    public OwnerList(){

    }

    public int getIdOwner() {
        return this.idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public StatusAtivo getAtivo() {
        return this.ativo;
    }

    public void setAtivo(StatusAtivo ativo) {
        this.ativo = ativo;
    }

    public String getIdDiscord() {
        return this.idDiscord;
    }

    public void setIdDiscord(String idDiscord) {
        this.idDiscord = idDiscord;
    }

    public Date getDataCadastro() {
        return this.DataCadastro;
    }

    public void setDataCadastro(Date DataCadastro) {
        this.DataCadastro = DataCadastro;
    }

    public TipoOwner getTipoOwner() {
        return this.tipoOwner;
    }

    public void setTipoOwner(TipoOwner tipoOwner) {
        this.tipoOwner = tipoOwner;
    }


}
