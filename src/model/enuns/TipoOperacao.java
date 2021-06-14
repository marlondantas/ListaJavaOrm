package model.enuns;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbod_tipo_OPERACAO_enum")
public enum TipoOperacao {
    
    ADD_ITEM(0);
    
    @Id
    @Column(name = "id_status")
    private int idStatus;

    @Column(name = "ds_status")
    private String descricaoStatus;
    
    TipoOperacao(int idstatus){
        this.idStatus = idstatus;
    }


    public int getIdStatus(){
        return this.idStatus;
    }


}
