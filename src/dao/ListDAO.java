package dao;

import javax.persistence.EntityManager;

import model.List;

public class ListDAO extends GenericDAO<Integer,List> {

    public ListDAO(EntityManager entityManager) {
        super(entityManager);
    }
    
}
