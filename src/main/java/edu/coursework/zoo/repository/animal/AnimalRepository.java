/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.repository.repository.animal.AnimalRepository
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 02.06.21, 00:04
 *  * @Version AnimalRepository.java : 1.0
 *
 */

package edu.coursework.zoo.repository.animal;

import edu.coursework.zoo.model.Animal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends MongoRepository<Animal, String> {
    public List<Animal> findAllByKindIs (String kind);
    public List<Animal> findAllByYearIs (int year);

    public List<Animal> findAllByWeightIs (double weight);
    public List<Animal> findAllByHeightGreaterThanEqual (double height);
    public List<Animal> findAllByWeightGreaterThanEqual (double weight);
    public List<Animal> findAllByHeightLessThanEqual (double height);
    public List<Animal> findAllByWeightLessThanEqual (double weight);

}
