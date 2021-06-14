package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import model.enuns.TipoMensagem;
import model.enuns.StatusMensagem;

@Entity
@Table(name = "TBOD_mensagem")
public class Mensagem {
    
    @Id
    @Column(name = "id_mensagem")
    @GeneratedValue
    private int idMensagem;

    @Column(name = "cd_retorno_discord")
    private String retornoDiscord;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id_lista")
    private List lista;

    @ManyToOne()
    @JoinColumn(name = "id_OWNER")
    private OwnerList ownerRequisicao;

    @Column(name = "ds_response")
    private String response;
    @Column(name = "ds_request")
    private String request;

    @Column(name = "dt_cadastro")
    private Date dt_cadastro;
    @Column(name = "dt_envio")
    private Date dt_envio;

    @Enumerated
    @Column(name = "id_tipo_Mensagem")
    private TipoMensagem tipoMensagem;
    
    @Enumerated
    @Column(name = "id_status_mensagem")
    private StatusMensagem statusMensagem;

}
