package model.enuns;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbod_tipo_item_enum")
public enum TipoItem {
    
    NORMAL(0);

    @Id
    @Column(name = "id_status")
    private int idStatus;

    @Column(name = "ds_status")
    private String descricaoStatus;
    
    TipoItem(int idstatus){
        this.idStatus = idstatus;
    }

    public int getIdStatus(){
        return this.idStatus;
    }
}
