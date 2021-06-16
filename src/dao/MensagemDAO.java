package dao;

import javax.persistence.EntityManager;

import model.Mensagem;

public class MensagemDAO extends GenericDAO<Integer,Mensagem>{

    public MensagemDAO(EntityManager entityManager) {
        super(entityManager);
    }
    
}
