package model.enuns;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbod_tipo_mensagem_enum")
public enum TipoMensagem {
        
    NORMAL(0),
    AGENDADA(1);
    
    @Id
    @Column(name = "id_status")
    private int idStatus;

    @Column(name = "ds_status")
    private String descricaoStatus;
    
    TipoMensagem(int idstatus){
        this.idStatus = idstatus;
    }


    public int getIdStatus(){
        return this.idStatus;
    }

}
