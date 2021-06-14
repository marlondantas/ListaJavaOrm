package model.enuns;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javafx.animation.Animation.Status;


@Entity
@Table(name = "TBOD_status_ativo_ENUM")
public enum StatusAtivo {
    
    ATIVO(0),
    INATIVO(1);

    @Id
    @Column(name = "id_status")
    private int valorStatus;

    @Column(name = "ds_status")    
    private String descricaoStatus;

    StatusAtivo(int Status){
        this.valorStatus = Status;
    }

    public int geValorStatus(){
        return this.valorStatus;    
    }
}
