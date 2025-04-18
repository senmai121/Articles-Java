package article.article;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

//Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
 Optional<Users> findByUsername(String username);
}

