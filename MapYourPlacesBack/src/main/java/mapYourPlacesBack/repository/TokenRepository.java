package mapYourPlacesBack.repository;

import mapYourPlacesBack.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
}
