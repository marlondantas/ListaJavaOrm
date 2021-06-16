package dao;

import javax.persistence.EntityManager;

import model.Loging;

public class LogingDAO extends GenericDAO<Integer,Loging>{

    public LogingDAO(EntityManager entityManager) {
        super(entityManager);
        //TODO Auto-generated constructor stub
    }
    
}
