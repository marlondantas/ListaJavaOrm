package model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import model.enuns.StatusAtivo;
import model.enuns.TipoOwner;

@Entity
@Table(name = "TBOD_OWNER")
public class OwnerList {

    @Id
    @Column(name = "id_OWNER")
    @GeneratedValue
    private int idOwner;
    
    @Column(name = "ID_STATUS",columnDefinition = "smallint")
    @Enumerated
    private StatusAtivo ativo;

    @Column(name = "CD_DISCORD")
    private String idDiscord;

    @Column(name = "DT_CADASTRO")
    private Date DataCadastro;

    @Column(name = "ID_TIPO",columnDefinition = "smallint")
    @Enumerated
    private TipoOwner tipoOwner;
    
}
