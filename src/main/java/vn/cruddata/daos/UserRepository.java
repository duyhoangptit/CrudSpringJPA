package vn.cruddata.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.cruddata.entities.UserDto;

import java.util.List;

/**
 * Created by hoangtd on 10/12/2017.
 * Query name in jpa
 */
public interface UserRepository extends JpaRepository<UserDto, Integer> {

    @Query("SELECT user FROM UserDto user WHERE user.email = :email")
    List<UserDto> findUserByEmail(@Param("email") String email);
}
