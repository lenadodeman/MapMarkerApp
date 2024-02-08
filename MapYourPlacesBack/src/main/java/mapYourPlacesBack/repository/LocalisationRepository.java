package mapYourPlacesBack.repository;

import mapYourPlacesBack.entity.Localisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalisationRepository extends JpaRepository<Localisation, Long> {
}
