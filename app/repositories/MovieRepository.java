package repositories;

import models.Movie;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Created by abenhmida on 08/07/15.
 */
public interface MovieRepository extends GraphRepository<Movie> {
}
