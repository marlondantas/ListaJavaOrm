import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.*;
import model.enuns.PrivacidadeLista;
import model.enuns.StatusAtivo;
import model.enuns.TipoLista;
import model.enuns.TipoOwner;
import dao.*;

import java.util.Date;


public class ListaJavaOrm {

    public static Logger logger = LoggerFactory.getLogger(ListaJavaOrm.class);
    public static EntityManagerFactory factory;

    public static void main(String[] args) throws Exception {
        
        logger.info("Aloha, World!");

        logger.info("INICINADO BOT: PROJETO LISTUDO");

        ListaJavaOrm.factory = Persistence.createEntityManagerFactory("ListaJavaORM");


        OwnerListDAO ownerListDAO = new OwnerListDAO(ListaJavaOrm.factory.createEntityManager());

        logger.info("TESTANDO O BANCO!");

        logger.info("Buscado o Owner para criacao de lista");

        //OwnerList listaPrincipal =ownerListDAO.getById(1);
        OwnerList listaPrincipal = new OwnerList();
        
        listaPrincipal.setAtivo(StatusAtivo.ATIVO);
        listaPrincipal.setDataCadastro(new Date());
        listaPrincipal.setIdDiscord("");
        listaPrincipal.setTipoOwner(TipoOwner.USUARIO);

        ownerListDAO.save(listaPrincipal);

        ListDAO listDAO = new ListDAO(ListaJavaOrm.factory.createEntityManager());

        //List novalist = listDAO.getById(3);
        List novalist = new List();
        
        novalist.setDtCadastro(new Date());
        novalist.setAtivo(StatusAtivo.ATIVO);
        novalist.setPrivacidadeLista(PrivacidadeLista.PUBLICO);
        novalist.setTipoLista(TipoLista.PADRAO);
        novalist.setTitulo("MEU TESTES AMIGOS");
        novalist.setOwnerList(listaPrincipal);

        listDAO.save(novalist);
    
        ItemListDAO itemListDAO = new ItemListDAO(ListaJavaOrm.factory.createEntityManager()); 

        for (int i = 0; i < 10; i++) {
            ItemList novoitem = new ItemList();
        
            novoitem.setOwnerAutor(listaPrincipal);
            novoitem.setLista(novalist);
    
            novoitem.setConteudo("conteudo: ->" + i);
            novoitem.setDtCriacao(new Date());
            novoitem.setStatusAtivo(StatusAtivo.ATIVO);
            
            itemListDAO.save(novoitem);
        }

        factory.close();

        logger.info("FINALIZANDO O BOT");
    }
    
}
 