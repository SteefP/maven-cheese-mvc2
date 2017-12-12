package nl.rsvier.models.data;

import javax.transaction.Transactional;

import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

import nl.rsvier.models.Category;


@Repository
@Transactional
public interface CategoryDao extends CrudRepository<Category, Integer> {

}
