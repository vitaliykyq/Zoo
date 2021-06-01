/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.repository.repository.nutrition.NutritionRepository
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 02.06.21, 00:04
 *  * @Version NutritionRepository.java : 1.0
 *
 */

package edu.coursework.zoo.repository.nutrition;

import edu.coursework.zoo.model.Nutrition;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutritionRepository extends MongoRepository<Nutrition, String> {
}
