package cinema.dao.impl;

<<<<<<< HEAD
import cinema.dao.AbstractDao;
import cinema.dao.TicketDao;
import cinema.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
=======
import cinema.dao.TicketDao;
import cinema.exception.DataProcessingException;
import cinema.lib.Dao;
import cinema.model.Ticket;
import cinema.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Dao
public class TicketDaoImpl implements TicketDao {
    @Override
    public Ticket add(Ticket ticket) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(ticket);
            transaction.commit();
            return ticket;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't insert a ticket: " + ticket, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
>>>>>>> 954b4927790b5f1b7f4e3463eaccd4b71c4fc568
    }
}
