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

import model.enuns.StatusLog;
import model.enuns.TipoOperacao;

@Entity
@Table(name = "TBOD_logging")
public class Loging {

    @Id
    @Column(name = "id_log")
    @GeneratedValue
    private int idLog;

    @Column(name = "dt_log")
    private Date dtLog;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id_owner")
    private OwnerList dono;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id_lista")
    private List lista;

    //TODO relacao aqui
    @Column(name = "id_mensagem")
    private int idMensagem;
    
    @Column(name = "id_status")
    @Enumerated
    private StatusLog statusLog;

    @Column(name = "id_tipo_operacao")
    @Enumerated
    private TipoOperacao tipoOperacao;

    @Column(name = "ds_erro")
    private String dsErro;
}
