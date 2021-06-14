import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ListaJavaOrm {

    public static Logger logger = LoggerFactory.getLogger(ListaJavaOrm.class);

    public static void main(String[] args) throws Exception {
        System.out.println("Aloha, World!");

        logger.info("INICINADO BOT: PROJETO LISTUDO");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ListaJavaORM");

        factory.close();

        logger.info("FINALIZANDO O BOT");
    }
    
}
 