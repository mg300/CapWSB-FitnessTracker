package pl.wsb.fitnesstracker.user.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.wsb.fitnesstracker.user.api.User;


import java.util.List;
import java.util.Optional;

@Repository("iUserRepository")
public interface UserRepository extends JpaRepository<User, Long> {
//    Optional<User> findByEmail(String email);
    List<User> findByLastName(String lastName);
    @Query("SELECT u FROM User u WHERE u.email = :email")
    User findByEmail(@Param("email") String email);

}