/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.repository.repository.cleaner.CleanerRepository
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 02.06.21, 00:04
 *  * @Version CleanerRepository.java : 1.0
 *
 */

package edu.coursework.zoo.repository.cleaner;

import edu.coursework.zoo.model.Cleaner;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CleanerRepository extends MongoRepository<Cleaner, String> {
}
