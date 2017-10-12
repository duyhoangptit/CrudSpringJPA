package vn.cruddata.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.cruddata.entities.UserDto;

/**
 * Created by hoangtd on 10/12/2017.
 */
public interface UserRepository extends JpaRepository<UserDto, Integer> {

    UserDto findById(Integer id);


}
