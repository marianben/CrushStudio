package crushstudio.crush_studio.repository;

import crushstudio.crush_studio.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

    Optional<User> findByEmail(String Email);
    Optional<User> findByNickname(String nickName);
    Optional<User> findByLocalDate(LocalDate localDate);
}
