package ro.rarom.aplicatiedot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.rarom.aplicatiedot.entity.CereriClientiEntity;

public interface OmologariRepository extends JpaRepository<CereriClientiEntity, Integer> {
}
