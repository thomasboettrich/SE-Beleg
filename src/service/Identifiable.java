package service;

import java.io.Serializable;

/**
 * Defines an interface for objects that can be identified by an Identifier.
 * All Classes that persist in the database and have to be loaded via the generic
 * {@link IPersistenceContext} mechanism need to implement this. Only requirement
 * is that the used identifier is serializable.
 * <p/>
 *
 * @param <T> the entity of elements maintained by this mapping
 * @author Boettrich, Thomas (s67131@htw-dresden.de)
 */
public interface Identifiable<T extends Serializable> {

    /**
     * Return the (type) identity of this entity.
     *
     * @return T
     */
    T getId();
}

