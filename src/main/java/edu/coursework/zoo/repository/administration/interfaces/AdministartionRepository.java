/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.repository.repository.administration.interfaces.AdministartionRepository
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 02.06.21, 00:04
 *  * @Version AdministartionRepository.java : 1.0
 *
 */

package edu.coursework.zoo.repository.administration.interfaces;

/*
    @author:    Inessa
    @project:    Zoo 
    @class:    IAdministrationService 
    @version:    1.0.0 
    @since:    14.04.2021     
*/

import edu.coursework.zoo.model.Administration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministartionRepository extends MongoRepository<Administration, String> {

}
