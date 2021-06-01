/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.repository.repository.veterinarian.VeterinarianRepository
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 02.06.21, 00:04
 *  * @Version VeterinarianRepository.java : 1.0
 *
 */

package edu.coursework.zoo.repository.veterinarian;

import edu.coursework.zoo.model.Veterinarian;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinarianRepository extends MongoRepository<Veterinarian, String> {
}
