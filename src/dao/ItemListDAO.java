package dao;

import javax.persistence.EntityManager;

import model.ItemList;

public class ItemListDAO extends GenericDAO<Integer,ItemList>{

    public ItemListDAO(EntityManager entityManager) {
        super(entityManager);
    }
    
}
