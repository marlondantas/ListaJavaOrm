package model.enuns;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbod_status_mensagem_enum")
public enum StatusMensagem {
    
    PREPARANDO(0),
    PREPARADA(1),
    AGENDADA(2),
    ENVIADA(3),
    FINALIZADA(4),
    ERRO(5);

    @Id
    @Column(name = "id_status")
    private int idStatus;

    @Column(name = "ds_status")
    private String descricaoStatus;
    
    StatusMensagem(int idstatus){
        this.idStatus = idstatus;
    }


    public int getIdStatus(){
        return this.idStatus;
    }
}
