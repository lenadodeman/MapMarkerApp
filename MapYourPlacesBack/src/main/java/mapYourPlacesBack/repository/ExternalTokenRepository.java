package mapYourPlacesBack.repository;

import mapYourPlacesBack.entity.ExternalToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExternalTokenRepository extends JpaRepository<ExternalToken, Long> {
}
