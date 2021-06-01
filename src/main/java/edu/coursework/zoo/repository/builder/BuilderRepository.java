/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.repository.repository.builder.BuilderRepository
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 02.06.21, 00:04
 *  * @Version BuilderRepository.java : 1.0
 *
 */

package edu.coursework.zoo.repository.builder;

import edu.coursework.zoo.model.Builder;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuilderRepository extends MongoRepository<Builder, String> {
}
