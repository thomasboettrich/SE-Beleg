package service;

import data.Autor;
import data.Verlag;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Book Service zum Verarbeiten von Autor-, Verlags- und Medien-Daten
 *
 * @author Boettrich, Thomas (s67131@htw-dresden.de)
 */
public class BookService {

    // TODO: intecsoft DataService !!!
    private EntityManager entityManager = new EntityManager() {
    };

    @PersistenceContext
    public void setEntityManager(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    /**
     * Liefert den Autor fuer einen uebergebenen BuchNummern-String
     *
     * @param buchNr Nummer des Buches
     * @return Name des Autors
     */
    public Autor getAutor (String buchNr) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Autor> criteriaQuery = criteriaBuilder.createQuery(Autor.class);
        Root<Autor> root = criteriaQuery.from(Autor.class);
        Predicate equalsBookID = criteriaBuilder.equal(root.<String>get("BuchNr"), buchNr);
        criteriaQuery.where(equalsBookID);
        TypedQuery<Autor> typedQuery = entityManager.createQuery(criteriaQuery);
        return typedQuery.getSingleResult();
    }

    /**
     * Liefert den Verlag fuer einen uebergebenen BuchNummern-String
     *
     * @param buchNr Nummer des Buches
     * @return Name des Verlags
     */
    public Verlag getVerlag(String buchNr) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Verlag> criteriaQuery = criteriaBuilder.createQuery(Verlag.class);
        Root<Verlag> root = criteriaQuery.from(Verlag.class);
        Predicate equalsBookID = criteriaBuilder.equal(root.<String>get("BuchNr"), buchNr);
        criteriaQuery.where(equalsBookID);
        TypedQuery<Verlag> typedQuery = entityManager.createQuery(criteriaQuery);
        return typedQuery.getSingleResult();
    }
}
