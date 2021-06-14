package model.enuns;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbod_status_log_enum")
public enum StatusLog {
    
    INICIANDO(0),
    FIANLIZADO(1),
    ERRO(2);

    @Id
    @Column(name = "id_status")
    private int idStatus;

    @Column(name = "ds_status")
    private String descricaoStatus;

    StatusLog(int status){
        this.idStatus = status;
    }

    public int getIdStatus(){
        return this.idStatus;
    }

}
