/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.repository.repository.posterity.PosterityRepository
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 02.06.21, 00:04
 *  * @Version PosterityRepository.java : 1.0
 *
 */

package edu.coursework.zoo.repository.posterity;

import edu.coursework.zoo.model.Posterity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosterityRepository extends MongoRepository<Posterity, String> {
}
