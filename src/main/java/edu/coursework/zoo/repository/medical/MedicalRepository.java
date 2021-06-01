/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.repository.repository.medical.MedicalRepository
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 02.06.21, 00:04
 *  * @Version MedicalRepository.java : 1.0
 *
 */

package edu.coursework.zoo.repository.medical;

import edu.coursework.zoo.model.Medical;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalRepository extends MongoRepository<Medical, String> {
}
