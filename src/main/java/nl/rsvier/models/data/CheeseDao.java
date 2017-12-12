package nl.rsvier.models.data;

import javax.transaction.Transactional;

import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

import nl.rsvier.models.Cheese;


@Repository
@Transactional
public interface CheeseDao extends CrudRepository<Cheese, Integer> {

}
