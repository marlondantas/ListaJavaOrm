package model.enuns;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBOD_PRIVACIDADE_LISTA_ENUM")
public enum PrivacidadeLista {
    
    PUBLICO(0,"PUBLICO"),
    PRIVADO(1,"PRIVADO"),
    PROTEGIDO(2,"PROTEGIDO");

    @Id
    @Column(name = "id_privacidade")
    private int idPrivacidade;
    
    @Column(name = "ds_privacidade")
    private String descricaoPrivacidade;

    PrivacidadeLista(int tipo, String descricao){
        this.idPrivacidade = tipo;
        this.descricaoPrivacidade = descricao;
    }

    public int getIdPrivacidade(){
        return this.idPrivacidade;
    }

}
