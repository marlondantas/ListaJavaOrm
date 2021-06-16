package dao;

import javax.persistence.EntityManager;

import model.OwnerList;

public class OwnerListDAO extends GenericDAO<Integer,OwnerList> {

    public OwnerListDAO(EntityManager entityManager) {
        super(entityManager);
    }
    
}
